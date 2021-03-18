package mvc.model;

import mvc.model.service.UserService;
import mvc.model.service.UserServiceImpl;

public class MainModel implements Model { //основная модель
    private UserService userService = new UserServiceImpl();
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }
}