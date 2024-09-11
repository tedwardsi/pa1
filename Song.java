
public class Song extends Media {
	/**
	 * Song class is inherits from Media class
	 * Initializes artist variable
	 */
private String artist; 

public Song() {
	
}
/**
 * 
 * @param title
 * @param category
 * @param year
 * @param size
 * @param artist
 */
public Song(String title, String category, int year, long size, String artist) {
	super(title,category,year,size);
	this.artist = artist; 
}

/**
 * 
 * @return artist
 */
public String getArtist() {
	return this.artist;
}
/**
 * 
 * @param artist
 */
public void setArtist(String artist) {
	this.artist = artist; 
}
@Override
/**
 * Calls the toString() of the Media class, then adds in artist variable 
 */
public String toString() {
	 return String.format("%-5s\t%s\t%-15s", "Song",super.toString(),artist);
}



}
