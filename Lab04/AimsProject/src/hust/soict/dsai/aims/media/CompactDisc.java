//Bùi Khánh Hoàng 20215273
package hust.soict.dsai.aims.media;
import java.util.List;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc(String title, String category, float cost, String artist) {
		super(title, category, cost);
		this.artist = artist;
	}

    public boolean addTrack(Track newTrack) {
        if(tracks.contains(newTrack)){
            return false;
        } else {
            tracks.add(newTrack);
            return true;
        }
    }

    public boolean removeTrack(Track track) {
        if(tracks.contains(track)){
            tracks.remove(track);
            return true;
        } else {
            return false;
        }
    }

    public int getLength(){
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
          }
        return total;
    }
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	builder.append("CompactDisc - ");
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
    	builder.append(" - ");
    	if (artist != null) {
    	builder.append("Artist: ").append(artist);
    	}
    	return builder.toString();
    }
    @Override
    public void play(){
    	System.out.println("CD Title: " + getTitle());
    	System.out.println("Category: " + getCategory());
    	System.out.println("Artist: " + artist);
    	System.out.println("Director: " + getDirector());
    	System.out.println("Cost: " + getCost() + " $");
    	System.out.println("CD Length: " + getLength() + " minutes");
    	System.out.println("\nTracks:");
    	for (Track track : tracks) {
    	track.play();
    	}
    }
}
