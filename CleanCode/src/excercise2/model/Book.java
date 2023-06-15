package excercise2.model;

public class Book extends Document{
    private String writer;
    private int numberOfPages;
    Book(){}

    public Book(String writer, int numberOfPages) {
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }


    public Book(String id, String publishing, int quantity, String writer, int numberOfPages) {
        super(id, publishing, quantity);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() +
                " writer='" + writer + '\'' +
                ", numberOfPages=" + numberOfPages +
                " type: 'book'";
    }
}
