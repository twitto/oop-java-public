package exams.oop23c_scecs.moedb.q1_movie_class;

public class Movie {
    private String title;
    private int releaseYear;
    private String directorName;
    private double rating;

    public Movie(String title, int releaseYear, String directorName, double rating) {
        if (title == null || title.isEmpty() || releaseYear < 1900 || directorName == null || directorName.isEmpty() || rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Invalid movie details provided.");
        }
        this.title = title;
        this.releaseYear = releaseYear;
        this.directorName = directorName;
        this.rating = rating;
    }

    public void updateRating(double newRating) {
        if (newRating < 0 || newRating > 5) {
            throw new IllegalArgumentException("Rating should be between 0 and 5.");
        }
        this.rating = newRating;
    }

    public void updateDirectorName(String newDirectorName) {
        if (newDirectorName == null || newDirectorName.isEmpty()) {
            throw new IllegalArgumentException("Director name cannot be empty.");
        }
        this.directorName = newDirectorName;
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', releaseYear=" + releaseYear + ", directorName='" + directorName + "', rating=" + rating + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Movie other = (Movie) obj;
        return releaseYear == other.releaseYear &&
                Double.compare(other.rating, rating) == 0 &&
                title.equals(other.title) &&
                directorName.equals(other.directorName);
    }
}
