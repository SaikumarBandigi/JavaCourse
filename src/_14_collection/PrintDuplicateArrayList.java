package _14_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* add method in set or list gives boolean true of false

so Since set doesnt take duplicate it gaves false

 */
public class PrintDuplicateArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("sai");
        names.add("prashu");
        names.add("ratna");
        names.add("raju");
        names.add("prashu");
        names.add("sai");


        // Set<String> set= new HashSet<>(names);

        Set<String> set = new HashSet<>();

        for (String name : names) {
            if (set.add(name) == false)
                System.out.println(name);
        }

    }
}
