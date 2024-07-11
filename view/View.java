package less6_homework.view;

import less6_homework.controller.UserController;
import less6_homework.model.User;

public class View {
    public static void start(){
        UserController controller = new UserController();
        User user = controller.createUser("Bob");
        controller.save(user);
        controller.report(user);

    }
}
