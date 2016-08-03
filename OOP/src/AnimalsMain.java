public class AnimalsMain{
	public static void main(String[] args){
		Animal genericAnimal = new Animal();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		Cat Peppermint = new Cat("Peppermint","Tuna", "Box");
		
		System.out.println("\n"+Peppermint.getName());
		System.out.println(Peppermint.favFood);
		System.out.println(Peppermint.favToy);
		
		Animal George = new Cat("George","Salmon","Ball");
	
			acceptAnimal(George);
	}
	
	public static void acceptAnimal(Animal randAnimal){
		
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
		//System.out.println(randAnimal.favToy);
		
		
		//POLYMORPHISM 

		randAnimal.walkAround();
		
//if randAnimal is also a cat it uses the walk around method
//in cat rather than in animal 
//if not a cat but still an animal it uses the method in animal
//but can only grab values from animal not cat sooo
//System.out.println(randAnimal.favToy);   will give an error
		
		Cat tempCat = (Cat) randAnimal;
//tells program to turn randAnimal into a Cat named tempCat
//allowing us to access and print out....
		
		System.out.println(tempCat.favToy);
		//OR do
		System.out.println( ((Cat)randAnimal) .favToy );
		
	}
	
}