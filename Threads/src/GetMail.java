public class GetMail implements Runnable{
	
	private int startTime;
	
	
	
	
	public GetMail(int t){
		this.startTime=t;
	}
	
	
	
	public void run(){
		
		for(int i=1; i <= 2; i++){
			try{
				Thread.sleep(startTime*1000);
			}
			catch(InterruptedException e)
			{}
		
			System.out.println("Getting Mail...");
			
		}
	}
	
	
}