import java.util.Scanner;

public class Game{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.print("Press a Button To Start: ");
		
			if(input.hasNext()){
				if(input.next().equals("%")){
				System.out.println("YOU DIED!");
			}else{
				System.out.println("You Win!");
			}
		}
	}
}