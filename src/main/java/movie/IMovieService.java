package movie;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("movies")
public interface IMovieService {

	@GET
	@Path("")
	@Consumes({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public Movies getAllMovies();
	
	@GET
	@Path("{id}")
	@Consumes({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public Movie getMovie(@PathParam("id") int id);
	
	@POST
	@Path("")
	@Consumes({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public Result addMovie(Movie movie);
	
	@PUT
	@Path("{id}")
	@Consumes({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public void updateMovie(@PathParam("id") int id, Movie movie);
	
	@DELETE
	@Path("{id}")
	@Consumes({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public void removeMovie(@PathParam("id") int id);
	
	@GET
	@Path("find")
	@Consumes({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public FilteredResult filterMovies(@QueryParam("year") int year, @QueryParam("orderby") String field);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
