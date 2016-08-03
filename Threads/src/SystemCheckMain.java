import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.*;

public class SystemCheckMain {
	
	public static void main(String[] args){
		
		addThreadsToPool();
		
	}
	
	public static void addThreadsToPool(){
		
		ScheduledThreadPoolExecutor eventPool2 = new ScheduledThreadPoolExecutor(4);
		
		//eventPool2.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
		eventPool2.scheduleAtFixedRate(new PreformSystemCheck("Mail2"), 5, 5, SECONDS);
		eventPool2.scheduleAtFixedRate(new PreformSystemCheck("Calendar2"), 10, 10 ,SECONDS);
		eventPool2.scheduleAtFixedRate(new PreformSystemCheck("Phone2"), 20, 1 ,SECONDS);
		
		
		
		
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
		eventPool.scheduleAtFixedRate(new PreformSystemCheck("Mail"), 5, 5, SECONDS);
		eventPool.scheduleAtFixedRate(new PreformSystemCheck("Calendar"), 10, 10 ,SECONDS);
		eventPool.scheduleAtFixedRate(new PreformSystemCheck("Phone"), 20, 1 ,SECONDS);
		
		System.out.println("Number of Threads: " + Thread.activeCount() );
		System.out.println();
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		Thread.enumerate(listOfThreads);
		
	
		for(Thread i : listOfThreads){
			
			System.out.println(i.getName());
			
		}
		System.out.println();
		
		
		
		for(Thread i : listOfThreads){
			
			System.out.println(i.getPriority());
			
		}
		System.out.println();
		
			
	}
	
}
