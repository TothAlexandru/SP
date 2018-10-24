
public class Main {

	public static void main(String[] args) {
	    Book noapteBuna = new Book("Noapte buna,copii");
	    Author gheo = new Author("Radu Pavel Gheo");
	    noapteBuna.addAuthor(gheo);
	    noapteBuna.add(new Paragraph("Multumesc...."));
	    Section cap1 = new Section("Capitolul 1");
	    cap1.add(new Paragraph("Aici..."));
	    Element cap11 = new Section("SubCap 1.1");
	    cap11.add(new Section("SubCap 1.1.1"));
	    cap1.add(cap11);
	    noapteBuna.add(cap1);
	    noapteBuna.print();
	    
	    
	}

}
