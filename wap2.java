import java.util.*;
public class wap2 {
    public static void main(String args[]){
        int user,res;
        Scanner cb= new Scanner(System.in);
        System.out.println("Enter a number ");
        user = cb.nextInt();
        if(user % 2==0){
            res = user*user;
            System.out.println("The cube of "+res);
        }
        else{
            System.out.println("Your number is odd "+user);
        }
    }
    
}
