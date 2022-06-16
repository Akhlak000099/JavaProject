import java.util.Scanner;

class wap17 {
  
    
    // Driver Code
    public static void main(String args[])
    {
      accept();
    }

    public static void accept() {
        int n;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter a number");
        n=ch.nextInt();
        System.out.println("The Fibonacci value for using while loop");
        Fibonacci(n);
        System.out.println();
        System.out.println("The Fibonacci value ");
        forloop(n);

    }
    // Function to print N Fibonacci Number
    public static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
    public static void forloop(int x) {
        int a=0,b=1;
        int i,sum;
        System.out.println(a);
        System.out.println(b);
        for(i=1;i<x-1;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
    
}