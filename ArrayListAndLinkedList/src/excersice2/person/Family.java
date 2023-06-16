package excersice2.person;

import java.util.ArrayList;

public class Family {
    private String name;
    static ArrayList<Person> family;
    public Family(String name){
        this.name = name;
        family = new ArrayList<Person>();

    }
    public void addPerson(Person person){
        family.add(person);
    }
    public ArrayList<Person> getFamily(){return family;}
}
