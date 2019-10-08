package fr.esir.jxc.controllers;

import fr.esir.jxc.models.User;
import fr.esir.jxc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {
    }

    @GetMapping
    @ResponseBody
    public List<User> getUsersList() {
        List<User> usersList = userService.getUsersList();
        //no control ??
        return usersList;
    }
}
