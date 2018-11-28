
public class DocumentManager {
	static Book b;
	private DocumentManager() {}
	private static class DocumentManagerHolder {
        private static final DocumentManager INSTANCE = new DocumentManager();
    }
	static DocumentManager getInstance() {
		return DocumentManagerHolder.INSTANCE;
	}

	public void setBook(Book playboy) {
		// TODO Auto-generated method stub
		this.b=playboy;
	}

	public static Book getBook() {
		// TODO Auto-generated method stub
		return b;
	}

}
