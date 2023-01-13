//Run in cmd with parameters like -> java HelloWithParameters 1 2
//It will print out the first and second element, so "Hallo Jumbo!" and 2 (for the second element on index 1) of the args Array

public class HelloWithParameters {
	public static void main(String[] args) {

		args[0] = "Hallo Jumbo!";

		System.out.println(args[0]);
		System.out.println(args[1]);

	}
}