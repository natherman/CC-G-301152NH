package thema7.oop.uml.bib;

public class Buch {

	private String title;
	
	private String autor;
	
	private String isbn;
	
	public Buch(String title, String autor, String isbn) {
		super();
		
		this.title = title;
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Buch [title=" + title + ", autor=" + autor + ", isbn=" + isbn + "]\n";
	}	

}
