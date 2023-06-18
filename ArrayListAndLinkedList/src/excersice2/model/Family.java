package excersice2.model;

import java.util.ArrayList;

public class Family {
    static ArrayList<Person> family;
    public Family(){
        family = new ArrayList<Person>();
    }
    public void addPerson(Person person){
        family.add(person);
    }
    public Person getPerson (int index){return family.get(index);}
    public ArrayList<Person> getFamily(){return family;}
    public String toString(){
        String family = "family : \n";
        for (Person person : this.family) {
            family+= person.toString();
        }
        return family;
    }
}
