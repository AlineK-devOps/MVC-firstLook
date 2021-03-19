package mvc.model;

import mvc.bean.User;
import mvc.model.service.UserService;
import mvc.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model { //основная модель
    private UserService userService = new UserServiceImpl();
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());
    }

    public void loadDeletedUsers(){
        modelData.setDisplayDeletedUserList(true);
        modelData.setUsers(userService.getAllDeletedUsers());
    }

    public void loadUserById(long id){
        User user = userService.getUsersById(id);
        modelData.setActiveUser(user);
    }

    public void deleteUserById(long id){
        userService.deleteUser(id);
        loadUsers();
    }

    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name, id, level);
        loadUsers();
    }

    private List<User> getAllUsers(){
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));
    }
}