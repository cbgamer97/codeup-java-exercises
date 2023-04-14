package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void showAllMoviesFromCategories(Movie[] movies, String category){
        for (Movie movie: movies){
            if (movie.getCategory().equals(category)){
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static Movie[] addMovie(Movie[] moviesArray, Movie movie){
        Movie[] newMoviesArray = Arrays.copyOf(moviesArray, moviesArray.length + 1);
        newMoviesArray[newMoviesArray.length - 1] = movie;
        moviesArray = Arrays.copyOf(newMoviesArray, newMoviesArray.length);
        return moviesArray;
    }
    private static String menu = """
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                """;
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "1";
        while(!userChoice.equals("0")){
            userChoice = input.getString(menu);
            switch (userChoice){
                case "1":
                    for(Movie movie : movies){
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    break;
                case "2":
                    showAllMoviesFromCategories(movies, "animated");
                    break;
                case "3":
                    showAllMoviesFromCategories(movies, "drama");
                    break;
                case "4":
                    showAllMoviesFromCategories(movies, "horror");
                    break;
                case "5":
                    showAllMoviesFromCategories(movies, "scifi");
                    break;
                case "6":
                    String name = input.getString("Enter the name of the movie.");
                    String category = input.getString("Enter the movie's category");
                    movies = addMovie(MoviesArray.findAll(), new Movie(name, category));
            }
        }
    }
}
