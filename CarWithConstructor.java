package test;

public class CarWithConstructor {
	public String brand;
	public Boolean manual;
	/*
	//Default Constructor (als voorbeeld)
	public CarWithConstructor() {
		System.out.println("Default constructor called");
	}
	*/

	//Constructor 1

	public CarWithConstructor(String brand) {
		System.out.println("Brand is " + brand);	
		this.brand = brand;
	}

	
	//Constructor 2
	public CarWithConstructor(boolean isManual) {
		if(isManual) {
			System.out.println("It is a manual shifter");
			manual = true;
		} else {
			System.out.println("It is an automatic");
			manual = false;
		}
	}
	
		//Initialiser block 1
		{
			System.out.println("Initialiser Block One");
		}

		//Initialiser block 2
		{
			System.out.println("Initialiser Block Two");
		}

		//Initialiser block 3
		{
			System.out.println("Initialiser Block three");
		}
		
}