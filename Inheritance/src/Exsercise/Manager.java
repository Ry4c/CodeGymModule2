package Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    static int index = 0;
    static Animal[] animal = new Animal[10];
    public static Object[] checkLength(){
        if( index < animal.length) {
            return animal;
        }else {
            Animal[] newAnimal = new Animal[animal.length+10];
            System.arraycopy(animal, 0 , newAnimal, 0, animal.length);
            return newAnimal;
        }
    }
    public static void addDog(String name, String birthday, String furColor, String type){
        Dog dog1 = new Dog(name, birthday, furColor, type);
        index++;
        checkLength();
        animal[index] = dog1;
    }
    public static void addCat(String name, String birthYear, String eyeColor, String type, boolean isSick){
        Animal cat1 = new Cat(name, birthYear, eyeColor, type, isSick);
        index++;
        checkLength();
        animal[index] = cat1;
    }
    public static void addBird(boolean isLongNeb, boolean canFly, String type){
        Animal bird1 = new Bird(isLongNeb, canFly, type);
        index++;
        checkLength();
        animal[index] = bird1;
    }
    public static Animal[] delAnimal(String id){
        boolean flag = false;
        int index = -1;
        for (int i=0; i< animal.length; i++) {
            if (animal[i].id == id){
                flag =true;
                index= i;
            }
        }
        if (!flag){
            System.out.println("Khong co id nay");
            return animal;
        } else {
            for(int i = index; i < Animal.count; i++){
                if (i< index){
                    animal[i] = animal[i+1];
                }
            }
            animal[Animal.count] = null;
            Animal.count --;
            Manager.index --;
            System.out.println("xoa thanh cong");
            return animal;
        }
    }
    public static Animal[] editAnimal(String id){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int index = -1;
        for (int i=0; i< animal.length; i++) {
            if (animal[i].id == id){
                flag =true;
                index= i;
            }
        }
        if (!flag){
            System.out.println("khong tim thay ong vat nay");
            return animal;
        }else {
            if (animal[index]  instanceof Dog){
                System.out.println("nhap ten");
                animal[index].name= scanner.nextLine();
                System.out.println("nhap nam sinh");
                animal[index].birthYear= scanner.nextLine();
                System.out.println("nhap mau long");
                ((Dog) animal[index]).furColor= scanner.nextLine();
                System.out.println("nhap loai cho");
                ((Dog) animal[index]).type= scanner.nextLine();
            } else if (animal[index] instanceof Cat) {
                System.out.println("nhap ten");
                animal[index].name= scanner.nextLine();
                System.out.println("nhap nam sinh");
                animal[index].birthYear= scanner.nextLine();
                System.out.println("nhap mau mat");
                ((Cat) animal[index]).eyeColor= scanner.nextLine();
                System.out.println("nhap loai meo");
                ((Cat) animal[index]).type= scanner.nextLine();
                System.out.println("meo co om khong?");
                System.out.println("1. co");
                System.out.println("2. khong");
                int input = scanner.nextInt();
                switch (input){
                    case 1:
                        ((Cat) animal[index]).isSick = true;
                        break;
                    default:
                        ((Cat) animal[index]).isSick = false;
                        break;
                }
            }else if (animal[index] instanceof Bird){
                System.out.println("nhap ten");
                animal[index].name= scanner.nextLine();
                System.out.println("nhap nam sinh");
                animal[index].birthYear= scanner.nextLine();
                System.out.println("chim co mo dai khong?");
                System.out.println("1. co");
                System.out.println("2. khong");
                int input = scanner.nextInt();
                switch (input){
                    case 1:
                        ((Bird) animal[index]).isLongNeb = true;
                        break;
                    default:
                        ((Bird) animal[index]).isLongNeb = false;
                        break;
                }
                System.out.println("chim co bay duoc khong?");
                System.out.println("1. co");
                System.out.println("2. khong");
                int input1 = scanner.nextInt();
                switch (input){
                    case 1:
                        ((Bird) animal[index]).canFly = true;
                        break;
                    default:
                        ((Bird) animal[index]).canFly = false;
                        break;
                }
                System.out.println("nhap loai chim");
                ((Bird) animal[index]).type= scanner.nextLine();
            }
        }
        return animal;
    }
}
