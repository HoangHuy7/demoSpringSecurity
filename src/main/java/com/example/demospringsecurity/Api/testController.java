package com.example.demospringsecurity.Api;


import com.example.demospringsecurity.Enitity.User;
import com.example.demospringsecurity.Security.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
public class testController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin")
    public String admin() {
        return "admin will look this";
    }

    @GetMapping("/client")
    public String client() {
        return "client will look this";
    }

    @GetMapping("/index")
    public String index() {
        return "home will look this";
    }

    @GetMapping("/list")
    public ResponseEntity<String> findAll() {
        List<User> users = userRepository.findAll();
        String s = users.get(0).getEmail() + users.get(0).getPassword() +"\n" + users.get(1).getEmail() + users.get(1).getPassword();
        return ResponseEntity.ok(s);
    }
}
