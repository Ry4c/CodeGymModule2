package Model.BaseClass;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String className;

    public Student(String id, String name, String dateOfBirth, String address, String className) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student:" +
                "id='" + id + '\'' +
                ", ten='" + name + '\'' +
                ", ngay sinh='" + dateOfBirth + '\'' +
                ", dia chi='" + address + '\'';
    }
}
