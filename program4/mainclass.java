package program4;
// WAP to create a class for Fibonacci series, second class Palindrom No , Third class use both the class property and display the output (with using multilevel inheritance)
public class mainclass extends palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainclass obj=new mainclass();
		obj.demomethod();
		
	}
	public void demomethod() {
		System.out.println("Enter a number ");
		n=ch.nextInt();
		demo2(n);
		System.out.println("Enter a number ");
		n=ch.nextInt();
		demo(n);
	}

}
