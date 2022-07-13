package Abstraction;

public class abs_demo extends abs_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs_demo obj= new abs_demo();
//		obj.demo1();
		obj.plindrom();
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("The Process Of Ascending :");
		int[] num=accept_value();
		System.out.println("The numbers  is =");
		for(i=0;i<size;i++)
		{
			System.out.print(num[i]+"\t");
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("\nThe numbers in ascending order is =");
		for(i=0;i<size;i++)
		{
			System.out.print(num[i]+"\t");
		}
	}

}
