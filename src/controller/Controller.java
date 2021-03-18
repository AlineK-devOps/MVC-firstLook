package controller;

import model.Model;

public class Controller { //получает запросы от клиента и оповещает модель
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){
        model.loadUsers();
    }
}
