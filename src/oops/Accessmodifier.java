package oops;

public class Accessmodifier {
	private int p=30;//----private
    int b=20;//---default
    protected int s=20;
	public static void main(String[] args) {
		Accessmodifier ob=new Accessmodifier();
		System.out.println(ob.p);//------private
        System.out.println(ob.b);//-----default within class
        System.out.println(ob.s);//---protected within class
	}

}
