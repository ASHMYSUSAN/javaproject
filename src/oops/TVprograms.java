package oops;



interface tvremote
{
	public void powerbutton();
	public void programbutton();
	public void volumebutton();
}
interface smarttv extends tvremote
{
	public void bluetooth();
	public void onlineapp();
}
class tv implements smarttv
{

	@Override
	public void powerbutton() {
		System.out.println("tv is ON/OFF");
	}

	@Override
	public void programbutton() {
System.out.println("Channal change");		
	}

	@Override
	public void volumebutton() {
System.out.println("volume increase or decrease");		
	}

	@Override
	public void bluetooth() {
System.out.println("bluetooth details");		
	}

	@Override
	public void onlineapp() {
System.out.println("online app details");		
	}
	
	
	
}
public class TVprograms
{
	public static void main(String[] args)
	{
		tv ob=new tv();
		ob.powerbutton();
		ob.programbutton();
		ob.volumebutton();
		ob.bluetooth();
		ob.onlineapp();
	}
}