public class Movie extends Media{

/**
 * Movie class is inherited from  Media class
 * Initializes two new variables (String director, long revenue) 
 */



	private String director; 
	private long revenue;
	
	
	public Movie() {
		
	}

	/**
	 * 
	 * @param title
	 * @param category
	 * @param year
	 * @param size
	 * @param director
	 * @param revenue
	 */


	public Movie(String title, String category, int year, long size, String director, long revenue) {
		super(title, category, year, size); 
		this.director = director; 
		this.revenue  = revenue; 
	}

	/**
	 * 
	 * @return director
	 */
	public String getDirector() {
		return director; 
	}
	/**
	 * 
	 * @return revenue
	 */
	public long getRevenue() {
		return revenue; 
	}
	/**
	 * 
	 * @param director
	 */
	public void setDirector(String director) {
		this.director = director; 
	}
	/**
	 * 
	 * @param revenue
	 */
	public void setRevenue(long revenue) {
		this.revenue = revenue; 
	}
	/**
	 * 
	 * @return formated revenue
	 * Uses java.text.NumberFormat to format the revenue(long) into US dollars
	 */

	


	private String formatMoney(){
		  return java.text.NumberFormat.getCurrencyInstance(
		      new java.util.Locale("en", "US")).format(revenue);
		}

	/**
	 * Overrides the toString method of the media class
	 * Calls super of toString and adds in director and formatted revenue variables
	 */


	@Override
	public String toString() {
		return String.format("%-5s\t%s\t%-15s\t%s", "Movie",super.toString(),director,formatMoney());
	}
	
	
	
	

}
