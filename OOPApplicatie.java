import java.util.Scanner;

public class OOPApplicatie {

	public static void main(String[] args) {
		
	Scanner myScanner = new Scanner(System.in);

	/*
	Car myCar = new Car();

	System.out.println("welk merk auto heb jij?");
	myCar.merk = myScanner.next();

	System.out.println("Hoeveel versnellingen heeft jouw " + myCar.merk + "?");
	myCar.aantalVersnellingen = myScanner.nextInt();

	//Klopt iets niet aan deze onderstaande, lijkt iets met caching te zijn
	//System.out.println("Staat jouw knipperlicht aan?");
	//myCar.knipperlichtAan = myScanner.nextBoolean();

	System.out.println("Hoe hard gaat ie?");
	myCar.snelheid = myScanner.nextShort();

	//Doet het niet, moet charAt() gebruiken
	//System.out.println("Met welke letter begint jouw nummerplaat?");
	//myCar.nummerplaatVersie = myScanner.nextLine();

	System.out.println("Jouw merk is " + myCar.merk + " en die heeft " + myCar.aantalVersnellingen + 
	" versnellingen");

	myCar.ditIsMienMerk();

	String mijnMerk = myCar.getMerk();

	System.out.println(myCar.getMerk());

	myCar.setMerk("Saab");
	} */

	//---------------------------------------------------------------------------------

	Computer mijnComputer = new Computer(); 
	mijnComputer.setNaam("Rutgers Supercomputer");
	mijnComputer.setRamGB(8);
	mijnComputer.setInGebruik(true);
	mijnComputer.setGeheugenGB(1000);
	mijnComputer.setPrijs(2995.95);

	System.out.println("Ik heb een computer gekocht en een naam gegeven" + 
	"Hij heet " + mijnComputer.getNaam() + " en heeft " + mijnComputer.getPrijs() + " gekost" +
	" even kijken of ie aan staat " + mijnComputer.isInGebruik + " , het is trouwens wel een beetje duur " +
	mijnComputer.getPrijs + " maar liefst!");
	}
}