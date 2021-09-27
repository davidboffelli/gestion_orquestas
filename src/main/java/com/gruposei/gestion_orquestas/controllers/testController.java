package com.gruposei.gestion_orquestas.controllers;

import com.gruposei.gestion_orquestas.entities.Post;
import com.gruposei.gestion_orquestas.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class testController {

    @Autowired
    private PostService postService;


//    @GetMapping(value = "/")
//    public String index(){
//
//        return "Aguante el gruposei";
//    }

    @GetMapping(value = "/posts")
    public List<Post> posts(){


        return postService.getAllPosts();
    }

    @PostMapping(value = "/post")
    public void publishPost(@RequestBody Post post){

        if(post.getDateCreated() == null)
            post.setDateCreated(new Date());

        postService.insert(post);
    }
}
