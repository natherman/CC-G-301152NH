package thema7.oop.uml.bib;

import java.util.List;

public class Mitglied {

	private String name;
	
	private String mitgliedsnummer;
	
	List<Buch> ausgelieheneBuecher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMitgliedsnummer() {
		return mitgliedsnummer;
	}

	public Mitglied(String name, String mitgliedsnummer, List<Buch> ausgelieheneBuecher) {
		super();
		this.name = name;
		this.mitgliedsnummer = mitgliedsnummer;
		this.ausgelieheneBuecher = ausgelieheneBuecher;
	}

	public void setMitgliedsnummer(String mitgliedsnummer) {
		this.mitgliedsnummer = mitgliedsnummer;
	}

	public List<Buch> getAusgelieheneBuecher() {
		return ausgelieheneBuecher;
	}

	public void setAusgelieheneBuecher(List<Buch> ausgelieheneBuecher) {
		this.ausgelieheneBuecher = ausgelieheneBuecher;
	}

	@Override
	public String toString() {
		return "Mitglied [name=" + name + ", mitgliedsnummer=" + mitgliedsnummer + ", ausgelieheneBuecher="
				+ ausgelieheneBuecher + "]\n";
	}
	
	
	
}

