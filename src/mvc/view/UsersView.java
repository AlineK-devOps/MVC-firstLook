package mvc.view;

import mvc.controller.Controller;
import mvc.model.ModelData;
import mvc.bean.User;

public class UsersView implements View { //Отображает список пользователей на экран
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) { //выводит пользователей на экран
        String listName = modelData.isDisplayDeletedUserList()? "All deleted users:" : "All users:";
        System.out.println(listName);
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

    public void fireEventShowDeletedUsers(){
        controller.onShowAllDeletedUsers();
    }
}
