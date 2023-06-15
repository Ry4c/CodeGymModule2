package exercise.model;

public class Worker extends Cadres {
    private int rank;
    public Worker() {
    }

    public Worker(int rank) {
        this.rank = rank;
    }

    public Worker(String name, String age, int gender, String address, int rank) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+ "\trank: "
                +this.rank;
    }
}
