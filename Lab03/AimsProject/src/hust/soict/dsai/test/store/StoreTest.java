package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(10);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 29.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 19.99f);

        // Test addDVD method
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Test printItemsInStore method
        store.printItemsInStore();

        // Test removeDVD method
        store.removeDVD(dvd1);

        // Test printItemsInStore method after removal
        store.printItemsInStore();
    }
}