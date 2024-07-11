package less6_homework.controller;

import less6_homework.model.User;
import less6_homework.service.UserService;

public class UserController {
    UserService service = new UserService();
    public void save(User user){
        service.save(user);
    }
    public void report(User user){
        service.report(user);
    }
    public User createUser(String name){
        return service.createUser(name);
    }
}
