package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.New;
import com.gruposei.gestion_orquestas.model.NewContent;
import com.gruposei.gestion_orquestas.model.NewContentType;
import com.gruposei.gestion_orquestas.service.NewContentService;
import com.gruposei.gestion_orquestas.service.NewContentTypeService;
import com.gruposei.gestion_orquestas.service.NewService;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

@Component
@Order(5)
public class NewsByDefault implements CommandLineRunner {

    @Autowired
    private NewService newService;

    @Autowired
    private NewContentTypeService newContentTypeService;

    @Autowired
    private NewContentService newContentService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {

        NewContentType newContentType1 = new NewContentType();
        newContentType1.setName("Video");
        newContentType1.setSystemName("video");
        newContentTypeService.create(newContentType1);

        NewContentType newContentType2 = new NewContentType();
        newContentType2.setName("Imágen");
        newContentType2.setSystemName("imagen");
        newContentTypeService.create(newContentType2);

        NewContentType newContentType3 = new NewContentType();
        newContentType3.setName("Texto");
        newContentType3.setSystemName("texto");
        newContentTypeService.create(newContentType3);

        String body;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        New n1 = new New();
        n1.setTitle("Gracias totales!");
        body = "Nuestro director de orquesta ha decidido desvincularse de nuestro equipo. Estamos eternamente agradecidos " +
                "por el esfuerzo y el trabajo realizado. Le deseamos los mayores éxitos en su nuevo proyecto. A la brevedad " +
                "informaremos cual será el último concierto en el que participará. Esten atentos! A despedirlo de la mejor manera";
        //body = "asdasd";
        n1.setBody(body);
        n1.setPublicDate(df.parse("01/05/2022"));
        n1.setAuthor(userService.findByUsername("damian").get());
        n1.setEnabled(true);
        newService.create(n1);

        New n2 = new New();
        n2.setTitle("Gran despedida");
        body = "Informamos que el show del próximo 31 de mayo en el teatro Astengo será el de despedida de nuestro director de orquesta.";
        n2.setBody(body);
        n2.setPublicDate(df.parse("10/05/2022"));
        n2.setAuthor(userService.findByUsername("damian").get());
        n2.setEnabled(true);
        newService.create(n2);

        New n3 = new New();
        n3.setTitle("Gira invierno 2022 confirmada!");
        body = "Confirmamos una nueva gira invernal que nos llevará a los lugares más recónditos del país, " +
               "entre los que están El Chaltén, Ushuaia, El Bolsón, Fiambalá y La Quiaca! Más adelante informaremos los detalles.";
        //body = "asdkkkkasd";
        n3.setBody(body);
        n3.setPublicDate(df.parse("25/05/2022"));
        n3.setAuthor(userService.findByUsername("damian").get());
        n3.setEnabled(true);
        newService.create(n3);

        byte[] bytes = Files.readAllBytes(Paths.get("images/fressi.jpg"));
        String img = Base64.getEncoder().encodeToString(bytes);

        NewContent newContent1 = new NewContent();
        newContent1.setNews(n1);
        newContent1.setNewContentType(newContentType2);
        newContent1.setContent(img);
        newContentService.create(newContent1);

        NewContent newContent2 = new NewContent();
        newContent2.setNews(n1);
        newContent2.setNewContentType(newContentType1);
        newContent2.setContent("https://www.youtube.com/watch?v=mnApD7lD2iY");
        newContentService.create(newContent2);

        bytes = Files.readAllBytes(Paths.get("images/feo.jpg"));
        img = Base64.getEncoder().encodeToString(bytes);

        NewContent newContent3 = new NewContent();
        newContent3.setNews(n2);
        newContent3.setNewContentType(newContentType2);
        newContent3.setContent(img);
        newContentService.create(newContent3);
    }
}
