package Model.Manage;

import Model.BaseClass.ReadWriteFile;
import Model.BaseClass.User;

import java.util.HashMap;
import java.util.Map;

public class UsersManage implements Manage<User>{
    static Map<String, User> users;
    ReadWriteFile readWriteFile = new ReadWriteFile();

    public UsersManage() { users = readWriteFile.readDataUser(); }


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
        users.put(user.getUserName(),user);
        readWriteFile.writeUserData(users);
    }
}
