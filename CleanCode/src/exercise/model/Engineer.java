package exercise.model;

public class Engineer extends Cadres {
    private String majors;

    public Engineer(String majors) {
        this.majors = majors;
    }

    public Engineer(String name, String age, int gender, String address, String majors) {
        super(name, age, gender, address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return super.toString() +" \tchuyen nganh: "
                +this.majors;
    }
}
