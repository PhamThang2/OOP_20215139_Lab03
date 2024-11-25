package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDvd = new DigitalVideoDisc("Jungle");		
		DigitalVideoDisc cinderellaDvd = new DigitalVideoDisc("Cinderella");

		swap(jungleDvd, cinderellaDvd);

		System.out.println("Jungle dvd title: " + jungleDvd.getTitle());
		System.out.println("Cinderella dvd title: " + cinderellaDvd.getTitle());

		changeTitle(jungleDvd, cinderellaDvd.getTitle());
		System.out.println("Jungle dvd title: " + jungleDvd.getTitle());
	}

	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
