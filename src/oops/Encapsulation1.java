package oops;

public class Encapsulation1 {
	public static void main(String[] args) {

		A a = new A();
		a.setId(1);
		a.setName("Bandigi");

		int i = a.getId();
		String s = a.getName();

		System.out.println(s);
		System.out.println(i);
	}

}

class A {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}