package biblioteca;

public class Biblioteca {
	
	private Libro[] libri;
	
	
	public Biblioteca() {
		libri = new Libro[15];
	}
	
	private void aumentaCapienza() {
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
	
	public Libro cercaLibro(String isbn) {
		for(int i=0; i<libri.length; i++) {
			if(libri[i].getIsbn().equals(isbn)) {
				return libri[i];
			}
		}
		return null;
	}
	
	public void rimuovereLibro(String isbn) {
		for(int i=0; i<this.libri.length; i++) {
			if(libri[i].getIsbn().equals(isbn)) {
				libri[i] = null;
			}
		}
		riordinaLibri();
	}
	
	private void riordinaLibri() {
		for(int i=0; i<libri.length-1; i++) {
			if(libri[i] == null) {
				libri[i] = libri[i+1];
				libri[i+1] = null;
			}
		}
	}

}
