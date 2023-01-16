public class EesTellen {

	public static void main(String[] args) {

		String mijnWoord = "regenen";
		int count = 0;

		for(int i = 0; i < mijnWoord.length(); i++) {
			char currentChar = mijnWoord.toLowerCase().charAt(i);
			if(currentChar == 'e') {
				count++;
			} else if(currentChar == 'E') {
				count++;
			}
		}
	System.out.println("Het woord " + mijnWoord + " heeft " + count + " keer een letter e");
	}
}