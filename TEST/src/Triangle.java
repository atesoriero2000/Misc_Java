import java.util.Scanner;

public class Triangle{
		
	static Scanner input = new Scanner(System.in);
	
	static double aX=0;
	static double aY=0;
	
	static double bX=0;
	static double bY=0;
	
	static double cX=0;
	static double cY=0;
	
	static double sideA = 0.00;
	static double sideB = 0.00;
	static double sideC = 0.00;
	
	static double aA = 0.00;
	static double aB = 0.00;
	static double aC = 0.00;
	
	
	public static void main(String[] args){
		
		
		setCoordinates();
		
		sideA = Math.sqrt( (bX-cX)*(bX-cX)  +  (bY-cY)*(bY-cY) );
		sideB = Math.sqrt( (aX-cX)*(aX-cX)  +  (aY-cY)*(aY-cY) );
		sideC = Math.sqrt( (aX-bX)*(aX-bX)  +  (aY-bY)*(aY-bY) );
		
		System.out.println("\nA (" + aX +", "+ aY + ")");
		System.out.println("B (" + bX +", "+ bY + ")");
		System.out.println("C (" + cX +", "+ cY + ")");
		
		
		System.out.println("\nSide A; " + sideA);
		System.out.println("Side B: " + sideB);
		System.out.println("Side C: " + sideC);
	}
	
	
	
	
	private static void setSides(){
		System.out.println("Side 1 Length: ");
		
		if(input.hasNextInt()){	
			sideA = input.nextInt();
			
		}else if(input.hasNextDouble()){
			sideA = input.nextDouble();
		}
		
		
		
		
		System.out.println("Side 2 Length: ");
		
		if(input.hasNextInt()){	
			sideB = input.nextInt();
			
		}else if(input.hasNextDouble()){
			sideB = input.nextDouble();
		}
		
		
		
		System.out.println("Side 3 Length: ");
		
		if(input.hasNextInt()){	
			sideC = input.nextInt();
			
		}else if(input.hasNextDouble()){
			sideC = input.nextDouble();
		}
		
	}
	
	
	
	
	
	private static void setCoordinates(){
		
		System.out.println("Point A Coordinates: ");
		System.out.print("	X: ");
		
		if(input.hasNextInt()){
			aX = input.nextInt();
			
		}else if(input.hasNextDouble()){
			aX = input.nextDouble();
		}
		
		System.out.print("	Y: ");
		
		if(input.hasNextInt()){
			aY = input.nextInt();
			
		}else if(input.hasNextDouble()){
			aY = input.nextDouble();
		}
		
		
		
		
		System.out.println("\nPoint B Coordinates: ");
		System.out.print("	X: ");
		
		if(input.hasNextInt()){
			bX = input.nextInt();
			
		}else if(input.hasNextDouble()){
			bX = input.nextDouble();
		}
		
		System.out.print("	Y: ");
		
		if(input.hasNextInt()){
			bY = input.nextInt();
			
		}else if(input.hasNextDouble()){
			bY = input.nextDouble();
		}
		
		
		
		
		System.out.println("\nPoint C Coordinates: ");
		System.out.print("	X: ");
		
		if(input.hasNextInt()){
			cX = input.nextInt();
			
		}else if(input.hasNextDouble()){
			cX = input.nextDouble();
		}
		
		
		System.out.print("	Y: ");
		if(input.hasNextInt()){
			cY = input.nextInt();
			
		}else if(input.hasNextDouble()){
			cY = input.nextDouble();
		}
		
	}

}