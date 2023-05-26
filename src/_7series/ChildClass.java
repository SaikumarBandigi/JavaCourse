package _7series;

class ParentClass {
	private int value;

	public ParentClass() {
		System.out.println("ParentClass constructor without parameters");
	}

	public ParentClass(int value) {
		this.value = value;
		System.out.println("ParentClass constructor with value: " + value);
	}
}

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("ChildClass constructor without parameters");
	}

	public ChildClass(int value) {
		super(value);
		System.out.println("ChildClass constructor with value: " + value);
	}

	public static void main(String[] args) {

		ChildClass c = new ChildClass(1);

	}
}