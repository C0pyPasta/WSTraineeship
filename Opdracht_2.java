import java.util.Scanner;

public class Opdracht_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Voer een getal in ");
		int a = scanner.nextInt();
		System.out.println("Je hebt " + a + " ingevoerd!");
		
		// Gebruik 1 if statement
		if(a > 1000) {
			System.out.println("Je hebt een getal ingevoerd die hoger is dan 1000");
		}

		// Gebruik een if met een else if
		if(a > 1000) {
			System.out.println("Je hebt een getal ingevoerd die hoger is dan 1000");
		} else if(a > 2000) {
			System.out.println("Je hebt een getal ingevoerd die ook hoger is dan 2000");
		}

		// Gebruik een if met een else
		if(a < 1000) {
			System.out.println("Je hebt een getal ingevoerd die lager is dan 1000");
		} else {
			System.out.println("Je hebt een getal ingevoerd die hoger of gelijk is aan 1000");
		}

		// Gebruik een if met else if en else
		if(a <= 500) {
			System.out.println("Je hebt een getal ingevoerd die lager of gelijk is aan 500");		
		} else if(a > 500 && a < 1000) {
			System.out.println("Je hebt een getal ingevoerd die hoger is dan 500 en kleiner is dan 1000");
		} else {
			System.out.println("Je hebt een getal ingevoerd die hoger is of gelijk is aan 1000");
		}
		*/
		//-----------------------------------------------------------------------------------------------------------
		System.out.println("Voer een String in van maximaal 10 letters");
		String ingevoerdeString = scanner.next();
		System.out.println("En nu een getal tussen de 0 tot en met de negen");
		int ingevoerdGetal = scanner.nextInt();

		System.out.println("charAt positie " + ingevoerdGetal + " is " + ingevoerdeString.charAt(ingevoerdGetal));
		

	}

}