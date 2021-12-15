package CorejavaRevision;

interface Animal {
	public void animalSound();

	default void name() {
		System.out.println("default name method executed");
	}
	
}

interface WaterAnimal {
	public void swim();

}

public class InterfaceImplementation implements Animal,WaterAnimal {

	@Override
	public void swim() {
		System.out.println("rino swim");
		
	}

	@Override
	public void animalSound() {
		System.out.println(" bow bow");
	}
	/*@Override
	public void name() {
		System.out.println("implemented name method");
	}*/

	public static void main(String[] args) {
		InterfaceImplementation i= new InterfaceImplementation();
		i.animalSound();
		i.name();
		i.swim();
		
	}

}
