package mvc.view;

import mvc.controller.Controller;
import mvc.model.ModelData;

public class EditUserView implements View{ //отображает конкретного пользователя на экран (редактируемого)
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
