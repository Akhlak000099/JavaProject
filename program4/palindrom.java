package program4;

public class palindrom extends fbcSeeries  {
	public void demo2(int n) {
		temp=n;    
	      while(n>0){    
	        r=n%10;  //getting remainder  
	        sum=(sum*10)+r;    
	        n=n/10;    
	      }    
	      if(temp==sum)    
	         System.out.println("palindrome number "+temp);    
	      else    
	         System.out.println("not palindrome"+temp);    
	  }
	}


