public class wap_pattern {
    public static void main(String arge[]) {
    int i, j,k;
      
    // Outer loop handle the number of rows
    for(i = 5; i >= 1; i--)
    {
          
        // Inner loop print space
        for(k = i; k < 5; k++)
        {
            System.out.print(" ");
        }
          
        // Inner loop print star
        for(j = 1; j <= 2 * i-1; j++)
        {
            System.out.print("*");
        }
          
        // Ending line after each row
        System.out.println();
    } 
    }
}
