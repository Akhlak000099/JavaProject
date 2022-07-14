package program;

public class rowcol extends accept
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		rowcol obj1=new rowcol();
		obj1.program();
		
		
	}
	
	public void program()
	{
		
		accepvalue();
		System.out.println("the array number is ");
		
     for(i=0;i<row;i++) {
    	 for(j=0;j<col;j++) {
    		 System.out.print(arr[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}

}
