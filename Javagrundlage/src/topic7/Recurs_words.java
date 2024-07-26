package topic7;

public class Recurs_words {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * public static void main(String[] args) {
 
		String input1 = "Hallo";
		StringBuilder inputText1 = new StringBuilder(input1);
		System.out.println("reverse(" + inputText1 + ") = " + inputText1.reverse());
 
		String input2 = "LANA";
		StringBuilder inputText2 = new StringBuilder(input2);
		System.out.println("reverse(" + inputText2 + ") = " + inputText2.reverse());
 
}
}
 /*
		String word = IO.promptAndReadString("Write a word?");
		String umgekehrt;
		String word = new String umgekehrt;
		System.out.println("new word is" + word);
		char result }
*/
		public static String umkehrenString(String str) {
	        // Basisfall: Wenn der String leer ist oder nur ein Zeichen enthält
	        if (str.isEmpty()) {
	            return str;
	        }
	        // Rekursiver Fall: Umkehren des restlichen Strings und Hinzufügen des ersten Zeichens am Ende
	        return umkehrenString(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args) {
	        String original = "Marina";
	        String umgekehrt = umkehrenString(original);
	        System.out.println("Der umgekehrte String ist: " + umgekehrt);
	    }
	}

