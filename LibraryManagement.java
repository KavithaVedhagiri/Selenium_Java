package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		Library libraryData = new Library();
		String bookName = libraryData.addBook("Success Through a positive mental attitude");
		System.out.println(bookName);
		libraryData.issueBook();

	}
	

}
