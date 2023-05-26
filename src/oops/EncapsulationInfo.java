package oops;

/*
 * Encapsulation is binding data(variables & methods) together in an Single Entity.
 * 
 * object knows something(variable) and object does something(method).
 * 
 * whenever you create an object the variable should be linked with the method.
 * In order to change data(values) of your variables we should use method.
 * To set the value we should use setters and to get the value we should use getters method.
 * 
 * we should never directly set the variable's value with the object.
 * we should define variables as private. it can't be accessed outside the class.
 * we should define methods as public for setters & getters methods, with the help of methods we can do it. 
 */

public class EncapsulationInfo {
	public static void main(String[] args) {

		Sai s = new Sai();
		s.setEmpid(1);

		s.setEname("sai kumar bandigi");

		System.out.println(s.getEmpid());
		System.out.println(s.getEname());

	}

}

class Sai {

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	private int empid;
	private String ename;

}