package edu.knoldus;

public class Movie {

    String name;
    int releaseYear;
    int rating;
    String genre;

    public Movie(String name, int releaseYear,int rating,String genre){
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie[Name = " + name + " Realease Year = " + releaseYear + " Rating = " + rating + " Genre = " + genre + "]";
    }
}
