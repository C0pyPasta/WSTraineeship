/*Oefening 1:

Maak 8 variabelen aan
Maak 3 hele getallen
maak 3 decimalen
maak 1 boolean
maak 1 character*/

public class Opdracht_1 {

	public static void main(String[] args) {
	
	byte a = 3;
	short s = 20;
	int b = 8000;
	long c = 200000;
	
	double d = 8.5d;
	float e = 12.00f;
	double f = 3;

	boolean g = false;

	char h = 123;

	System.out.println(h);

	int b2 = 3000;
	
	int c2 = b * b2;
		System.out.println(c2);
	int c3 = b * s;
		System.out.println(c3);
		
	int c4 = b / b2;
		System.out.println(c4);
	double d3 = 2.0;
	double d1 = d / d3;
		System.out.println(d1);
	
	if(3 < 6) {
		System.out.print("Yes");	
	}


	boolean boolEen = c4 <= c3;
	boolean boolTwee = d1 != d;
	boolean boolDrie = f == e;

	System.out.println("\neerste bool = " + boolEen + " tweede bool is " + boolTwee + " bool drie is " + boolDrie); 
	
	
	}

}