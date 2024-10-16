package week1.day3;

public class Library {
     
	public String addBook(String bookTitle) {
		
		return "Book title is : "+bookTitle;
	}
	void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library libraryData = new Library();
		String bookName = libraryData.addBook("Free to Focus");
		System.out.println(bookName);
		libraryData.issueBook();

	}

}
