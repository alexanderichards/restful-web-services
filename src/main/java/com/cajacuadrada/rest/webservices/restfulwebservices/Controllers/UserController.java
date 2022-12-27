package com.cajacuadrada.rest.webservices.restfulwebservices.Controllers;

import com.cajacuadrada.rest.webservices.restfulwebservices.Models.User;
import com.cajacuadrada.rest.webservices.restfulwebservices.Services.UserDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> getUsers(){
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable  int id){
        return userDaoService.findOne(id);
    }

}
