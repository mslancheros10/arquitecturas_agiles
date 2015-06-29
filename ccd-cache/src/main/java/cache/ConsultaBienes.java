package cache;

import interfaces.IBienDAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import entities.Bien;

@Singleton
@Startup
public class ConsultaBienes {
	
	@EJB
	private IBienDAO bienDAO;
	
	private List<Bien> products;
	
	private List<Bien> services;
	
	private Map<Long, Bien> bienIdMap;
	
	private List<Bien> allBienes;
	
	private Boolean cacheWorking;
	

	/**
	 * @return the products
	 */
	public List<Bien> getProducts() {
		return products;
	}


	/**
	 * @return the services
	 */
	public List<Bien> getServices() {
		return services;
	}


	/**
	 * @return the bienIdMap
	 */
	public Map<Long, Bien> getBienIdMap() {
		return bienIdMap;
	}


	/**
	 * @return the allBienes
	 */
	public List<Bien> getAllBienes() {
		return allBienes;
	}
	
	
	
	/**
	 * @return the cacheWorking
	 */
	public Boolean getCacheWorking() {
		return cacheWorking;
	}



	@PostConstruct
	public void orchester(){
		cacheWorking = false;
		fillAllBienes();
		fillProductsServices();
		fillBienIdMap();
		cacheWorking = true;
	}
	
	private void fillProductsServices(){
		products = bienDAO.getProductos();
		services = bienDAO.getServicios();
	}
	
	private void fillBienIdMap(){
		bienIdMap = new HashMap<Long, Bien>();
		for(Bien b:allBienes){
			bienIdMap.put(b.getId(), b);
		}
	}
	
	private void fillAllBienes(){
		allBienes = bienDAO.getAllBienes();
	}

}
