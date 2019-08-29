/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author Horikss
 */
public class Book {
	Autor Autor;
	Description Description;
	int Price;

	public Book(Autor Autor, Description Description, int Price) {
		this.Autor = Autor;
		this.Description = Description;
		this.Price = Price;
	}

	public String getAutor(String Autor) {
		return Autor;
	}

	public String getDescription(String Description) {
		return Description;
	}

	public int getPrice(int Price) {
		return Price;
	}

	@Override
	public String toString() {
		return "Autor: " + Autor + " Description: " + Description + " Price: " + Price;
	}

}
