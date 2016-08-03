
import java.util.Scanner;

public class Water{
	
	static Scanner input = new Scanner(System.in);
	static int level = 0;
	
	public static void main(String[] args){
		while(level<=10){
		
			System.out.print("Drink Or Pour: ");
			
			String next = input.next();
			
			
			if(next.equalsIgnoreCase("pour")){
				System.out.print("Pour Amount: ");
				
				int amount = input.nextInt();
				level+=amount;
				
				if(level<=10){
					drawGlass();
				}
				
			}else if(next.equalsIgnoreCase("drink")){
				System.out.print("Drink Amount: ");
				
				int amount = input.nextInt();
				level-=amount;
				
				if(level<0){
					level=0;
					}
					
				drawGlass();
				
			}else{
				System.out.println("\nInvalid\n");
			}
			
			
		}//while loop
		
		drawGlassO();
		
		System.out.println("GLASS OVERFLOWED!");
		
	}
	
	static void drawGlass(){
		int currentHeight=0;
		System.out.println();
		for(currentHeight = 10; currentHeight > level; currentHeight--){
			System.out.println("|                    |");
			
		}
		
		for(int currentHeight2 = currentHeight; currentHeight2 > 0; currentHeight2--){
			System.out.println("|********************|");
		}
		
		System.out.println("|____________________|\n");
	}
	
	static void drawGlassO(){
		System.out.println();
		System.out.println("**********************");
		System.out.println("************************");
		System.out.println("|********************|***");
		System.out.println("|********************|****");
		System.out.println("|********************|****");
		System.out.println("|********************|*****");
		System.out.println("|********************|******");
		System.out.println("|********************|*******");
		System.out.println("|********************|********");
		System.out.println("|********************|**********");
		System.out.println("|********************|*************");
		System.out.println("|********************|****************");
		System.out.println("|____________________|*****************\n");
		
	}
}