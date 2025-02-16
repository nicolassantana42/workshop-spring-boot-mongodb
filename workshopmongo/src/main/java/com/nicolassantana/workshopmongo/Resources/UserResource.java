package com.nicolassantana.workshopmongo.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolassantana.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User nicolas = new User("1", "Nicolas Santana", "nicolas@gmail.com");
        User bruno = new User("2", "Bruno Santos", "bruno@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(nicolas, bruno));
        return ResponseEntity.ok().body(list);
    }
}
