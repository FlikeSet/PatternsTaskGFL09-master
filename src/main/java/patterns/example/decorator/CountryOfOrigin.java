package patterns.example.decorator;

import patterns.example.Movie;

import java.util.List;

public class CountryOfOrigin extends AbstractMovie {
    private final String countryOfOrigin;

    public CountryOfOrigin(Movie movie, String countryOfOrigin) {
        super(movie);
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String getShortDescription() {
        return super.getShortDescription();
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
