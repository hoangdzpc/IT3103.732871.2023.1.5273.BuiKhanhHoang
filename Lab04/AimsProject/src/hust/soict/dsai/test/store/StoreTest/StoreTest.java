//Bui Khanh Hoang 20215273
package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	public static void main(String[] args) {
        DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Aller",87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "Gerge Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);
        Store store = new Store();
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
	}
}