package topic7;

import grundlage.IO;
import java.util.Scanner;

public class testbuch {


	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your number? ");
        double number = scanner.nextDouble();
        
        System.out.print("Down1: ");
        down1(number);
        System.out.println();
        
        System.out.print("Down2: ");
        down2(number);
        System.out.println();
    }
    
   
    static void down1(double n) {
        if (n <= 0)
            return;
        System.out.print(n + ", ");
        down1(n - 1);
    }

  
    static void down2(double n) {
        if (n <= 0)
            return;
        down2(n - 1);
        System.out.print(n + ", ");
    }
}
			

