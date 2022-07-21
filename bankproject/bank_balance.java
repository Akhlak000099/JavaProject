package bankproject;

public class bank_balance extends accept_value{
	// access modifiers variables
   private static int deposit;
   private static int withdrawal;
   
// we deposit money
   public int depo(int deposit) {
	   
	   this.deposit = deposit;
	   bank_bal+=deposit;
	   
	   return bank_bal;
   }
// we set the deposit money
   public void accept_depo() {
	   int money1;
	   System.out.println("Here Deposit your money ");
	   money1=ch.nextInt();
	   System.out.println("Now Your total account balance is : "+depo(money1));
   }
   //we withdrawal money
   public int with(int withdrawal) {
	   this.withdrawal = withdrawal;
	   
	   return bank_bal-=withdrawal;
   }
//   we set the withdrawal moneey
   public void with_money() {
	   int money2;
	   System.out.println("Enter your money for withdrawal ");
	   money2=ch.nextInt();
	   if(money2>bank_bal) {
		   System.out.println("ja nikal kangle teri bsaki kuch nhi hai -:)");
	   }
	   else {
		   System.out.println("Now your total account balance is "+with(money2));
	   }
   }
   
   
   
   
}
