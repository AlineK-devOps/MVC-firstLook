package mvc.model;

import mvc.bean.User;

import java.util.List;

//объект, который будет хранить необходимые данные для отображения на клиенте
public class ModelData {
    private List<User> users; //список пользователей для отображения
    private User activeUser; //конкретный пользователь
    private boolean displayDeletedUserList; //список удаленный пользователей или всех

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
