package controllers;

import models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

import java.util.List;

@RestController("/users")
public class UserController {

    @GetMapping
    @ResponseBody
    public List<User> getUsersList() {
        List<User> usersList = UserService.getUsersList();
        return usersList;
    }
}
