//Bui Khanh Hoang 20215273
import java.util.ArrayList;

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
        System.out.println("\n-------Your Cart -------\n");
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
}