//Bui Khanh Hoang 20215273
package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import hust.soict.dsai.aims.cart.Cart.*;
import hust.soict.dsai.aims.disc.Media.Media;

public class Store {
		ArrayList<Media> itemInStore = new ArrayList<Media>();
		public void addDVD(Media disc) {			
	            itemInStore.add(disc);	        
	            System.out.println("The disc has been added to the store");
	        }
		public void removeMedia(Media disc) {
			itemInStore.remove(disc);
			System.out.printf("The disc %s has been removed from store\n",disc.getTitle());
		}

	}

