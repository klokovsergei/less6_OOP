package less6_homework.service;

import less6_homework.model.User;

public class Persister{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
