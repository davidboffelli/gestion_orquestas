package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Imagen;
import com.gruposei.gestion_orquestas.responses.ApiRequestException;
import com.gruposei.gestion_orquestas.responses.ResponseHandler;
import com.gruposei.gestion_orquestas.service.CloudinaryService;
import com.gruposei.gestion_orquestas.service.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cloudinary")
@CrossOrigin
public class CloudinaryREST {

    @Autowired
    private CloudinaryService cloudinaryService;

    @Autowired
    private ImagenService imagenService;

    @Autowired
    private ResponseHandler responseHandler;

    @GetMapping
    public ResponseEntity<List<Imagen>> list(){

        List<Imagen> list = imagenService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> upload(@RequestParam MultipartFile multipartFile)throws IOException {

        BufferedImage bi = ImageIO.read(multipartFile.getInputStream());

        if(bi == null){

            throw  new ApiRequestException("010");
        }

        Map result = cloudinaryService.upload(multipartFile);
        Imagen imagen =
                new Imagen((String)result.get("original_filename"),
                        (String)result.get("url"),
                        (String)result.get("public_id"));
        imagenService.save(imagen);

        return responseHandler.generateResponse("000",imagen);
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<?> delete(@RequestParam("id") int id)throws IOException {

        if(!imagenService.exists(id))
            throw  new ApiRequestException("011");

        Imagen imagen = imagenService.getOne(id).get();
        Map result = cloudinaryService.delete(imagen.getImagenId());
        imagenService.delete(id);
        return responseHandler.generateResponse("000",imagen);
    }
}