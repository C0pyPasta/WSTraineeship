import webshop.*;
import java.util.Scanner;

public class ApplicatieAccessMods {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Klant klant = new Klant();
		Webshop webshop = new Webshop("Harries Hardware", true);

		
		webshop.setCredietLimietNieuweKlant(1000.00);
		webshop.time = 10.00;

		//---------------------------------------------------------

		
		
		System.out.println("Wat is de geldende korting? Gebruik een heel getal");
		int geldendeKorting = sc.nextInt;
		webshop.setGeldendeKortingInProcenten(geldendeKorting);
		System.out.println("Jouw korting is " + webshop.getGeldendeKortingInProcenten());		

		System.out.println("Wat is jouw crediet limiet? (als decimaal getal)");
		double credietLimiet = sc.nextDouble;
		webshop.setCredietLimietNieuweKlant(credietLimiet);
		System.out.println("Jouw crediet is " + webshop.getCredietLimietNieuweKlant());
		
	}

}