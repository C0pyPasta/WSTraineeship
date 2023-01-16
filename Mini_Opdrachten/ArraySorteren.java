public class ArraySorteren{

	public static void main(String[] args) {
		int[] mijnArray = new int[] {5, 8, 1, 6, 3, 4, 9, 2, 7, 10};
		for(int i = 0; i < mijnArray.length; i++) {
			System.out.println(mijnArray[i]);
		}

		//Geen idee waarom deze ze niet juist sorteert
		for(int i = 0; i < mijnArray.length; i++) {
			for(int j = i + 1; j < mijnArray.length; j++) {
				int temp = 0;
				if(mijnArray[i] > mijnArray[j]) {
					temp = mijnArray[i];
					mijnArray[i] = mijnArray[j];
					mijnArray[j] = mijnArray[i];					

				}
			}
		System.out.println(mijnArray[i]);
		}
	}
}