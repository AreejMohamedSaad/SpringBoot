package com.h2demorest.demoh2rest.controller;

import com.h2demorest.demoh2rest.models.User;
import com.h2demorest.demoh2rest.services.UsersInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.provider.certpath.OCSPResponse;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UsersInterface usersInterface ;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(usersInterface.getAllUsers());
    }

    @GetMapping("/getUserByID/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable long id){
        return ResponseEntity.ok(usersInterface.getUserById(id));
    }

    @PostMapping("/createUsers")
    public ResponseEntity<List<User>> createUsers(@RequestBody List<User> users){
        return  ResponseEntity.ok(usersInterface.createUsers(users));
    }
    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return  ResponseEntity.ok(usersInterface.createUser(user));
    }
    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return  ResponseEntity.ok(usersInterface.updateUser(user));
    }
    @DeleteMapping("/deleteUser/{id}")
    public HttpStatus deleteUser(@PathVariable long id){
        usersInterface.deleteUser(id);
        return HttpStatus.OK;}
}
