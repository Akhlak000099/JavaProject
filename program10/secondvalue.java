//Q2:Write a program to find second minimum and second maximum number from the array .

package program10;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class secondvalue {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;     //Declare array size
        System.out.println("Enter the size of the array");
        n=sc.nextInt();   //Initialize array size
        
        int arr[]=new int[n];   //Declare array 
       System.out.println("Enter the array");  
       for(int i=0;i<n;i++)     //Initialize array
       {
           arr[i]=sc.nextInt();
       }
              
       //first type to get largest and lowest number  
       for(int i=0;i<n;i++)     //Use to hold the element
       {
           for(int j=i+1;j<n;j++)    //Use to compare with the rest of the elements 
           {
               if(arr[i]<arr[j])     //Check and swap
               {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
//       
       System.out.println("Second Largest element is "+arr[1]);   //Display second largest element.
       System.out.println("Second Smallest element is "+arr[n-2]); //Display second largest element.
       
       System.out.println(secondlargest(arr,n));  //Display second largest element.
       System.out.println(secondlowest(arr,n));   //Display second largest element.
    }
    
   // second type to get largest and lowest number  
   public static int secondlargest(int[] a,int size) {
	   Arrays.sort(a);
	   System.out.println("Sorted arrays are:"+Arrays.toString(a));
	   return a[size-2];
   }
   
   public static int secondlowest(int[] a,int size) {
	   Arrays.sort(a);
	   System.out.println("Sorted arrays are:"+Arrays.toString(a));
	   return a[1];
   }
}