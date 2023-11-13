//Bui Khanh Hoang 20215273
package hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
		ArrayList<DigitalVideoDisc> itemInStore = new ArrayList<DigitalVideoDisc>();
		public void addDVD(DigitalVideoDisc disc) {			
	            itemInStore.add(disc);	        
	            System.out.println("The disc has been added to the store");
	        }
		public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
			itemInStore.remove(disc);
			System.out.printf("The disc %s has been removed from store\n",disc.getTitle());
		}

	}

