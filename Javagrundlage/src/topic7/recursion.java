package topic7;

public class recursion {
	public static int summeArray(int[] array, int index) {
		if (index == array.length) {
            return 0;
        }
        // Rekursiver Fall: aktuelles Element plus die Summe der verbleibenden Elemente
        return array[index] + summeArray(array, index + 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] zahlen = {1, 2, 3, 4, 5}; 
		int summe = summeArray(zahlen, 0);
		System.out.println("Die Summe der Elemente im Array ist: "+	summe);

	}

}
