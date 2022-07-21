package bankproject;

// bank_balance class inherit in choiseclass 

public class choiseclass extends bank_balance{
	static choiseclass obj=new choiseclass();
	// access modifier
	private static int pin;

// 	choose any one for withdrawal and deposit money
	public void choose() {
//		choiseclass obj=new choiseclass();
		char ans;
		int i;
		System.out.println("Choose b/w in two number (1: Withdrawal And 2: Deposit) ");
		i=ch.nextInt();
	do {	
		switch(i) {
		 
		case 1:
			obj.with_money();
		    break;
		
		case 2:
			obj.accept_depo();
		    break ;
		    
		 default:
			 System.out.println("You input wrong value please try again -:) ");
			
	     }

		   System.out.println("Do you want to Continue this process Y/N");
           ans=ch.next().charAt(0);
           break;
	
	}while(ans=='y' || ans=='Y');
	System.out.println("Thanks for using this Atm");
	
	
	}
	
// we take ATM pin with using this method 	
	public void atmpin() {
		int count = 1;
		int pin = 0;
		this.pin=pin;
//		
		
		do {
			if(count==1) {
				System.out.println("Enter your ATM pin nUmber :");
				pin=ch.nextInt();
				if(pin==7913) {
					obj.accept();
					obj.choose();
				}
				else {
				count++;
				}
			}
			else if(count==2 ){
				System.out.println("Your ATM pin is incorrect and you have two more chance be careful ");
				System.out.println("Enter your ATM pin nUmber :");
				pin=ch.nextInt();
				if(pin==7913) {
					obj.accept();
					obj.choose();
				}
				else {
				count++;
				}
			}
			else if(count==3){
				
				System.out.println("Your ATM pin is incorrect and you have one more chance be careful ");
				System.out.println("Enter your ATM pin nUmber :");
				pin=ch.nextInt();
				if(pin==7913) {
					obj.accept();
					obj.choose();
				}
				else {
				count++;
				}
			}
			else {
				System.out.println("Therre have to no more chance to enter ATM pin number");
				System.out.println("Try again after some time");
				break;
			}
			break;
		
			
		}while(count<=4);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		obj.accept();
//       obj.choose();
		obj.atmpin();
	}

}
