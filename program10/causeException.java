package program10;

import java.io.IOException;

public class causeException {
  int num1,num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		causeException ce=new causeException();
		ce.exception2();

	}
	

	//this is first exception method
	 public void exception1() {
		 try {
			 num2=10/num1;
		 }
		 catch(ArithmeticException ae) {
			 
			 ae.printStackTrace();
		 }
	 }
	 
	 //this is second exception method
	 public void exception2() {
		 try {
			 exception1();
		 }
		 catch(NullPointerException npe) {
//			 System.out.println("Cought = "+npe);
//			 System.out.println("Original cause : "+npe.getCause());
			 npe.getCause();
		 }
	 }
	
}
