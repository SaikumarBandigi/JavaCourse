package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 100));
        people.add(new Person("Bob", 200));
        people.add(new Person("Charlie", 300));

        AgeComparator ageComparator = new AgeComparator();

        // Sorting based on age using Comparator
        Collections.sort(people,ageComparator);

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }

    }

}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        // Compare based on age
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}

class Person {
    private String name;

    private int age;

    // Constructors, getters, and setters

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
