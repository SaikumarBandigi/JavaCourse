package _8series;

//class Animal

//{  
//String color="white";  
//}  
//
//class Dog extends Animal
//{  
//	
//String color="black"; 
//
//void printColor()
//{  
//	
//System.out.println(color);//prints color of Dog class  
//System.out.println(super.color);//prints color of Animal class  
//
//}  
//}  
//
//public class TestSuper1
//{  
//public static void main(String args[]){
//	
//Dog d=new Dog();  
//d.printColor(); 
//
//}}  

//class Animal {
//	void eat() {
//		System.out.println("eating...");
//	}
//}
//
//class Dog extends Animal {
//	void eat() {
//		System.out.println("eating bread...");
//	}
//
//	void bark() {
//		System.out.println("barking...");
//	}
//
//	void work() {
//		super.eat();
//		eat();
//		bark();
//	}
//}
//
//public class TestSuper1 {
//	public static void main(String args[]) {
//		Dog d = new Dog();
//		d.work();
//	}
//}

//class Animal {
//	Animal() {
//		System.out.println("animal is created");
//	}
//}
//
//class Dog extends Animal {
//	Dog() {
//    super();
//		System.out.println("dog is created");
//	}
//}
//
//public class TestSuper1 {
//	public static void main(String args[]) {
//		Dog d = new Dog();
//	}
//}

class Animal {
	Animal() {
		System.out.println("animal is created");
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println("dog is created");
	}
}

public class TestSuper1 {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}