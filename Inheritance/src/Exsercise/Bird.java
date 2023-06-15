package Exsercise;

public class Bird extends Animal{
    boolean isLongNeb;
    boolean canFly;
    String type;

    Bird(){}

    public Bird(boolean isLongNeb, boolean canFly, String type) {
        this.isLongNeb = isLongNeb;
        this.canFly = canFly;
        this.type = type;
    }

    public Bird(String name, String birthYear, boolean isLongNeb, boolean canFly, String type) {
        super(name, birthYear);
        this.isLongNeb = isLongNeb;
        this.canFly = canFly;
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println("Caw caw");
    }
}
