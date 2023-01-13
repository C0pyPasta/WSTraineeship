import test.CarWithConstructor;

public class Applicatie1 {

	public static void main(String[] args) {
		CarWithConstructor myCarWithConstructor = new CarWithConstructor("Saab");
		System.out.println("Mien merk is een " + myCarWithConstructor.brand);

		CarWithConstructor myCarWithConstructorShifts = new CarWithConstructor(true);
		System.out.println("Is het een schakel bak? " + myCarWithConstructorShifts.manual);

	}

}