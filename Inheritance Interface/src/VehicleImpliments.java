public class VehicleImpliments extends AbstractClass implements Interface1, Cloneable{
	
	
	private int numOfWheels = 2;
	private double theSpeed = 0;
	
	private int carStrength = 0;
	
	public VehicleImpliments(int wheels,double speed){
		this.numOfWheels=wheels;
		this.theSpeed=speed;
	}
	
	
	
	
	//Implements from abstract class
	public void setCarStrength(int carStrength){ 
		this.carStrength = carStrength;
	}
	
	public int getCarStrenght(){
		return this.carStrength;
	}
	
	
	
	
	//Implements from interface
	public int getWheels(){
		return this.numOfWheels;
	}
	
	
	public void setWheels(int numWheels){
		this.numOfWheels=numWheels;	
	}
	
	
	public double getSpeed(){
		return this.theSpeed;
	}
	
	
	public void setSpeed(double speed){
		this.theSpeed=speed;
		
	}
		
	//overrides preset toString method and uses useful info
	public String toString(){
		return "Number of Wheels: " + this.numOfWheels;
		
	}
	
	public Object clone(){
		
		VehicleImpliments car;
		
		try{
			car = (VehicleImpliments) super.clone();
		}

		catch(CloneNotSupportedException e){
			return null;
			}
	
	 return car;
		
	}
	
}