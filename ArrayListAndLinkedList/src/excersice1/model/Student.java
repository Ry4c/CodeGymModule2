package excersice1.model;

public class Student {
    private String candidateNum;
    private String name;
    private String address;
    private int priorityLevel;
    private int block;
    private static final int BLOCK_A = 1;
    private static final int BLOCK_B = 2;
    private static final int BLOCK_C = 3;

    public String getBlock() {
        switch (block){
            case 1:
                return "khoi A";
            case 2:
                return "Khoi B";
            case 3:
                return "khoi C";
        }
        return "";
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public Student(String candidateNum, String name, String address, int priorityLevel, int block) {
        this.candidateNum = candidateNum;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.block = block;
    }

    public String getCandidateNum() {
        return candidateNum;
    }

    public void setCandidateNum(String candidateNum) {
        this.candidateNum = candidateNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Student: " +
                "so bao danh='" + candidateNum + '\'' +
                ", ten='" + name + '\'' +
                ", dia chi='" + address + '\'' +
                ", muc uu tien=" + priorityLevel +
                ", Khoi thi=" + this.getBlock();
    }
}
