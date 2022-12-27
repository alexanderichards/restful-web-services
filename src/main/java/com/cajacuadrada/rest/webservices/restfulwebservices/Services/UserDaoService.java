package com.cajacuadrada.rest.webservices.restfulwebservices.Services;

import com.cajacuadrada.rest.webservices.restfulwebservices.Models.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Antony", 45, LocalDate.now().minusYears(45)));
        users.add(new User(2, "Alex", 35, LocalDate.now().minusYears(35)));
        users.add(new User(3, "Juna", 20, LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().get();
    }

}
