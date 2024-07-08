package Exs3;
import java.util.Scanner;

public class exerciseswitch2_ja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        do {
            System.out.println("Schreiben Sie die Zahl?");
            int Zahl = scanner.nextInt();
            
            switch (Zahl) {
                case 0, 1, 2, 3:           
                    System.out.println(Zahl + " ist im Bereich Null bis Drei");
                    break;
                case 4, 5, 6, 7:             
                    System.out.println(Zahl + " ist im Bereich Vier bis Sieben");
                    break;
                case 8, 9:                
                    System.out.println(Zahl + " ist im Bereich Acht bis Neun");
                    break;
                default:
                    System.out.println(Zahl + " ist außer definiertem Bereich");
            }
            System.out.println("Möchtest du fortfahren? Ja oder Nein");
            scanner.nextLine(); // Consume newline
            String Ant = scanner.nextLine(); 
            if (!Ant.equalsIgnoreCase("Ja"))  { //ignore Cases
                break;
            }
        } while (true);
      
        System.out.println("Bis später!"); 
        scanner.close();
    }
}