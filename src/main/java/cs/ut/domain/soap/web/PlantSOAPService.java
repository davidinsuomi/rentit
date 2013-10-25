package cs.ut.domain.soap.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import cs.ut.domain.Plant;
import cs.ut.domain.rest.PlantResourceAssembler;
import cs.ut.domain.rest.PlantResourceList;

@WebService
public class PlantSOAPService {
	@WebMethod
	public PlantResourceList getAllPlants(){
		List<Plant> plantList = Plant.findAllPlants();
		PlantResourceAssembler assembler = new PlantResourceAssembler();
		PlantResourceList resList = assembler.getPlantResourceList(plantList);
		return resList;
	}
}
