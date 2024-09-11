
public abstract class Media {
/**
<<<<<<< HEAD
 * Media is an abstract class that has two protected constructors and four private fields
=======
 * 
>>>>>>> af03345cfd432b45abeaf9269f7d0950dd27b025
 */
private String title;
private String category; 
private int year; 
private long size; 

protected Media() {
	
}

/**
 * 
 * @param title
 * @param category
 * @param year
 * @param size
 */

protected Media(String title, String category, int year, long size) {
	this.title = title;
	this.category = category; 
	this.year = year; 
	this.size = size; 
}


/**
 * 
 * @return title
 */
public String getTitle() {
	return this.title;
}
/**
 * 
 * @return category
 */
public String getCategory() {
	return this.category;
}
/**
 * 
 * @return year
 */






public int getYear() {
	return this.year;
}

/**
 * 
 * @return size
 */
public long getSize() {
	return this.size;
}
/**
 * First instance of toString method, other inherited classes will override this 
 */



public String toString() {
	return String.format("%-35s\t%-15s\t%-4d\t%-10d",
            title, category, year, size);

}


/**
 * 
 * @param title
 */
public void setTitle(String title) {
	this.title = title;
}
/**
 * 
 * @param category
 */
public void setCategory(String category) {
	this.category = category; 
}
/**
 * 
 * @param year
 */
public void setYear(int year) {
	this.year = year;
}
/**
 * 
 * @param size
 */



public void setSize(long size) {
	this.size = size; 
}
}


