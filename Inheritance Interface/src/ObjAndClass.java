public class ObjAndClass{
	
	public static void main(String[] args){
		Object superCar = new VehicleImpliments(4,100);//java sees this as an object not a Vehicle
		
		//System.out.println(superCar.getSpeed());//will not work because it cannot acsees methods from vehical cause its an obj
		
		//CASTING AND OBJ
		//((VehicleImpliments)superCar).getSpeed(); //Tells java this obj is a vehicle
		
		double x = ((VehicleImpliments)superCar).getSpeed();
		System.out.println("Casting Object Speed: " + x);
		System.out.println();
		
		
		System.out.println("Hash Code: " + superCar.hashCode());//gets hash code
		System.out.println();
		/*int h = superCar.hashCode();
		int y = 0;
		
		while(y != h){
			y+=100;
		
			if(y%10000==0){
				System.out.println(y + "!=" + h);
			}
		}
		System.out.println("Found Hash Equals" + y + "=" + h);*/
		
		System.out.println(superCar.getClass());//gets class of Object
		
		
		System.out.println(superCar.getClass().getName());//gets class of Object without the prefix class
		System.out.println();
		
		System.out.println("Super Class: " + superCar.getClass().getSuperclass());//gets Super class of Object
		System.out.println();
		
		System.out.println(superCar.toString());//uses overridden toString function
		System.out.println();
		
		VehicleImpliments Car = new VehicleImpliments(6, 120.00);
		
		VehicleImpliments Car2 = (VehicleImpliments) Car.clone();
		
		System.out.println("Car Wheel Count: " + Car.getWheels());
		System.out.println("Car Clone Wheel Count: " + Car2.getWheels());
	}
}