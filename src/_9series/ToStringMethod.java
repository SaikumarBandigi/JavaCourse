package _9series;

/*
 * when you are printing object by default it calls toSTring() method of
 *  Object class so we get hashcode of Object Class.
 *  
 * so,just override the toString() method in class with variables.
 * 
 * System.out.println(s.toString()); is same as System.out.println(s); it calls method of toString() from 
 * Object class.
 */

public class ToStringMethod {
	public static void main(String[] args) {

		Student s = new Student(1, "SONU");

		System.out.println(s.toString());

	}
}

class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}