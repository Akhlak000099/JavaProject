package program5;

public class mainclass extends divclass{
	public static void main(String args[]) {
		mainclass obj=new mainclass();
		obj.callmethod();
	}
	public void callmethod() {
		System.out.println("The sum of two number ");
		addvlaue();
		System.out.println("The mul of two number ");
		mulvlaue();
		System.out.println("The div of two number ");
		divvalue();
		System.out.println("The mod of two number ");
		modvlalue();
		
	}

}
