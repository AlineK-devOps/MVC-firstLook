package controller;

import model.Model;
import view.UsersView;

public class Controller { //получает запросы от клиента и оповещает модель
    private Model model;
    private UsersView usersView;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }
}
