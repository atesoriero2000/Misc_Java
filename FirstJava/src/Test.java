import java.util.Scanner;

public class Test{
	static double y;
	static double x;

	static Scanner testImput = new Scanner(System.in);
	
	public static void main (String[] args){
	
		while  (y<100){
			System.out.print("X:");
	
			if(testImput.hasNextInt()){
				
				x = testImput.nextInt();
				y= ((x/4)*2)+12;
			
				System.out.println("Y:"+y);
			
				continue;
			
			}else if(!testImput.hasNextInt()){
				
				System.out.println("Not an Integrer");
		
			}
		}
	}
}

