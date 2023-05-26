package oops;

public class Inheritance1 {
	public static void main(String[] args) {

		AddSub obj = new AddSub();

		obj.num1 = 5;
		obj.num2 = 2;

		obj.sum();

		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);

	}
}

class Emp {

	int num1, num2, result;

	public void sum() {
		result = num1 + num2;
	}

}

class AddSub {

	int num1, num2, result;

	public void sum() {
		result = num1 + num2;
	}

	public void sub() {
		result = num1 - num2;
	}

}