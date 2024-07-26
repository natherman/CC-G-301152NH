package bestellungUb;

import java.util.ArrayList;
import java.util.List;

public class ProgrammBestellung {

	public static void main(String[] args) {
		Verkauefer marineLaden = new Verkauefer ("MarineLaden");
		System.out.println(marineLaden);
	List <Produkt> produktliste = new ArrayList<Produkt>();
	Produkt produkt1 = new Produkt(1,"Gardenelen",2.99);
	produktliste.add(produkt1);
	Produkt produkt2 = new Produkt(2,"Gardenelen2",1.99);
	produktliste.add(produkt2);
	System.out.println(produktliste);
	}
}
