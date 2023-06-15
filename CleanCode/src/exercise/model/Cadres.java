package exercise.model;

public class Cadres {
    static final int MALE =1;
    static final int FEMALE =2;
    static final int OTHER =3;
    String name;
    String age;
    int gender;
    String address;

    public Cadres(){}
    public Cadres(String name, String age, int gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        switch (gender){
            case 1:
                return "Male";
            case 2:
                return "Female";
            case 3:
                return "Other";
        }
        return "";
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Can bo: " +
                "name='" + this.getName() + '\'' +
                ", age='" + this.getAge() + '\'' +
                ", gender=" + this.getGender()+
                ", address='" + this.getAddress() + '\'';
    }
}
