package arraystopic;

import java.util.Arrays;

public class Arraystauschen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] feld = {4, 2, 10, 3, -5, 0, 17};
        int index1 = 3;
        int index2 = 5;

        System.out.println("Feld: " + Arrays.toString(feld));
        System.out.println("Parameter 1: " + index1);
        System.out.println("Parameter 2: " + index2);

        // Tausch der Elemente
        swap(feld, index1, index2);

        System.out.println("Neues Feld: " + Arrays.toString(feld));
    }

    // Methode zum Tauschen der Elemente
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

