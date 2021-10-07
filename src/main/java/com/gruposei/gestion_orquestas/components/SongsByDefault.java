package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.MusicalResource;
import com.gruposei.gestion_orquestas.model.Song;
import com.gruposei.gestion_orquestas.model.TypeMusicalResource;
import com.gruposei.gestion_orquestas.service.MusicalResourceService;
import com.gruposei.gestion_orquestas.service.SongService;
import com.gruposei.gestion_orquestas.service.TypeMusicalResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Component
public class SongsByDefault implements CommandLineRunner {

    @Autowired
    private SongService songService;

    @Autowired
    private TypeMusicalResourceService typeMusicalResourceService;

    @Autowired
    private MusicalResourceService musicalResourceService;

    @Override
    public void run(String... args) throws Exception {

        Song song1 = new Song();
        song1.setTitle("Ya es la hora, ya es la hora");
        song1.setAuthor("Los Guerreros");
        songService.create(song1);

        Song song2 = new Song();
        song2.setTitle("Canción a María");
        song2.setAuthor("Lépoka");
        songService.create(song2);

        Song song3 = new Song();
        song3.setTitle("No me hableeee");
        song3.setAuthor("Fútbol o Muerte");
        songService.create(song3);

        TypeMusicalResource typeMR1 = new TypeMusicalResource();
        typeMR1.setName("Texto");
        typeMusicalResourceService.create(typeMR1);

        TypeMusicalResource typeMR2 = new TypeMusicalResource();
        typeMR2.setName("Imagen");
        typeMusicalResourceService.create(typeMR2);

        TypeMusicalResource typeMR3 = new TypeMusicalResource();
        typeMR3.setName("Video");
        typeMusicalResourceService.create(typeMR3);

        String cancion = "\"Ya es la hora, ya es la hora\\nYa es la hora de alentar\\nEstamos todos hasta las bolas\\nY venimo a ve a central";
        cancion += "\n\nY vamo vamo lakd\nñul boton\nY vamo vamo lakd\nñul boton\nY vamo vamo lakd\nñul boton";
        cancion += "\nY vamo vamo lakdemia que tenemo que ganá!";

        MusicalResource musicalResource = new MusicalResource();
        musicalResource.setName("Letra");
        musicalResource.setDescription("La letra de la canción");
        musicalResource.setContent(cancion);
        musicalResource.setSong(song1);
        musicalResource.setTypeMusicalResource(typeMR1);
        musicalResourceService.create(musicalResource);

        byte[] bytes = Files.readAllBytes(Paths.get("d:/Descargas/losguerreros.jpg"));
        String img = Base64.getEncoder().encodeToString(bytes);

        MusicalResource musicalResource2 = new MusicalResource();
        musicalResource2.setName("La Hinchada");
        musicalResource2.setDescription("Imagen termo");
        musicalResource2.setContent(img);
        musicalResource2.setSong(song1);
        musicalResource2.setTypeMusicalResource(typeMR2);
        musicalResourceService.create(musicalResource2);

        MusicalResource musicalResource3 = new MusicalResource();
        musicalResource3.setName("Tamos rrrrrrrre locos");
        musicalResource3.setDescription("Video termo");
        musicalResource3.setContent("https://www.youtube.com/watch?v=6ITPQGFH_j8");
        musicalResource3.setSong(song1);
        musicalResource3.setTypeMusicalResource(typeMR3);
        musicalResourceService.create(musicalResource3);
    }

}
