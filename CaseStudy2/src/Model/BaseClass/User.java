package Model.BaseClass;

public class User {
    private String userName;
    private String password;
    private int accessLevel;

    public User(String userName, String password, int accessLevel) {
        this.userName = userName;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getUserName() {
        return userName;
    }

    public String getPsw() {
        return password;
    }

    public void setPsw(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }
}
