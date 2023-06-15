package Exsercise;

public class Cat extends Animal{
     String eyeColor;
     String type;
     boolean isSick;

    Cat(){}

    public Cat(String eyeColor, String type, boolean isSick) {
        this.eyeColor = eyeColor;
        this.type = type;
        this.isSick = isSick;
    }

    public Cat(String name, String birthYear, String eyeColor, String type, boolean isSick) {
        super(name, birthYear);
        this.eyeColor = eyeColor;
        this.type = type;
        this.isSick = isSick;
    }

    public void cure(int number){
        this.isSick = false;
    }
    public void cure (String name, int quantity){
        this.isSick = false;
    }
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
