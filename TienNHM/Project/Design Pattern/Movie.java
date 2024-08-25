public class Movie {
	private int MovieID;
	private String Name;
	private Image Poster;
	private ArrayList<DateTime> Time;
	private String MovieDirector;
	private ArrayList<String> Actor;
	private DateTime ProduceYear;
	private int TypeID;
	private String ProduceCountry;
	private ArrayList<Image> Images;
	private String LinkTrailer;
	private String Content;
	private DateTime CreatedDate;

	public Movie(int id, String name, int typeID, int produceYear){
		this.MovieID = id;
		this.Name = name;
		this.TypeID = typeID;
		this.ProduceYear = produceYear;
	}

	//Getters, Setters
	....
}
