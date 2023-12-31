//Bùi Khánh Hoàng 20215273
package hust.soict.dsai.aims.media;
import java.util.List;
import java.util.ArrayList;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public List<String> getAuthors() {
		return authors;
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		this.id=nbMedia;
		nbMedia++;
	}
	
	public Book(String title, String category, float cost,List<String> author){
		super(title, category, cost);
		this.authors=author;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		int n = authors.size();
		int check = 0;
		for (int i=0;i<=n;i++) {
			if (authors.get(i)== authorName) {
				check = 1;
				break;
			}
		}
		if (check == 1) System.out.println("This author name already existed!");
		else if (check == 0) authors.add(authorName);
	}

	public void removeAuthor(String authorName) {
		int n = authors.size();
		int check = 0;
		for (int i = 0; i<= n; i++) {
			if (authors.get(i)== authorName) {
				check = i;
				break;
			}
		}
		if (check == 0) System.out.println("This author name doesn't exist!");
		else authors.remove(check);
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();builder.append("Book - ");
		if (super.getTitle() != null) {
		builder.append(super.getTitle());
		}
		builder.append(" - ");
		if (super.getCategory() != null) {
		builder.append(super.getCategory());
		}
		builder.append(" - ");
		if (super.getCost() >= 0) {
		builder.append(String.format("%.2f $", super.getCost()));
		}
		return builder.toString();
		}
}
