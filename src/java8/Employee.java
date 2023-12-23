package java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // getCountOfMaleFemale(employeeList);
        // getDeptName(employeeList);
        // getGender(employeeList);
        //getNameOfEmpAfter2015(employeeList);
        // countByDept(employeeList);
        //  seniorEmp(employeeList);
        ageGreaterThan35(employeeList);
    }

    public static void getCountOfMaleFemale(List<Employee> employeeList) {
        Map<String, Long> noOfMaleAndFemaleEmployees =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
    }

    public static void getDeptName(List<Employee> employeeList) {

        Function<Employee, String> function = Employee::getDepartment;

        employeeList.stream().map(function).distinct().forEach(System.out::println);
    }

    public static void getGender(List<Employee> employeeList) {
        // Filter employees based on gender
        Map<String, Double> averageAgeByGender =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        // Print average age for each gender
        averageAgeByGender.forEach((gender, averageAge) -> System.out.println("Average Age of " + gender + " Employees: " + averageAge));

    }

    public static void getNameOfEmpAfter2015(List<Employee> employeeList) {

        employeeList.stream().filter(i -> i.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

    }

    public static void countByDept(List<Employee> employeeList) {
        Map<String, Long> countByDept =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = countByDept.entrySet();

        for (Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void seniorEmp(List<Employee> employeeList) {

        ToIntFunction<Employee> function = Employee::getYearOfJoining;

        Optional<Employee> seniorEmp =
                employeeList.stream().min(Comparator.comparingInt(function));

        if (seniorEmp.isPresent()) {
            System.out.println(seniorEmp);
        }
    }

    public static void ageGreaterThan35(List<Employee> employeeList) {

        Function<Employee, String> function = Employee::getName;

        employeeList.stream().filter(employee -> employee.getAge() > 30).map(function).forEach(System.out::println);
    }


}