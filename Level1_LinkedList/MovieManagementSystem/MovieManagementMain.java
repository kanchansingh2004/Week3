package Level1_LinkedList.MovieManagementSystem;

public class MovieManagementMain {
        // Main method for testing
        public static void main(String[] args) {
            MovieList movieList = new MovieList();

            // Add movies to the list
            movieList.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
            movieList.addAtBeginning("The Shawshank Redemption", "Frank Darabont", 1994, 9.3);
            movieList.addAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.0, 1);

            // Display movies
            System.out.println("\nDisplay movie forward");
            movieList.displayForward();

            System.out.println("==============================================");
            System.out.println("\nDisplay movie reverse");
            movieList.displayReverse();

            System.out.println("============================================");

            // Search movies by Director Or Rating
            System.out.println("\nDisplay searched movie by director name");
            movieList.searchByDirectorOrRating("Christopher Nolan", null);

            System.out.println("\nDisplay searched movie by rating");
            movieList.searchByDirectorOrRating(null, 7.8);

            // Update movie rating
            movieList.updateRatingByTitle("Avatar", 8.2);
            movieList.displayForward();
            System.out.println("================================================");

            // Remove a movie by title
            movieList.removeByTitle("The Shawshank Redemption");
            movieList.displayForward();
            System.out.println("===============================================");

            // Display the total number of movies
            System.out.println("\nTotal Movies in the List: " + movieList.getSize());
        }
    }

