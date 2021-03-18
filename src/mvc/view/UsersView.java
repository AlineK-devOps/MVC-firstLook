package mvc.view;

import mvc.controller.Controller;
import mvc.model.ModelData;
import mvc.bean.User;

public class UsersView implements View { //Отображает список пользователей на экран
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) { //выводит пользователей на экран
        System.out.println("All users:");
        for (User user : modelData.getUsers()){
            System.out.println("\t" + user.toString());
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers(){ //эмулирует событие клиента
        controller.onShowAllUsers();
    }
}