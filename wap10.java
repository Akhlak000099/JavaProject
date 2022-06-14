//make a simple program for take oreder from the custumer
import java.util.*;
public class wap10 {
    public static void main(String args[]) {
        int choice,ch1,main,dessert,total=0;
        char ans;
        String pro="";
        Scanner ch=new Scanner(System.in);
        System.out.println("Welcome \t\t Taj Hotel");
        do{
            System.out.println("MenuBar :- \n1: Saterter's\n 2: Main Course \n3: Dessert ");
            System.out.println("Your order dear mam/sir");
            choice= ch.nextInt();

            switch(choice){
                case 1:
                       System.out.println("Starter's are : \n1: Chilli patato Rupees=80 \n2: Chaumin Rupees=120 \n3: Maggi Mashala Rupees 80");
                       System.out.println("Enter your Item :- ");
                       ch1=ch.nextInt();
                       switch(ch1) {
                        case 1: 
                            System.out.print("\tYour Order\t\t\n");
                            total+=80;
                            pro+=" Chilli patato,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                        case 2:
                            System.out.println("\tYour Order\t\t");
                            total+=120;
                            pro+=" Chaumin,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                        case 3:
                            System.out.println("\tYour Order\t\t\n");
                            total+=80;
                            pro+=" Maggi Mashala,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                            default:
                                System.out.println(" Please Enter Vaild Input");
                        }
                       break;
                case 2:
                       System.out.println("main course's are: \n1: Badami Paneer.  Rupees=280 \n2: Restaurant Style Tomato Pulao Rupees=320 \n3: Butter Naan. Rupees=250");
                       System.out.println("Enter your Item :- ");
                       main=ch.nextInt();
                       switch(main) {
                        case 1: 
                            System.out.print("\tYour Order \t\t\n");
                            total+=280;
                            pro+=" Badami Paneer,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                        case 2:
                            System.out.println("\tYour Order\t\t");
                            total+=320;
                            pro+=" Restaurant Style Tomato Pulao,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                        case 3:
                            System.out.println("\tYour Order\t\t\n");
                            total+=250;
                            pro+=" Butter Naan,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                            default:
                                System.out.println(" Please Enter Vaild Input");
                        }
                       break;
                case 3:
                       System.out.println("Dessert's are: \n1: Cheesecake  Rupees=280 \n2: Cupcakes. Rupees=320 \n3: Ice Cream. Rupees=250");
                       System.out.println("Enter your Item :- ");
                       dessert=ch.nextInt();
                       switch(dessert) {
                        case 1: 
                            System.out.print("\tYour Order \t\t\n");
                            total+=280;
                            pro+=" Cheesecake,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                        break;
                        case 2:
                            System.out.println("\tYour Order\t\t");
                            total+=320;
                            pro+=" Cupcakes,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                        case 3:
                            System.out.println("\tYour Order\t\t\n");
                            total+=250;
                            pro+=" Ice Cream,";
                            System.out.println("Total Amount = "+"Rs"+" "+total);
                            System.out.println("Your Item = "+" "+pro);
                            break;
                            default:
                                System.out.println(" Please Enter Vaild Input");
                        }
                       break;
            }
            System.out.println("Do you want to add any more item Y/N");
            ans=ch.next().charAt(0);
        }
        while(ans=='y' || ans=='Y');
        System.out.println("Thanks for comaing :-)");
        // System.out.println("The bill aamount is ");       
    }
}
