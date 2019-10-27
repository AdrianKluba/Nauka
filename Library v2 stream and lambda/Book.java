package library.v2;
 
public class Book {

	String author;
	String description;
	boolean borrow;
	int price;

	public book(String author, String description, boolean borrow, int price) {
        this.author = author;
        this.description = description;
        this.borrow = borrow;
        this.price = price;
    }

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public String getDescription() {
		return description;
	}

	public boolean isBorrow() {
		return borrow;
	}

	public int getPrice() {
		return price;
	}

}
