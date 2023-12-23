package _17_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 25)
        );

        // Group people by age
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(peopleByAge);
        // Output: {25=[Person{name='Alice', age=25}, Person{name='Charlie', age=25}], 30=[Person{name='Bob', age=30}]}
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
