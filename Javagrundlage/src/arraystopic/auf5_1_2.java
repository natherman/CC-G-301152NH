package arraystopic;

import java.util.Arrays;

public class auf5_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int[] zufallsarray = new int[20];
        for (int i = 0; i < zufallsarray.length; i++) {
            zufallsarray[i] = (int)(Math.random() * 100);
        }
        System.out.println("Gerade Zufallszahlen: " + Arrays.toString(zufallsarray));
        Arrays.sort(zufallsarray);
        System.out.println("Sortierte Zufallszahlen: " + Arrays.toString(zufallsarray));
    }
}
	    
