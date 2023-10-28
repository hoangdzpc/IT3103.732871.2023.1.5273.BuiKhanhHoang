//Bui Khanh Hoang 20215273
public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King",
				"Animation","Roger Allder", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Sci-fi","Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation","Roger Allder", 87, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//In thong tin gio hang
		System.out.println();
        anOrder.displayCart();
		
        //Tinh tong tien thanh toan
        System.out.printf("Total: %5.2f \n", anOrder.totalCost());
        
        // Remove DVD3 from cart
        System.out.println();
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.displayCart();
	}

}