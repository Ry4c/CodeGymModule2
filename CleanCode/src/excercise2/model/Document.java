package excercise2.model;

public class Document {
    private String id;
    private String publishing;
    private int quantity;
     Document(){

     }

    public Document(String id, String publishing, int quantity) {
        this.id = id;
        this.publishing = publishing;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Document:" +
                "id='" + id + '\'' +
                ", publishing='" + publishing + '\'' +
                ", quantity=" + quantity;
    }
}
