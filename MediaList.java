import java.util.ArrayList;
public class MediaList {
/**
 * MediaList class has a Has-a relationship with Media class
 * Count is used to keep track of number of media added to static media[10]
 * Constructor initializes media[] with 10 fields
 */
	private int count;
	private Media[] media;
	public MediaList() {
		media = new Media[10];
		count = 0; 
	}
	/**
	 * 
	 * @return count
	 */
	public int size() {
		return count; 
	}
	/**
	 * 
	 * @param m
	 * @return true if there is space for a new media to be added to media[], if so, count is incremented by 1 , if count is == 10 then there is no space left, so the method will return false
	 */
	public boolean add(Media m) {
		if(count != 10) {
			media[count] = m;
			count++;
			return true; 
		} else {
			return false; 
		}
	}
	
	/**
	 * 
	 * @param title
	 * Loops through the media array and calls the getTitle() method on each class, if the parameter matches the title, it will return the media object
	 * @return i
	 */
	public Media findTitle(String title )
	{
		
		for(Media i: media) {
			if(i.getTitle() == title) {
				return i;
			}
		}
		return null; 
	}
	
	/**
	 * 
	 * @param category
	 * Creates a dynamic array list to store variables that match category
	 * Loops through media array and adds in media objects to the list that have the same return for getCategory as the category parameter
	 * Checks if the sortedList has any matches
	 * If so, it will create an array with the size of the matches and loop through the list adding them into the array
	 * Returns the array
	 * If the array list does not have any matches it will return null
	 * 
	 */
	public Media[] findCategory(String category)
	{
		
		ArrayList<Media> sortedMediaList = new ArrayList<Media>();
		
		for(Media i: media) {
			if(i.getCategory() == category) {
				sortedMediaList.add(i);
			}
		}
		
		
		if(sortedMediaList.size() > 0) {
			Media[] sortedMediaArray = new Media[sortedMediaList.size()];
			for(int i = 0; i< sortedMediaArray.length;i++) {
				sortedMediaArray[i] = sortedMediaList.get(i);
			}
			return sortedMediaArray;
		}
		
		return null; 
	}
	/**
	 * 
	 * @param category
	 * Creates a dynamic array list to store variables that match year
	 * Loops through media array and adds in media objects to the list that have the same return for getYear as the category parameter
	 * Checks if the sortedList has any matches
	 * If so, it will create an array with the size of the matches and loop through the list adding them into the array
	 * Returns the array
	 * If the array list does not have any matches it will return null
	 * 
	 */
	public Media[] findYear(int year )
	{
		ArrayList<Media> sortedMediaList = new ArrayList<Media>();
		for(Media i: media) {
			if(i.getYear() == year) {
				sortedMediaList.add(i);
			}
		}
		if(sortedMediaList.size() > 0) {
			Media[] sortedMediaArray = new Media[sortedMediaList.size()];
			for(int i = 0; i< sortedMediaArray.length;i++) {
				sortedMediaArray[i] = sortedMediaList.get(i);
			}
			return sortedMediaArray;
		}
		
		return null; 
	}
	/**
	 * 
	 * @param title
	 * The first loop will loop through all of the defined instances of array and see if there is a match to the title that needs to be removed
	 * If so, the removedIndex variable will  be set to that of where the title is found in the array
	 * K will be set to the removed index and loop through the rest of the defined array
	 * K will be set to the next index and the title will be overwritten
	 * The two last indexes will be the same object, so the final defined index will be overwritten as null 
	 * The count is decremented and the loop is ended with break; 
	 * @return If there was a match, it will return found = true, else found = false 
	 * 
	 */
	public boolean remove(String title) {
		boolean found = false; 
		int remIndex; 
		for(int i = 0 ; i < count - 1; i++) {
			if(media[i].getTitle() == title) {
				found =  true;
				remIndex = i;
				for(int k = remIndex; k< count - 1; k++) {
					media[k] = media[k+1];
				}
				media[count - 1]= null; 
				count--;
				break;	
			}
		}
		return found;
	}
	
/**
 * 
 * @param title
 * 
 * The sort method will use a boolean to check whether to sort from title(true) or category(false)
 * To sort, it will define a media object as the second instance of the array
 * it will loop all of the defined instances of the array 
 * J is defined as i 
 * the while loop will check if j > 0 , then check if the current instance of the array is higher in alphabetical order than the previous
 * if that is true, the current instance is set to the previous instance, and j is decremented --
 * then the previous instance is set to the currentInstance that was stored in the currentValVariable
 * It will continue checking and performing this algorithm until the array is sorted in alphabetical order
 */
	 public void sort(boolean title) {
	     
	        if (title) {
	            for (int i = 1; i < count; i++) {
	                Media currentVal = media[i];
	                int j = i;
	                while (j > 0 && currentVal.getTitle().compareTo(media[j - 1].getTitle()) < 0) {     
	                    media[j] = media[j - 1];
	                    j--;
	                }
	                media[j] = currentVal;
	            }
	        } else {
	            // Sort by category
	            for (int i = 1; i < count; i++) {
	                Media currentVal = media[i];
	                int j = i;
	                while (j > 0 && currentVal.getCategory().compareTo(media[j - 1].getCategory()) < 0) {     
	                    media[j] = media[j - 1];
	                    j--;
	                }
	                media[j] = currentVal;
	            }
	        }
	    }



	
	
	@Override
	/**
	 * Overrides the default toString() method
	 * Prints out titles of the categories to create a tabular format
	 * Defines totalString as a null variable
	 * Loops through all of the media objects and calls their individual toString() methods using polymorphism, then uses \n to create a  new line
	 * returns the totalString variable after it is done looping 
	 */
	public String toString() {
		System.out.printf("Type\tTitle\t\t\t\t\tCategory\t\tYear\tSize(KB)\t\tArtist/Director Revenue \n");
		String totalString = "";
	
		for(int i = 0; i< count;i++) {
			totalString +=  media[i].toString() + "\n";
		}
		
		
		return totalString; 
	
		
		
	}
}
