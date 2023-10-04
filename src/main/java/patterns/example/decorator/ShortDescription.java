package patterns.example.decorator;

import patterns.example.Movie;

import java.util.List;

public class ShortDescription extends AbstractMovie {
    private final String shortDescription;

    public ShortDescription(Movie movie, String shortDescription) {
        super(movie);
        this.shortDescription = shortDescription;
    }

    @Override
    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public String getCountryOfOrigin() {
        return super.getCountryOfOrigin();
    }

    @Override
    public String getDirector() {
        return super.getDirector();
    }

    @Override
    public List<String> getActors() {
        return super.getActors();
    }
}
