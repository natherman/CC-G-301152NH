package bestellungUb;

public class Produkt {

	private int produktId;

	private String bezeihnung;
	
	private double preis;


	public Produkt(int produktId, String bezeihnung, double preis) {
		super();
		this.produktId = produktId;
		this.bezeihnung = bezeihnung;
		this.preis = preis;
	}

	public int getProduktId() {
		return produktId;
	}

	public void setProduktId(int produktId) {
		this.produktId = produktId;
	}

	public String getBezeihnung() {
		return bezeihnung;
	}

	public void setBezeihnung(String bezeihnung) {
		this.bezeihnung = bezeihnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	}


