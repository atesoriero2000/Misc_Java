public class Cat extends Animal{//INHERITANCE
	
	
	public String favToy = "Yarn";//Cat includes all methods and variables as amimals but can add
	

	public void playWith(){
		System.out.println("Yay" + favToy);	
	}

	public void walkAround(){
		System.out.println(getName()+" stalks around");
		
	}
	
	public String getToy(){
		return this.favToy;
	}
	
	
	
	public Cat(String name, String favFood, String favToy){
		super(name, favFood);
		this.favToy=favToy;
	}
}
