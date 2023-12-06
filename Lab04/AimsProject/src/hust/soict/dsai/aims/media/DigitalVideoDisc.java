//Bùi Khánh Hoàng 20215273
package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
    private int length;
    
    public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
	}
	
	/**
     * The function takes the information stored in the object and returns it as a string
     *
     * @return A string representation of the DVD object.
     */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DVD - ");
		if (super.getTitle() != null) {
		builder.append(super.getTitle());
		}
		builder.append(" - ");
		if (super.getCategory() != null) {
		builder.append(super.getCategory());
		}
		builder.append(" - ");
		if (director != null) {
		builder.append(director);
		}
		builder.append(" - ");
		if (length > 0) {
		builder.append(length).append(" minutes");
		}
		builder.append(": ");
		if (super.getCost() >= 0) {builder.append(String.format("%.2f $", super.getCost()));
		}
		return builder.toString();
	}
	
    /**
     * This function returns true if the title of the book is equal to the title passed in as a parameter.
     *
     * @param title The title of the page.
     * @return The boolean value of the comparison of the title of the book to the title of the book being searched for.
     */
	public int getID(){
		return id;
	}
	
    @Override
    public void play() {
    	System.out.println("Playing DVD: "+this.getTitle());
    	System.out.println("DVD length: "+this.getLength());
    	System.out.println("Category: " + getCategory());
    	System.out.println("Director: " + getDirector());
    	System.out.println("Cost: " + getCost() + " $");
    }
}
