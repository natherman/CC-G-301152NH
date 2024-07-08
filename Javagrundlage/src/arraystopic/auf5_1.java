package arraystopic;

import java.util.Arrays;

public class auf5_1 { 
	public static void main(String[] args) {
        // Feld 1: Enthält nur gerade (zufällige) Zahlen
        int[] geradearray = new int[20];
        for (int i = 0; i < geradearray.length; i++) {
            // Generiere eine gerade Zufallszahl
            geradearray[i] = 2 * (int)(Math.random() * 50);
        }

        // Feld 2: Enthält ganze (zufällige) Zahlen, die aufwärts sortiert sind
        int[] zufallsarray = new int[20];
        for (int i = 0; i < zufallsarray.length; i++) {
            zufallsarray[i] = (int)(Math.random() * 100);
        }
        Arrays.sort(zufallsarray);

        // Ausgabe der Felder
        System.out.println("Gerade Zufallszahlen: " + Arrays.toString(geradearray));
        System.out.println("Sortierte Zufallszahlen: " + Arrays.toString(zufallsarray));
    }
}
	    