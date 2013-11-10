package cs.ut.domain.soap.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import cs.ut.domain.HireRequestStatus;
import cs.ut.domain.Plant;
import cs.ut.domain.PurchaseOrder;
import cs.ut.domain.soap.PlantResourceAssembler;
import cs.ut.domain.soap.PlantResourceList;
import cs.ut.domain.soap.PurchaseOrderResource;

@WebService
public class PlantSOAPService {
	@WebMethod
	public PlantResourceList getAllPlants(){
		List<Plant> plantList = Plant.findAllPlants();
		PlantResourceAssembler assembler = new PlantResourceAssembler();
		PlantResourceList resList = assembler.getPlantResourceList(plantList);
		return resList;
	}
	
	@WebMethod
	public void CreatePurchaseOrder(PurchaseOrderResource res){

		PurchaseOrder po = new PurchaseOrder();
		po.setEndDate(res.getEndDate());
		po.setPlant(Plant.findPlant(res.getPlantResource().getIdentifier()));
		po.setStartDate(res.getStartDate());
		po.setStatus(HireRequestStatus.PENDING_CONFIRMATION);
		po.setTotalCost(res.getTotalCost());
		po.persist();
	}
}
