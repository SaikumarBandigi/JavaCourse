package _8series;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}
}

class Bank extends Employee {

	double amount;

	public Bank(int id, String name, double amount) {
		super(id, name);
		this.amount = amount;
	}

	public void count() {
		System.out.println(id + " " + name + " " + amount);
	}

}

public class Practise1 {
	public static void main(String[] args) {

		Bank b = new Bank(1, "sai", 18000.0123456789);
		b.count();

	}
}
