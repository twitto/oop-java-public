package exams.oop23c_scecs.moedb.q1_movie_class;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", 4.5);
        System.out.println(movie);

        // Update rating
        movie.updateRating(4.7);
        System.out.println(movie);

        // Update director name
        movie.updateDirectorName("James Cameron");
        System.out.println(movie);

        // Check equality
        Movie sameMovie = new Movie("Inception", 2010, "James Cameron", 4.7);
        System.out.println(movie.equals(sameMovie));  // Should return false as directors are different

        Movie identicalMovie = new Movie("Inception", 2010, "James Cameron", 4.7);
        System.out.println(movie.equals(identicalMovie));  // Should return true
    }
}

