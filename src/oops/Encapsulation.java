package oops;


class Encap
{
	private String Empname;
	private int Empid;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	
}



public class Encapsulation {

	public static void main(String[] args) {
		Encap ob=new Encap();
		ob.setEmpid(101);
		ob.setEmpname("abc");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());

	}

}
