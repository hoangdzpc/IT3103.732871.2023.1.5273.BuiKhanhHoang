//Bùi Khánh Hoàng 20215273
package hust.soict.dsai.aims.media;

import java.util.Objects;

public class Track implements Playable{
	private String title;
    private int length;
    
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) return true;
    	if (obj == null || getClass() != obj.getClass()) return false;
    	Track otherTrack = (Track) obj;
    	return Objects.equals(title, otherTrack.title) && length == otherTrack.length;
    	}
    
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
