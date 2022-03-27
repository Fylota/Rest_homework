package movie;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"title","year","director","actor"})
public class Movie implements Serializable, Comparable<Movie> {
	static final long serialVersionUID = 1L;
	@XmlElement
	private String title;
	@XmlElement
	private int year;
	@XmlElement
	private String director;
	@XmlElement()
	private String[] actor;
	
	public Movie() {
		this.title = "";
		this.year = 0;
		this.director = "";
		this.actor = new String[0];
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getActor() {
		return actor;
	}
	public void setActor(String[] actor) {
		this.actor = actor;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
