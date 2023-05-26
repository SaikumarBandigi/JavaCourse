package controlStatements;

public class TernaryOperator {
	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//
//		if (a > b)
//			a = 30;
//		else
//			a = 15;
//
//		System.out.println(a);

		///////

//		int a = 10;
//		int b = 20;
////  condition
//		b = a > b ? 100 : 200;
//		System.out.println(b);

		//////

//		Object obj1;
//
//		if (true)
//			obj1 = new Integer(10);
//		else
//			obj1 = new Double(15.0);
//
//		System.out.println(obj1);

		///////
/// it checks both the values and takes higher value
		Object obj2;

		obj2 = true ? new Integer(10) : new Double(15.0);

		System.out.println(obj2);

	}

}
