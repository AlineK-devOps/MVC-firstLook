package mvc.model;

public interface Model {
    ModelData getModelData(); //возможность получать данные для отображения
    void loadUsers(); //инициализация списка пользователей
    void loadDeletedUsers(); //список удаленных пользователей
    void loadUserById(long id); //загрузить активного пользователя по id
    void deleteUserById(long id); //удалить пользователя по id
    void changeUserData(String name, long id, int level); //обновление пользователя
}
