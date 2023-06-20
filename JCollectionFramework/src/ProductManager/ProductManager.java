package ProductManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ProductManager {
    ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int checkId(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    public void delByID(int id) {
        if (checkId(id) != -1) {
            products.remove(checkId(id));
        }
    }

    public Product searchId(int id) {
        if (checkId(id) != -1)
            return products.get(checkId(id));
        return null;
    }
    public ArrayList<Product> getAll(){
        return products;
    }

    Comparator<Double> comparatorUp = new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return (int) (o1 - o2);
        }
    };

    public Map sortUp() {
        Map<Double, Product> priceSortUp = new TreeMap<>(comparatorUp);
        for (Product product : products) {
            priceSortUp.put(product.getCost(), product);

        }
        return priceSortUp;
    }
    Comparator<Double> comparatorDown = new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return (int) (o2 - o1);
        }
    };

    public Map sortDown() {
        Map<Double, Product> priceSortDown = new TreeMap<>(comparatorDown);
        for (Product product : products) {
            priceSortDown.put(product.getCost(), product);

        }
        return priceSortDown;
    }


}
