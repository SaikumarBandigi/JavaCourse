package _8series;

class Student {
	int id;
	String name;

	public Student(int i, String n) {
		id = i;
		name = n;
	}

	public void show() {
		System.out.println(id + " " + name);
	}

}

public class ThisKeyword {
	public static void main(String[] args) {

		Student s = new Student(1, "Ratna");
		s.show();

	}
}
