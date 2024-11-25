package models;

import DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }


    public void addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
        for (DigitalVideoDisc dvd : dvdArray) {
            addDigitalVideoDisc(dvd); 
        }
    }


    // cart.addDigitalVideoDisc(dvd1, dvd2);
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }


        // Print the cart details:
        
        public void printCart() {
            System.out.println("***********************CART***********************");
            System.out.println("Ordered Items:");
            for (int i = 0; i < qtyOrdered; i++) {
                DigitalVideoDisc dvd = itemsOrdered[i];
                System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                        i + 1, dvd.getTitle(), dvd.getCategory(), dvd.getDirector(),
                        dvd.getLength(), dvd.getCost());
            }
            System.out.printf("Total cost: %.2f $\n", totalCost());
            System.out.println("***************************************************");
        }

        public void searchByID(int id) {
            if (id > 0 && id <= qtyOrdered) {
                System.out.println("DVD found:");
                System.out.println(itemOrdered[id - 1]);
            } else {
                System.out.println("No match found. Invalid DVD ID.");
            }
        }

    
        public void searchByTitle(String title) {
            boolean found = false;
            System.out.println("Search results by title:");
    
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemOrdered[i].isMatch(title)) {
                    System.out.println(itemOrdered[i]);
                    found = true;
                }
            }
    
            if (!found) {
                System.out.println("No match found for the title: " + title);
            }
        }
}
