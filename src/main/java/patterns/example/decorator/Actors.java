package patterns.example.decorator;

import patterns.example.Movie;

import java.util.List;

public class Actors extends AbstractMovie {
    private final List<String> actors;

    public Actors(Movie movie, List<String> actors) {
        super(movie);
        this.actors = actors;
    }

    @Override
    public List<String> getActors() {
        return actors;
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
    public String getDirector() {
        return super.getDirector();
    }
}
