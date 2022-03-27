package movie;

import java.util.Collection;

public class MovieService implements IMovieService {
	public MoviesController movies = MoviesController.getInstance();

	@Override
	public Movies getAllMovies() {
		return movies.getAllMovies();
	}

	@Override
	public Movie getMovie(int id) {
		return movies.getMovie(id);
	}

	@Override
	public Result addMovie(Movie movie) {
		long id = movies.putMovie(movie);
		Result r = new Result(id);
		return r;
	}

	@Override
	public void updateMovie(int id, Movie movie) {
		movies.updateMovie(id, movie);
		
	}

	@Override
	public void removeMovie(int id) {
		movies.deleteMovie(id);
		
	}

	@Override
	public FilteredResult filterMovies(int year, String field) {
		FilteredResult res = new FilteredResult();
		res.setID(movies.filterMovie(year, field)); 
		return res;
	}
	
}