package mvc;

import mvc.controller.Controller;
import mvc.model.FakeModel;
import mvc.model.Model;
import mvc.model.MainModel;
import mvc.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        //Model model = new FakeModel();
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
    }
}
