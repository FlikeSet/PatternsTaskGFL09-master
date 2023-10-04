package patterns.example.decorator;

import patterns.example.Movie;

import java.util.List;

public class Director extends AbstractMovie {
    private final String director;

    public Director(Movie movie, String director) {
        super(movie);
        this.director = director;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public String getCountryOfOrigin() {
        return super.getCountryOfOrigin();
    }

    @Override
    public String getShortDescription() {
        return super.getShortDescription();
    }

    @Override
    public List<String> getActors() {
        return super.getActors();
    }
}
