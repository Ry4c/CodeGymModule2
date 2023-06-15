package Exsercise;

public class Dog extends Animal{
    String furColor;
    String type;

    Dog(){}

    public Dog(String furColor, String type) {
        this.furColor = furColor;
        this.type = type;
    }

    public Dog(String name, String birthday, String furColor, String type) {
        super(name, birthday);
        this.furColor = furColor;
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println("go go");
    }
}
