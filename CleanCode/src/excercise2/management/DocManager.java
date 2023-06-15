package excercise2.management;

import excercise2.model.Book;
import excercise2.model.Document;
import excercise2.model.Magazine;
import excercise2.model.Newspaper;

import java.util.Arrays;

public class DocManager {
    private static int index = -1;
    private static Document[] documents;
    public DocManager(){
        documents = new Document[0];
    }
    public void addDoc(Document document){
        if (checkId(document)) {
            documents = Arrays.copyOf(documents,documents.length+1);
            documents[documents.length-1] = document;
            System.out.println("them thanh cong");
        }else {
            System.out.println("Trung Id vui long kiem tra lai!");
        }
    }
    public void delDoc (String id){
        index = getIndexById(id);
        if (index>-1){
            for (int i = index; i < documents.length; i++) {
                documents[i] = documents[i+1];
                documents = Arrays.copyOf(documents, documents.length-1);
            }
            System.out.println("xoa thanh cong");
        }else System.out.println("khong tim thay id nay");

    }
    private int getIndexById(String id){
        for (int i = 0; i < documents.length; i++) {
            if (documents[i].getId().equals(id)){ return i;}
        }
        return -1;
    }
    public void showDoc(String id){
        for (Document a:documents) {
            if (a.getId().contains(id))
                System.out.println(a.toString());
        }
    }
    public void showBook(){
        for (Document a : documents) {
            if (a instanceof Book){
                System.out.println(a.toString());
            }
        }
    }
    public void showMagazine(){
        for (Document a : documents) {
            if (a instanceof Magazine){
                System.out.println(a.toString());
            }
        }
    }
    public void showNewspaper(){
        for (Document a : documents) {
            if (a instanceof Newspaper){
                System.out.println(a.toString());
            }
        }
    }
    public boolean checkId(Document document){
        for (Document a: documents) {
            if(a.getId().equals(document.getId())){
                return false;
            }
        }
        return true;
    }
}
