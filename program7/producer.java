package program7;



public class producer extends Thread{
	SynchronizedThreads st;
	producer(SynchronizedThreads st){
		this.st = st;
	}
	
	public void run(){
		int i = 0;
		while(true){
			st.put(i++);
		}
	}
}
