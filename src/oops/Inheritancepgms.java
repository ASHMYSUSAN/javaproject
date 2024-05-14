package oops;
class member
{
	String name;
	String address;
	int age;
	int phoneno;
	int salary;
	
	public void printdetails( )
	{
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("salary="+salary);

	}
	
}
class Employee2 extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}
public class Inheritancepgms {

	public static void main(String[] args) {
		
		Employee2 emp=new Employee2();
		emp.name="arya";
		emp.age=23;
		emp.phoneno=456886433;
		emp.salary=500000;
		emp.printdetails();
         System.out.println(emp.specialization="developing");
		manager mng=new manager();
		mng.name="anu";
		mng.age=27;
		mng.address="ghkkk";
		mng.phoneno=345677888;
		mng.salary=45000;
		mng.printdetails();
		System.out.println(mng.department="IT");
	}
	
	

}
