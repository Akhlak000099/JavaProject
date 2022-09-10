//Write a program to accept product name, ID, Price . Arrange the data in Descending order and display the output. (Using Linked List)
package CollectionProgram;

import java.util.*;

public class LinkedListProgram{
Scanner ch=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListProgram obj=new LinkedListProgram();
		obj.accept();
	}
	
	public void accept() {
		LinkedList<Demo1> list=new LinkedList<Demo1>();
		
		String Pname;
		int Id,price;
		
		for(int i=1;i<=3;i++) {
			System.out.println("Enter your Product name ");
			Pname=ch.next();
			System.out.println("Enter product Id ");
			Id=ch.nextInt();
			System.out.println("Enter product price");
			price=ch.nextInt();
			
			list.add(new Demo1(Pname,Id,price));
		}

		Collections.sort(list, new comparetable());
		
for(Demo1 str:list) {
	System.out.println(str);
}
		
//		Iterator<Demo1> iter=list.descendingIterator();
////		System.out.println(iter);
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		System.out.println(list);
		
		
	}



}
