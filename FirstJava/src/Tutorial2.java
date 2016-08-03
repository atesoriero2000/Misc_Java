import java.util.Scanner;

public class Tutorial2
{
	static Scanner typedI = new Scanner(System.in);

	
	public static void main(String[] args){
		while(true){
		
			
		System.out.print("Enter Password:");
			
		int typedd = typedI.nextInt();
		if(typedd==123){
				System.out.println("Correct");
				
				
				while(true){
				   
					System.out.print("Enter Password2:");
					 typedd = typedI.nextInt();
					
					if(typedd==123){
					System.out.println("Correct");
					
					
					while(true){
					System.out.print("Enter Password3:");
					 typedd = typedI.nextInt();
						
						if(typedd==123){
						System.out.println("Correct Welcome Enter Name:");
							
					//STOP
						}else{
						System.out.println("InCorrect");
						}
					}
				}else{
					System.out.println("InCorrect");
				}
			}
			}else{
				System.out.println("InCorrect");
			}
		}
	}
}
	