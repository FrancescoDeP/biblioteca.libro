package biblioteca;

public class Biblioteca {
	
	private Libro[] libri;
	
	
	public Biblioteca() {
		libri = new Libro[15];
	}
	
	public void aumentaCapienza() {
		Libro[] array = new Libro[libri.length + 1];
		for(int i=0; i<libri.length; i++) {
			array[i] = libri[i];
		}
		this.libri = array;
	}
	
	public void aggiungiLibro(Libro l) {
		if(libri[libri.length-1] !=  null) {
			aumentaCapienza();
		}
		for(int i=0; i<libri.length; i++) {
			if(libri[i] == null) {
			libri[i] = l;
			break;
			}
		}
	}
	
	public void stampaLibro() {
		for(int i=0; i<libri.length; i++) {
			if(libri[i] != null) {
				System.out.println(libri[i]);
			}
		}
	}
	
	public void cercaLibro(String isbn) {
		for(int i=0; i<libri.length; i++) {
			if(libri[i].getIsbn().equals(isbn)) {
				System.out.println(libri[i].toString());
			}
		}
	}
	
	public void rimuovereLibro(String isbn) {
		for(int i=0; i<this.libri.length; i++) {
			if(libri[i].getIsbn().equals(isbn)) {
				libri[i] = null;
			}
		}
	}

}
