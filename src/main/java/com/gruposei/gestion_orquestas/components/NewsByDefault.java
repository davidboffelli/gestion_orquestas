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

        New n1 = new New();
        n1.setTitle("Victoria Aplastante");
        n1.setBody("Argentina goleó a Uruguay 3 a 0. Ganó, gustó y goleó.");
        n1.setPublicDate(new Date(System.currentTimeMillis()));
        n1.setAuthor(userService.findByUsername("admin").get());
        n1.setEnabled(true);
        newService.create(n1);

        New n2 = new New();
        n2.setTitle("Empates");
        n2.setBody("Tanto el Banalla como el Bojo empataron en sus respectivos partidos contra los equipos de La Plata");
        n2.setPublicDate(new Date(System.currentTimeMillis()));
        n2.setAuthor(userService.findByUsername("admin").get());
        n2.setEnabled(true);
        newService.create(n2);

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
