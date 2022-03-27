package movie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {
	@XmlElement
	public Long id;
	
	public Result() { };
	public Result(long id) {
		this.id = id;
	}

}
