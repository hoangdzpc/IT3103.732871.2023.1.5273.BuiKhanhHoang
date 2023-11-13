//Bui Khanh Hoang 20215273
package hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;
     
    public void setTitle(String title) {
		this.title = title;
	}	
	public String getTitle() {
		return title;
	}
	public int getId() {
		return id;
	}
	public int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	/**
     * The function takes informations from the object and returns it as a string
     *
     * @return A string representation of the DVD object.
     */
    public String toString(){
    	StringBuffer printDisc = new StringBuffer();
        printDisc.append("DVD");
        printDisc.append(" - ");
        printDisc.append(title);
        printDisc.append(" - ");
        printDisc.append(category);
        printDisc.append(" - ");
        printDisc.append(director);
        printDisc.append(" - ");
        printDisc.append(length);
        printDisc.append(": ");
        printDisc.append(cost);
        return  printDisc.toString();
    }
    /**
     * This function print message about the comparison the id of the book and id in parameter .
     *
     * @param id of the page.
     * @return The message about the comparison of the id of the book to the id of the book 
     * being searched for.
     */
    public void isMatch(int id) {
    	if (this.id==id) {
    		System.out.printf("%-20s \n", this.getTitle());
    	} else {
    		System.out.printf("ID NO FOUND");
    	}
    }
    /**
     * This function returns true if the title of the book and title in parameter are the same.
     *
     * @param title of the page.
     * @return The boolean value of the comparison of the title of the book to the title of
     *  the book being searched for.
     */
    public boolean isMatch(String title){
        return this.title.equals(title);
    }
}

	
