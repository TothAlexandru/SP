
public class OpenCommand implements Command {
public String b;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	    Image img1 = new Image("Pamela Anderson");
	    Image img2 = new Image("Kim Kardashian");
	    Image img3 = new Image("Kirby Griffin");
	    Section playboyS1 = new Section("Front Cover");
	    playboyS1.add(img1);
	    Section playboyS2 = new Section("Summer Girls");
	    playboyS2.add(img2);
	    playboyS2.add(img3);
	    Book playboy = new Book("Playboy");
	    playboy.add(playboyS1);
	    playboy.add(playboyS2);
	    
	    DocumentManager.getInstance().setBook(playboy);
	}
}
