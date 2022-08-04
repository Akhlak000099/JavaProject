package program7;

public class ThreadProgram1 extends Thread{
	public static void main(String args[])
	{
	    ThreadProgram t1= new ThreadProgram("ON");
	    ThreadProgram t2= new ThreadProgram("OFF");       
	    System.out.println("Details of the Threads in running state....");
	
	    	t1.start();
		    t2.start();
		    try {
				sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	   
	   
	}

