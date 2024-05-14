package oops;

public class Employee {
	String empname;   //instance variable
	int empid;
	public Employee(String empname,int empid)
	{
	this.empname=empname;
	this.empid=empid;       //constructor
	}

	public static void main(String[] args) {
		
		{
			Employee emp1=new Employee("abc",101);//object creation
					System.out.println(emp1.empid);
					System.out.println(emp1.empname);
		}
		

	}

}
