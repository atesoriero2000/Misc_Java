public abstract class AbstractClass {
	boolean carDrivable = true;
	
	public void carCrashed(){
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int carStrength);//abstract class method works like 
	public abstract int getCarStrenght();//interfaces but with the ability to have inheritance methods too
}
