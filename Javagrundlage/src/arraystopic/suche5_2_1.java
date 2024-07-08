package arraystopic;
import java.util.ArrayList;
import java.util.List;

public class suche5_2_1 {
	
	public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 7, 9, 1, 9, 6};

        // Teil 1: Größtes Element finden
        int groesstesElement = findGroesstesElement(array);
        System.out.println("Größtes Element: " + groesstesElement);

        // Teil 2: Größtes Element und seinen Index finden
        int indexGroesstesElement = findIndexGroesstesElement(array);
        System.out.println("Index des größten Elements: " + indexGroesstesElement);

        // Teil 3: Alle Indixes des größten Elements finden
        List<Integer> indixesGroesstesElement = findAllIndixesGroesstesElement(array);
        System.out.println("Indixes des größten Elements: " + indixesGroesstesElement);
    }

    // Methode für Teil 1
    public static int findGroesstesElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Methode für Teil 2
    public static int findIndexGroesstesElement(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    // Methode für Teil 3
    public static List<Integer> findAllIndixesGroesstesElement(int[] array) {
        int max = array[0];
        List<Integer> indixes = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                indixes.add(i);
            }
        }
        return indixes;
    }
}