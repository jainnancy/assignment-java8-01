package edu.knoldus;

import java.util.Arrays;
import java.util.List;

public class MovieOperations {

    Movie movie1 = new Movie("The Notebook", 2004, 8, "Romance");
    Movie movie2 = new Movie("The Vow", 2012, 7, "Romance");
    Movie movie3 = new Movie("Lady Bird", 2017, 9, "Comedy");
    Movie movie4 = new Movie("The Conjuring", 2013, 5, "Scary");
    Movie movie5 = new Movie("Avatar", 2009, 8, "Sci-Fi");
    Movie movie6 = new Movie("Black Panther", 20018, 8, "Sci-Fi");
    Movie movie7 = new Movie(" Avengers: Age of Ultron", 20015, 7, "Sci-Fi");
    List<Movie> movieList = Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6);

    public void displayFilteredList() {

        System.out.println("\nmovies with rating more than 8 and genre comedy.");
        printConditionally(movieList, movie -> movie.getRating() > 8 && movie.getGenre() == "Comedy");

        System.out.println("\nmovies with release year greater than 2000 and rating less than 8.");
        printConditionally(movieList,movie->movie.getReleaseYear() > 2000 && movie.rating < 8);

        System.out.println("\nmovies with rating as even number.");
        printConditionally(movieList,movie -> movie.rating % 2 == 0);

        System.out.println("\nmovies with rating equals to 7 and genre Sci-Fi.");
       printConditionally(movieList,movie -> movie.rating == 7 && movie.getGenre() == "Sci-Fi");

    }

    public void printConditionally(List<Movie> movies, Condition condition){
        for (Movie m : movieList) {
            if(condition.test(m))
                System.out.println(m);
        }
    }
}

interface Condition{
    boolean test(Movie m);
}
