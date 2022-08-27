package fileHandlingProgram;

public class Singletondemo1 {

	private static Singletondemo1 d=null;
	
	public Singletondemo1() {
		System.out.println("Hi from the constructor....");
	}
	
	public static Singletondemo1 abcd() {
		
		if(d==null) {
			d=new Singletondemo1();
		}
		return d;
		
	}
}
