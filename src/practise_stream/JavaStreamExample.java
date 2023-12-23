package practise_stream;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "sai", 10000f));
        products.add(new Product(2, "prashu", 20000f));
        products.add(new Product(3, "latha", 25000f));
        products.add(new Product(4, "pooja", 30000f));
        products.add(new Product(5, "karthika", 40000f));

        List<Float> floatList = new ArrayList<>();


//        for (Product p : products) {
//            if (p.price < 30000f) {
//                floatList.add(p.price);
//            }
//        }
//        System.out.println(floatList);


        products.stream().filter(p -> p.price < 30000f).map(p -> p.price).forEach(System.out::println);


    }
}