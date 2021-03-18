package mvc.model;

public interface Model {
    ModelData getModelData(); //возможность получать данные для отображения
    void loadUsers(); //инициализация списка пользователей
    void loadDeletedUsers(); //список удаленных пользователей
}
