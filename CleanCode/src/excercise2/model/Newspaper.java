package excercise2.model;

public class Newspaper extends Document{
    String releaseDay;
    Newspaper(){}

    public Newspaper(String id, String publishing, int quantity, String releaseDay) {
        super(id, publishing, quantity);
        this.releaseDay = releaseDay;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return super.toString() +
                " releaseDay='" + releaseDay + '\'' +
                " type: 'newspaper'";
    }
}
