public class MovieBuilder implements Builder {
	public Movie movie;
	public MovieBuilder(int id, String name, int typeID, int produceYear){
		this.movie = new Movie(id, name, typeID, produceYear);
	}
	public Movie setImages(ArrayList<Image> images) {
		this.movie.setImages(images);
	}
	public Movie setContent(String content) {
		this.movie.setContent(content);
	}
	public Movie setLinkTrailer(String link) {
		this.movie.setLinkTrailer(link);
	}
	public Movie setPoster(Image poster) {
		this.movie.setPoster(poster);
	}
	public Movie setActors(ArrayList<String> actors) {
		this.movie.setActors(actors);
	}
	public Movie setDirector(String director) {
		this.movie.setDirector(director);
	}
	public Movie setProduceCountry(String country) {
		this.movie.setProduceCountry(country);
	}
	public Movie setTime(ArrayList<DateTime> times) {
		this.movie.setTime(times);
	}
	public Movie setCreatedDate(ArrayList<DateTime> times) {
		this.movie.setCreatedDate(LocalDateTime.now());
	}
	public Movie build() {
		if (this.movie.getName() == null) return null;
		if (this.movie.getProduceYear() == null) return null;
		return this.movie;
	}
	public Movie reset() {
		this.movie.setImages(null);
		this.movie.setContent(null);
		this.movie.setLinkTrailer(null);
		this.movie.setPoster(null);
		this.movie.setActors(null);
		this.movie.setDirector(null);
		this.movie.setProduceCountry(null);
		this.movie.setTime(null);
		this.movie.setCreatedDate(null);
		return this.movie;
	}
}