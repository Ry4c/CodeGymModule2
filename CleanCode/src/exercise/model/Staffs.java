package exercise.model;

public class Staffs extends Cadres{
    private String job;

    public Staffs(String job) {
        this.job = job;
    }

    public Staffs(String name, String age, int gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + " Job: "+this.job;
    }
}
