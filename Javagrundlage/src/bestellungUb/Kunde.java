package bestellungUb;



public class Kunde {

	private int id;

	private String name;

	private String adresse;

	private String email;

	public Kunde(int id, String name, String adresse, String email) {
		super();
		this.id = id;
		this.name = name;
		this.adresse = adresse;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Kunde [id:\t " + id + "\nName:\t " + name + "\nAdresse:\t " + adresse + "\nemail:\t\t " + email + "]";
	}

}