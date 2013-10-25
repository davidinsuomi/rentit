package cs.ut.domain.soap;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@XmlRootElement(name = "plant")
public class PlantResource {
	private String plantName;
    private BigDecimal pricePerDay;
    private String description;
    private long identifier;
    
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public BigDecimal getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(BigDecimal pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getIdentifier() {
		return identifier;
	}
	public void setIdentifier(long identifier) {
		this.identifier = identifier;
	}

}
