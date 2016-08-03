public class InterfacesAbstracts{
	
	public static void main(String[] args){
		
		VehicleImpliments car = new VehicleImpliments(4, 100.00);
		
		System.out.println("Cars Max Speed:\n" + car.getSpeed() + "\n");
		System.out.println("Cars Number of Wheels:\n" + car.getWheels() + "\n");
		
		car.setCarStrength(10);
		
		System.out.println("Cars Strength:\n" + car.getCarStrenght());
	}
	
}