package practice;

class Library {
	String[] books;
	int no_of_books;

	Library() {
		this.books = new String[100];
		this.no_of_books = 0;
	}

	void addBook(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book + " has been added!");
	}

	void showAvailableBooks() {
		System.out.println("Available Books are:");
		for (String book : this.books) {
			if (book == null) {
				continue;
			}
			System.out.println("* " + book);
		}
	}

	void issueBook(String book) {
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i].equals(book)) {
				System.out.println("The book " + book + " has been issued!");
				this.books[i] = null;
				return;
			}
			System.out.println("This book doesn't exist!");
		}
	}

	void returnBook(String book) {
		addBook(book);
	}

}

public class ak_61_exercise4sol {

	public static void main(String[] args) {

		Library cl = new Library();
		cl.addBook("Fasttrack");
		cl.addBook("Capitalism");
		cl.addBook("ALgorithms");
		cl.showAvailableBooks();
		cl.issueBook("Fasttrack");
		cl.showAvailableBooks();
		cl.returnBook("Fasttrack");
		cl.showAvailableBooks();
	}
}
