package keywords;

class Student {
	int rollno;
	String name, course;
	float fee;

	Student(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor

		this.fee = fee;
	}

	void display() {

		if (rollno != 0 && name != null && course != null)
			
			if (rollno != 0 && name != null && course != null && fee != 0)
				
				System.out.println(rollno + " " + name + " " + course + " " + fee);
			else
				System.out.println(rollno + " " + name + " " + course);
		else

			System.out.println("sai");
	}
}

public class TestThis7 {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", "java");
		Student s2 = new Student(112, "sumit", "java", 6000f);

		s1.display();
		s2.display();
	}
}