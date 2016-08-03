public class MainFile{
	public static void main(String[] args){
		Monster Tony = new Monster(100,100,100);
		int Health = Tony.getHealth();
		int Thirst = Tony.getThirst();
		int Hunger = Tony.getHunger();
		
		
		System.out.println("Health:"+Health);
		System.out.println("Thirst:"+Thirst);
		System.out.println("Hunger:"+Hunger);
		
		Tony.changeHealth(-10);
		Tony.changeThirst(-10);
		Tony.changeHunger(-10);
		
		Health = Tony.getHealth();
		Thirst = Tony.getThirst();
		Hunger = Tony.getHunger();
		
		System.out.println("Health:"+Health);
		System.out.println("Thirst:"+Thirst);
		System.out.println("Hunger:"+Hunger);
		
	}
}