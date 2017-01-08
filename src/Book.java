


/** class Book is a class where Book character and method defined

 */
public class Book implements PlayerItem   {
	String bookName;
	String author ;
	int yearofPublished;
	int edition;

	/**
	* Constructor for book class
		*/
	public Book() {
	}


	/**
	* Constructor for book class
	* @param s the name of the book to be created.
		*/
	public Book(String s) {
      this.bookName = s;
	}


	/**
	* Constructor for book class
	* @param bookName the name of the book to be created
	* @param author the author of the book the be created
	* @param edition the edition of the book
		*/
public Book(String bookName, String author, int yearofPublished, int edition) {
		this.bookName = bookName;
		this.author = author;
		this.yearofPublished = yearofPublished;
		this.edition = edition;
	}

	/**
	* Gets the books namne
	* @return the books name.
		*/
	public String returnName() {
		return this.bookName;
	}


	/**
	* Sets the books namne
	* @param bookName the new name.
		*/
	public void setCourseBook(String bookName) {
		this.bookName = bookName;
	}

	/**
	* Checks if the book is a key.
	* @return false, since a book can not be used as a key.
		*/
public boolean isKey(){
	return false;
}








public static void main(String [] args) {



	}
}
