package model.manage;

import model.base_class.ReadWriteFile;
import model.base_class.User;

import java.util.Map;

public class UsersManage implements Manage<User> {
    static ReadWriteFile readWriteFile = new ReadWriteFile();
    private static Map<String, User> users = readWriteFile.readDataUser();

    public UsersManage() {
        users = readWriteFile.readDataUser();
    }


    @Override
    public void addNew(User user) {
        users.put(user.getUserName(), user);
        readWriteFile.writeUserData(users);
    }

    @Override
    public void delete(String id) {
        users.remove(id);
        readWriteFile.writeUserData(users);
    }

    @Override
    public void edit(User user) {
        users.put(user.getUserName(), user);
        readWriteFile.writeUserData(users);
    }

    public boolean isUserExist(String username) {
        if (users.get(username) == null) return false;
        return true;
    }

    public Map<String, User> getUsers() {
        return users;
    }
}
