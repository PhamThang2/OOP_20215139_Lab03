package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Gergre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());



		anOrder.removeDigitalVideoDisc(dvd2);

		System.out.println("Total Cost after removing a disc is: ");
		System.out.println(anOrder.totalCost());





		
		// Print the list of ordered items and total cost
        anOrder.printCart();

        // Search for a DVD by ID
        anOrder.searchByID(1);

        // Search for DVDs by title
        anOrder.searchByTitle("Star Wars");
	}

}
