package CollectionProgram;

public class Demo2 {
String name,email,per;
long phNo;
	
	Demo2(String name2,String email2,String per2,long phNo2){
		
		this.name=name2;
		this.email=email2;
		this.per=per2;
		this.phNo=phNo2;
	}
	public String toString() {
		
		return "Name : "+name+", Email : "+email+", percentage : "+per+", Phone Number : "+phNo;
		
	}
}
