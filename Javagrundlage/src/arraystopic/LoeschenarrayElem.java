package arraystopic;
import java.util.Arrays;
public class LoeschenarrayElem {


	    public static void main(String[] args) {
	        int[] array = {3, 4, 1, 9, -5, 4};
	        int wert = 9;

	        System.out.println("Ursprüngliches Array: " + Arrays.toString(array));
	        System.out.println("Zu löschendes Element: " + wert);

	        // Löschen des Elements
	        int[] neuesArray = deleteArrayElement(array, wert);

	        System.out.println("Neues Array: " + Arrays.toString(neuesArray));
	    }

	    // Methode zum Löschen eines Elements
	    public static int[] deleteArrayElement(int[] a, int w) {
	        int index = -1;

	        // Suche nach dem Index des zu löschenden Elements
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == w) {
	                index = i;
	                break;
	            }
	        }

	        // Wenn das Element nicht gefunden wurde, gib das ursprüngliche Array zurück
	        if (index == -1) {
	            return a;
	        }

	        // Neues Array erstellen, das um ein Element kürzer ist
	        int[] neuesArray = new int[a.length - 1];

	        // Kopieren der Elemente vor und nach dem zu löschenden Element
	        System.arraycopy(a, 0, neuesArray, 0, index);
	        System.arraycopy(a, index + 1, neuesArray, index, a.length - index - 1);

	        return neuesArray;
	    }
	}