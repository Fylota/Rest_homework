package movie;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movies {
	public Collection<Movie> movie;
}
