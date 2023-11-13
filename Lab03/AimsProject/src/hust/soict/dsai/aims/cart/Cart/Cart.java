//Bui Khanh Hoang 20215273
package hust.soict.dsai.aims.cart.Cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
public class Cart {
	public static final int MAX_NUMBERS_ORDER = 20;
	
	ArrayList<DigitalVideoDisc> itemsOrder = new ArrayList<DigitalVideoDisc>();
	
	private int qtyOrdered;
	
	public int getQtyOrder() {
        return qtyOrdered;
    }
	
//Kiem tra neu qtyOrdered < MAX_NUMBER_ORDER thi them DVD va tang qtyOrdered len 1
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDER){
            itemsOrder.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
	}
	
//In ra thong tin tat ca cac DVD trong gio hang
	public void displayCart() {
        System.out.println("\n**********Your Cart**********\n");
        for (DigitalVideoDisc disc : itemsOrder){
            System.out.printf("%-20s %-15s %-20s %-5d %-5.2f \n", disc.getTitle(), disc.getCategory(),
                    disc.getDirector(), disc.getLength(), disc.getCost());
        }
    }
	
//Tinh tong tat ca cac DVD trong gio hang
	public double totalCost() {
		double total = 0;
		for (DigitalVideoDisc disc : itemsOrder){
			total += (double) disc.getCost();
		}
		return total;
	}
	
//xoa DVD khoi gio hang va giam qtyOrdered di 1
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrder.remove(disc);
		qtyOrdered--;
		System.out.printf("The disc %s has been removed\n",disc.getTitle());
	}

//Phương pháp này sẽ thêm danh sách DVD vào giỏ hàng hiện tại.
	public boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
    for (int i = 0; i < dvdList.length; i++){
        if (qtyOrdered <= MAX_NUMBERS_ORDER){
            itemsOrder.add(dvdList[i]);
            qtyOrdered++;
        } else {
            System.out.println("The cart is full");
            return false;
        }
    }
    System.out.println("The discs has been added");
    return true;
}

/*Phương pháp thêm vào số lượng DVD ngẫu nhiên
	public boolean addDigitalVideoDisc(DigitalVideoDisc... dvdList){
	    for (int i = 0; i < dvdList.length; i++){
	        if (qtyOrdered <= MAX_NUMBERS_ORDER){
	            itemsOrder.add(dvdList[i]);
	            qtyOrdered++;
	        } else {
	            System.out.println("The cart is full");
	            return false;
	        }
	    }
	    System.out.println("The discs has been added");
	    return true;
	}
*/
//Phương thức thêm 2 dvd vào giỏ hàng.
	public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
	if (qtyOrdered < MAX_NUMBERS_ORDER -1){
        itemsOrder.add(dvd1);
        itemsOrder.add(dvd2);
        qtyOrdered+=2;
        System.out.println("You have added 2 discs");
        return true;
    } else {
        System.out.println("The cart is full");
        return false;
    }
}
	/**
	    * This function display cart according to the assignment required format
	    * ***********************CART***********************
		* Ordered Items:
		* 1. DVD - [Title] - [category] - [Director] - [Length]: [Prsice] $
		* 2. DVD - [Title] - ...
		* Total cost: [total cost]
		* ***************************************************
	*/
	public void print() {
     System.out.println("***********************CART***********************\nOrdered Items:");
     int i=1;
     double total = 0;
     for (DigitalVideoDisc disc : itemsOrder){
         System.out.printf("%d. DVD %-20s %-15s %-20s %-5d %-5.2f \n",i, disc.getTitle(), disc.getCategory(),
                 disc.getDirector(), disc.getLength(), disc.getCost());
         i++;
         total += (double) disc.getCost();
     }
     System.out.printf("Total cost: %f", total);
 }
	
	/**
  * It searches for a DVD in the cart by its id.
  * @param id of the DVD to search
  * @return The method returns a boolean value.
  */
 public boolean searchInCart(int id){
     for (DigitalVideoDisc disc: itemsOrder){
         if(disc.getId() == id){
             System.out.println(disc.toString());
             return true;
         }
     }
     System.out.println("Not found!");
     return false;
 }
	
}