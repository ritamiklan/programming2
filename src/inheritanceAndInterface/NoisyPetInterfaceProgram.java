package inheritanceAndInterface;

public class NoisyPetInterfaceProgram {

	public static void main(String[] args) {
		
		NoisyPet[] noisyArray = { new Cat(), new Dog(), new Parrot() };
		
		for (NoisyPet noisyObject : noisyArray) {
			noisyObject.makeSound();
		}
		
		System.out.println();
		
		for (NoisyPet noisyObject : noisyArray) {
			noisyObject.play();
		}
			
	}
}
