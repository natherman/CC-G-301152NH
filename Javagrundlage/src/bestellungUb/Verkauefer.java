package bestellungUb;

import java.util.List;

public class Verkauefer {

	private String name;

	private List<Produkt> produkte;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name:\t" + name;
	}

	public List<Produkt> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<Produkt> produkte) {
		this.produkte = produkte;
	}

	public Verkauefer(String name, List<Produkt> produkte) {
		super();
		this.name = name;
		this.produkte = produkte;
	}
	public Verkauefer(String name) {
		super();
		this.name = name;
		
	}
}
