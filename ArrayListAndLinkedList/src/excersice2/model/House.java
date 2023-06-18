package excersice2.model;

import java.util.ArrayList;

public class House {
    static ArrayList<Family> house;
    public House(){
        house = new ArrayList<Family>();
    }
    public void addFamily(Family family){
        house.add(family);
    }
    public Family getFamily (int index){
        return house.get(index);
    }
    public ArrayList<Family> getHouse(){
        return house;
    }

    @Override
    public String toString() {
        String house = "house : \n";
        for (Family family : this.house) {
            house += family.toString();
        }
        return house;
    }
}

