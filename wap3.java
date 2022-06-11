import java.util.*;

public class wap3 {
    public static void main(String args[]){
        char snd;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter any alphabet for checking is a vowal alphabat character and not ");
        snd=ch.next().charAt(0);
        switch(snd){
            case 'a':
                System.out.println("It is a vowal alphabat character -:) "+snd);
                break;
            case 'e':
                System.out.println("It is a vowal alphabat character -:) "+snd);
                break;
            case 'o':
                System.out.println("It is a vowal alphabat character -:) "+snd);
                break;
            case 'u':
                System.out.println("It is a vowal alphabat character -:) "+snd);
                break;
            case 'i':
                System.out.println("It is a vowal alphabat character -:) "+snd);
                break;
            default:
                System.out.println("It is the consonants character -:)"+snd);
        }

    }
    
}
