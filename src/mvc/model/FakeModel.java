package mvc.model;

import mvc.bean.User;

import java.util.ArrayList;
import java.util.Arrays;

public class FakeModel implements Model{ //модель для тестирования

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(new ArrayList<>(Arrays.asList(
                new User("A", 1, 1),
                new User("B", 2, 1)
        )));
    }
}