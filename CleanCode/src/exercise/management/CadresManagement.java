package exercise.management;

import exercise.model.Cadres;
import exercise.model.Engineer;
import exercise.model.Staffs;
import exercise.model.Worker;

public class CadresManagement {
    private static Cadres[] cadres;
    static int countCadres = 0;
    static int index = -1;
    public void CadresManagement(){
        this.cadres= new Cadres[100];
    }

    public void addCadres(Cadres newCadres) {
        cadres[countCadres] = newCadres;
        countCadres++;
    }

    public int searchByName(String name) {
        for (int i = 0; i < countCadres; i++) {
            if (cadres[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayCadres(int index) {
        if (cadres[index] instanceof Worker) {
            System.out.println(((Worker) cadres[index]).toString());
        } else if (cadres[index] instanceof Engineer) {
            System.out.println(((Engineer) cadres[index]).toString());
        } else if (cadres[index] instanceof Staffs) {
            System.out.println(((Staffs) cadres[index]).toString());
        }
    }

    public void displaySearch(String name) {
        index = searchByName(name);
        if (index == -1) {
            System.out.println("Can't find this name!");
        } else {
            displayCadres(index);
        }
    }

    public void displayAll() {
        for (int i = 0; i < countCadres; i++) {
            displayCadres(i);
        }
    }
}
