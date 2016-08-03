import java.util.concurrent.locks.ReentrantLock;

public class PreformSystemCheck implements Runnable{
	
	private String checkWhat;
	
	ReentrantLock lock = new ReentrantLock();
	
	
	
	
	public PreformSystemCheck(String checkWhat){
		
		this.checkWhat = checkWhat;
		
	}
	
	
	
	public void run(){
		
		lock.lock();
		
		System.out.println("Cheking " + this.checkWhat);
		
		lock.unlock();
	}
	
}//class