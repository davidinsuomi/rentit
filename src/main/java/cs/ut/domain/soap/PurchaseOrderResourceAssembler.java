package cs.ut.domain.soap;

import cs.ut.domain.PurchaseOrder;
import cs.ut.domain.soap.PurchaseOrderResource;

public class PurchaseOrderResourceAssembler {
	public PurchaseOrderResource getPurchaseOrderResource(
			PurchaseOrder purchaseOrder) {
		PurchaseOrderResource purchaseOrderResource = new PurchaseOrderResource();
		PlantResourceAssembler assembler = new PlantResourceAssembler();
		purchaseOrderResource.setEndDate(purchaseOrder.getEndDate());
		purchaseOrderResource.setPlantResource(assembler.getPlantResource(purchaseOrder.getPlant()));
		purchaseOrderResource.setStartDate(purchaseOrder.getStartDate());
		purchaseOrderResource.setStatus(purchaseOrder.getStatus());
		purchaseOrderResource.setTotalCost(purchaseOrder.getTotalCost());
		return purchaseOrderResource;
	}
	
}
