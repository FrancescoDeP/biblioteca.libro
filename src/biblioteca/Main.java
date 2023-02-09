package biblioteca;

public class Main {

	public static void main(String[] args) {
		
		Libro[] libri = new Libro[15];

		Libro l1 = new Libro("Java Academy", "J.R.", 100, "1");
		Libro l2 = new Libro("JavaScript", "P.R.", 79, "2");
		Libro l3 = new Libro("Bootstrap", "J.K.", 110, "3");
		Libro l4 = new Libro("MySql", "F.K.", 200, "4");
		Libro l5 = new Libro("HTML", "Mark T.", 300, "5");
		Libro l6 = new Libro("SQL", "F.R.T.", 245, "6");
		Libro l7 = new Libro("CSS", "S.R.", 120, "7");
		Libro l8 = new Libro("Windows", "B.G.", 500, "8");
		Libro l9 = new Libro("Apple", "S.J.", 600, "9");
		Libro l10 = new Libro("Cod", "Van.B.", 300, "10");
		Libro l11 = new Libro("Rainbow 6", "Ubisoft", 243, "11");
		Libro l12 = new Libro("Harry Potter", "J.K.R.", 350, "12");
		Libro l13 = new Libro("Il signore degli anelli", "T.R.", 259, "13");
		Libro l14 = new Libro("The Big Bang Theory", "V.J.", 800, "14");
		Libro l15 = new Libro("Modern Family", "G.H.", 900, "15");
		
		Biblioteca b = new Biblioteca();
		b.aggiungiLibro(l1);
		b.aggiungiLibro(l2);
		b.aggiungiLibro(l3);
		b.aggiungiLibro(l4);
		b.aggiungiLibro(l5);
		b.aggiungiLibro(l6);
		b.aggiungiLibro(l7);
		b.aggiungiLibro(l8);
		b.aggiungiLibro(l9);
		b.aggiungiLibro(l10);
		b.aggiungiLibro(l11);
		b.aggiungiLibro(l12);
		b.aggiungiLibro(l13);
		b.aggiungiLibro(l14);
		b.aggiungiLibro(l15);
		
		//aggiungi libro
		System.out.println("//aumenta lunghezza array ed aggiungi libro//");
		Libro l16 = new Libro("Attacco dei Giganti", "Hajime Isayama", 1000, "16");
		b.aggiungiLibro(l16);
		b.stampaLibro();
		System.out.println("-----------------------------");
		
		//cerca libro per isbn
		System.out.println("//cerca libro per ISBN//");
		b.cercaLibro("12");
		System.out.println("-----------------------------");
		
		//rimuovere libro
		System.out.println("//rimuovere libro//");
		b.rimuovereLibro("2");
		b.stampaLibro();
		
		
		
	}

}
