
public class Monster {

	private int health= 100;
	private int thirst= 100;
	private int hunger= 100;
	
	private boolean alive = true;
	
	
	 /////////////////
	///CONSTRUCTOR///
   /////////////////
	
	public Monster(int newHealth,int newThirst,int newHunger){
		health= newHealth;
		thirst= newThirst;
		hunger= newHunger;
		alive = true;
	}
	
	

	
	//////////////////////
   ///ACSESSOR METHODS///
  //////////////////////
	
	public int getHealth(){
		return health;
	}
	
	public int getThirst(){
		return thirst;
	}
	
	public int getHunger(){
		return hunger;
	}
		
	
	
	
	
	private void checkAlive(){
		if(health<=0|hunger<=0|thirst<=0){
			this.alive=false;
			System.out.println("Your Moster is Dead!");
		}
	}
	
	
	
	
	
	
	public void changeHealth(int amount){
			health+=amount;
			checkAlive();
	}
	public void changeHealth(double amount){//OVERLOAD
		int newHealth= (int)amount;
		changeHealth(newHealth);
	}
			
	
	
	public void changeThirst(int amount){
			thirst+=amount;
			checkAlive();
	}
	public void changeThirst(double amount){//OVERLOAD
		int newThirst= (int)amount;
		changeThirst(newThirst);
	}
		
	
	
	public void changeHunger(int amount){
			hunger+=amount;
			checkAlive();
	}
	public void changeHunger(double amount){//OVERLOAD
		int newHunger= (int)amount;
		changeHunger(newHunger);
	}
		


}

	
	





