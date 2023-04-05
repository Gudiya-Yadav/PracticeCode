package abstractionEx;

interface Location
{
	 public void LocationOfAnimal();
}
abstract class AnimalSounds implements Location {
	  
	  public abstract void animalSound();	  
	  public void color() {
	    System.out.println("Yellow");
	  }
	}

	class Animal extends AnimalSounds {
	  public void animalSound() {
	    
	    System.out.println("The lion is roar");
	  }

	@Override
	public void LocationOfAnimal() {
		System.out.println("Lion lived in a cave");
	}
	}
 
abstract class AbstractionEx implements Location{

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalSound();
		animal.color();
		animal.LocationOfAnimal();
	}
	
	

}
