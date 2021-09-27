package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.entities.Post;
import com.gruposei.gestion_orquestas.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){


        return postRepository.findAll();
    }


    public void insert(Post post) {

        postRepository.save(post);
    }
}
