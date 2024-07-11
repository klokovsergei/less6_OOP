package less6_homework.service;

import less6_homework.model.User;

public class UserService {
    public void save(User user){
        new Persister(user).save();
    }

    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
    public User createUser(String name){
        return new User(name);
    }
}
