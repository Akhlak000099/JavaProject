public class nestedloop {
    public static void main(String args[]) {
        int i,j,k,n;  
        System.out.println("This is a pattern for using nested loop");

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("This is a pattern for using nested loop");
        
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("This is a pattern for using nested loop");

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
               if(j%2==0){
                System.out.print("0");
               }
               else{
                System.out.print("1");
               }
            }
            System.out.println();
        }
        System.out.println("This is a pattern for using nested loop");
        
        for(i=1;i<=5;i++){
            
            for(k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
               if(j%2==0){
                System.out.print("0");
               }
               else{
                System.out.print("1");
               }
            }
            System.out.println();
        }
        System.out.println("This is a pattern for using nested loop");

        for(i=1;i<=5;i++){
            for(k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("This is a pattern for using nested loop");

        for(i=1;i<=5;i++){
            for(k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("This is a pattern for using nested loop");

        for(i=1;i<=5;i++){
            for(k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(n=1;n<=i;n++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

