package Exsercise;

public class Animal {
    static int count = 0;
    public String id;
    public String name;
    public String birthYear;
    Animal(){
        count ++;
        this.id = "animal" + count;
    }
    Animal(String name,String birthYear){
        count ++;
        this.id = "animal" + count;
        this.name = name;
        this.birthYear = birthYear;
    }
    public void makeSound(){
        System.out.println( "make this sound");
    }

}
