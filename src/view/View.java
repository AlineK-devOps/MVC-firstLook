package view;

import controller.Controller;
import model.ModelData;

public interface View {
    void refresh(ModelData modelData); //обновить данные
    void setController(Controller controller); //установить котроллер
}
