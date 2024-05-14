package oops;

public class Accessmodifierdefault extends Accessmodifier {

	public static void main(String[] args) {
		Accessmodifier ob1=new Accessmodifier();
		System.out.println(ob1.b);//-----default within package
		System.out.println(ob1.s);//----default within package
		System.out.println(ob1.s);//---default after inheritance
	}

}
