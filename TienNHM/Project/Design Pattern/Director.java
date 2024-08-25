public class Director {
	public Builder builder;
	public void makeMovie(MovieBuilder builder) {
		builder.setCreatedDate(LocalDateTime.now());
	}
}
