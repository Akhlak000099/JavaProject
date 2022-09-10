package CollectionProgram;

public class Demo1 {

	String Pname;
	int price,Id;

	public Demo1(String pname2, int id2, int price2) {
		// TODO Auto-generated constructor stub

		this.Pname=pname2;
		this.Id=id2;
		this.price=price2;
	}
	public String toString() {
		
		return "Product Name : "+Pname+" Product Id : "+Id+" Product Price : "+price;
	}
}
