package movie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class MoviesController {
	//Map of names to Movie instances.
	private Map<Long, Movie> movieMap = new HashMap<>();
	
	//this class is a singleton and should not be instantiated directly!
	private static MoviesController instance = new MoviesController();
	private final AtomicLong counter = new AtomicLong();
	public static MoviesController getInstance(){
		return instance;
	}

	//private constructor so people know to use the getInstance() function instead
	private MoviesController() { }
	
	public Movies getAllMovies() {
		Movies all = new Movies();
		all.movie = movieMap.values();
		return all;
	}

	public Movie getMovie(long id) {
		if (movieMap.containsKey(id)) {
			return movieMap.get(id);
		}
		else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	public long putMovie(Movie movie) {
		long id = counter.incrementAndGet();
		movieMap.put(id, movie);
		return id;
	}
	
	public void updateMovie(long id, Movie m) {
		movieMap.put(id, m);
	}
	
	public void deleteMovie(long id) {
		movieMap.remove(id);
	}
	
	public Set<Long> filterMovie(int year, String field) {
		FilteredResult res = new FilteredResult(); 
		
		Comparator<Movie> movieTitleComparator = new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
        };
        
        Comparator<Movie> movieDirectorComparator = new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.getDirector().compareTo(o2.getDirector());
			}
        };
		
		Map<Long, Movie> collect = movieMap.entrySet().stream()
				.filter(x -> x.getValue().getYear() == year)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		/*
		List list = new LinkedList(collect.entrySet());
		
		Collections.sort(list,movieTitleComparator);
		
		HashMap sortedHashMap = new LinkedHashMap();
		
		for (Iterator it = list.iterator(); it.hasNext();) {  
			Map.Entry entry = (Map.Entry) it.next();  
			sortedHashMap.put(entry.getKey(), entry.getValue());  
		}  
		
		Movies filtered = new Movies();
		filtered.movie = sortedHashMap.values();
		*/
		
		return collect.keySet();
	}
	
	

}
