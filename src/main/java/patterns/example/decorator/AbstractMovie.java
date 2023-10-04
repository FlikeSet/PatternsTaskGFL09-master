package patterns.example.decorator;

import patterns.example.Movie;

import java.util.List;

public abstract class AbstractMovie extends Movie {
    private final Movie movie;

    public AbstractMovie(Movie movie) {
        super(movie.getTitle(), movie.getPriceStrategy());
        this.movie = movie;
    }

    @Override
    public String getTitle() {
        return movie.getTitle();
    }

    public String getCountryOfOrigin() {
        return null;
    }

    public String getShortDescription() {
        return null;
    }

    public String getDirector() {
        return null;
    }

    public List<String> getActors() {
        return null;
    }
}
