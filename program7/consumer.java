package program7;
public class consumer extends Thread {
	SynchronizedThreads st;
	consumer(SynchronizedThreads st){
		this.st = st;
	}
	
	public void run(){
	while(true){
			st.get();
		}
	}
}
