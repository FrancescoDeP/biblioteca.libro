package biblioteca;

public class Libro {
	
	private String titolo;
	private String autore;
	private int pagine;
	private String isbn;
	
	public Libro() {
		
	}
	
	public Libro(String titolo, String autore, int pagine, String isbn) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
		this.isbn = isbn;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return  "ISBN: " + isbn + "\n"
				+ "Titolo: " + titolo + "\n"
				+ "Autore: " + autore + "\n"
				+ "Numero pagine: " + pagine;
	}
	
}
