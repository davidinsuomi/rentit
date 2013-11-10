package cs.ut.domain.soap;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import cs.ut.domain.HireRequestStatus;
import cs.ut.domain.soap.PlantResource;
@RooJavaBean
@RooToString
public class PurchaseOrderResource {

	   	private Date startDate;

	    private Date endDate;

	    private BigDecimal totalCost;

	    private HireRequestStatus status;

	    private PlantResource plantResource;

	    
		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public BigDecimal getTotalCost() {
			return totalCost;
		}

		public void setTotalCost(BigDecimal totalCost) {
			this.totalCost = totalCost;
		}

		public HireRequestStatus getStatus() {
			return status;
		}

		public void setStatus(HireRequestStatus status) {
			this.status = status;
		}

		public PlantResource getPlantResource() {
			return plantResource;
		}

		public void setPlantResource(PlantResource plantResource) {
			this.plantResource = plantResource;
		}
	    
	    
}
