package oops;


interface car
{
	public void enginespeed();
	public void accelaration();
}
interface Carworkshop
{
	public void workshopdetails();
}

class maruthi implements car,Carworkshop
{

	@Override
	public void enginespeed() {
System.out.println("maruthi enginespeed");		
	}

	@Override
	public void accelaration() {
System.out.println("maruthi accelaration");		
	}

	@Override
	public void workshopdetails() {
		System.out.println("maruthi workshop details");
		
	}}
	class kia implements car
	{

		@Override
		public void enginespeed() {
			System.out.println("kia enginespeed");
		}

		@Override
		public void accelaration() {
			System.out.println("kia accelaration");			
		}

		
		
	}
	




public class Interfacepgm {

	public static void main(String[] args) {
		maruthi ob=new maruthi();
		ob.accelaration();
		ob.enginespeed();
		ob.workshopdetails();
		kia ob1=new kia();
		ob1.accelaration();
		ob1.enginespeed();
		car ob2=new maruthi();
		ob2.accelaration();
		ob2.enginespeed();
		car ob3=new kia();
		ob3.accelaration();
		ob3.enginespeed();

	}

}
