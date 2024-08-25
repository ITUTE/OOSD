public interface Builder {
	Director director;
	Movie setImages(ArrayList<Image> images);
	Movie setContent(String content);
	Movie setLinkTrailer(String link);
	Movie setPoster(Image poster);
	Movie setActors(ArrayList<String> actors);
	Movie setDirector(String director);
	Movie setProduceCountry(String country);
	Movie setTime(ArrayList<DateTime> times);
	Movie reset();
}
