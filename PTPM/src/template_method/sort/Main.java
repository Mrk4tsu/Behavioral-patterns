package template_method.sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product1 = new Product("Áo", 1500, 2);
        Product product2 = new Product("Quần", 1200, 5);
        Product product3 = new Product("Bàn", 800, 5);
        Product product4 = new Product("Mũ", 500, 5);
        Product product5 = new Product("Kính", 1100, 5);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

//        SortCollection<Product> collection = new SortByName();
        SortCollection<Product> collection = new SortByPrice();
        collection.sort(list);
        System.out.println(list.toString());
    }
}
