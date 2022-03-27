package movie;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "movies")
@XmlAccessorType(XmlAccessType.FIELD)
public class FilteredResult {
	@XmlElement
	public Set<Long> id;

	public void setID(Set<Long> set) {
		this.id = set;
	}
}
