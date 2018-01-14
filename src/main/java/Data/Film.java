package Data;

/**
 * Created by pietervanroij on 22/12/2017.
 */

public class Film {


    private int ID;
    private String Title;
    private String Country;
    private int Year;
    private String Plot;
    private String Director;
    private String  Actors;
    private double imdbRating;
    private String Poster;
    private String Genre;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        this.Plot = plot;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        this.Director = director;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        this.Actors = actors;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        this.Poster = poster;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        this.Genre = genre;
    }

    public void printAll() {
        System.out.println(Title);
        System.out.println(Year);
        System.out.println(Country);
        System.out.println(Director);
        System.out.println(Actors);
        System.out.println(Genre);
        System.out.println(Plot);
        System.out.println(imdbRating);

    }

}
