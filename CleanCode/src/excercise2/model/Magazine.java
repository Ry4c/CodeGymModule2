package excercise2.model;

public class Magazine extends Document{
    private String issueNumber;
    private int releaseMonth;
    Magazine(){}

    public Magazine(String issueNumber, int releaseMonth) {
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine(String id, String publishing, int quantity, String issueNumber, int releaseMonth) {
        super(id, publishing, quantity);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return super.toString() +
                " issueNumber='" + issueNumber + '\'' +
                ", month=" + releaseMonth +
                " type: 'magazine'";
    }
}
