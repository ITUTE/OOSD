public class Client{
    public void Main(){
        // Cách 1
        MovieBuilder builder = new MovieBuilder(1, "Người bất tử", 1, 2018);
        builder.setActors("Victor Vũ");
        builder.setProduceCountry("Việt Nam");
        builder.setCreatedDate(LocalDateTime.now());
        Movie movie = builder.build();

        // Cách 2
        Director director = new Director();
        MovieBuilder builder2 = new MovieBuilder(2, "Mắt biếc", 1, 2019);
        director.makeMovie(builder2);
        Movie movie2 = builder2.build();
    }
}