package controllers;

import models.User;
import services.UserListService;

import java.util.List;

public class UserListController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsersList() {
        List<User> usersList = UserListService.getUserList();
        return usersList;
    }
}
