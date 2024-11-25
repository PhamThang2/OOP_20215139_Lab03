package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qtyInStore;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                found = true;
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                qtyInStore--;
                System.out.println("DVD has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("DVD is not in the store.");
        }
    }

    // Additional method to print DVDs in the store
    public void printItemsInStore() {
        System.out.println("DVDs in the store:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println(itemsInStore[i]);
        }
        System.out.println("Total DVDs in the store: " + qtyInStore);
    }
}