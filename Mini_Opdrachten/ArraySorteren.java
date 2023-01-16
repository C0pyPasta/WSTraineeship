public class ArraySorteren {
	public static void main(String[] args) {

	int[] arr = new int[] {5, 1, 9, 8, 4, 3, 10, 2, 7, 6};
	System.out.println("Array elements after sorting:"); 
		//Geen idee waarom deze ze niet juist sorteert
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;					
				}
			}
		System.out.println(arr[i]);
		}
	}
}