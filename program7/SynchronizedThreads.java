package program7;

public class SynchronizedThreads{

	int item;
	boolean busy = false;
	synchronized int get(){
		if (!busy)
			try{
				wait();
			}
			catch(InterruptedException ie){}
		System.out.println("Get:" + item);
		busy = false;
		notify();
		return item;
	}
	synchronized void put(int item){
		if (busy)
			try{
				wait();
			}
			catch(InterruptedException ie){}
		this.item = item;
		busy = true;
		System.out.println("Put:" + item);
		notify();
	}
	
}

