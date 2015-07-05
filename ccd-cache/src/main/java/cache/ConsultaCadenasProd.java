package cache;

import interfaces.ICadenaProduccionDAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import entities.CadenaProduccion;

@Singleton
@Startup
public class ConsultaCadenasProd {
	
	@EJB
	private ICadenaProduccionDAO cadenaProduccionDAO;
	
	private List<CadenaProduccion> cadenasProd;
	
	private Map<Long, CadenaProduccion> ordenIdMap;
	
	private Map<Long, CadenaProduccion> bienIdMap;
	
	private Boolean cacheWorking;

	/**
	 * @return the cadenaProduccionDAO
	 */
	public ICadenaProduccionDAO getCadenaProduccionDAO() {
		return cadenaProduccionDAO;
	}

	/**
	 * @return the cadenasProd
	 */
	public List<CadenaProduccion> getCadenasProd() {
		return cadenasProd;
	}

	/**
	 * @return the ordenIdMap
	 */
	public Map<Long, CadenaProduccion> getOrdenIdMap() {
		return ordenIdMap;
	}

	/**
	 * @return the bienIdMap
	 */
	public Map<Long, CadenaProduccion> getBienIdMap() {
		return bienIdMap;
	}

	/**
	 * @return the cacheWorking
	 */
	public Boolean getCacheWorking() {
		return cacheWorking;
	}

	@PostConstruct
	public void orchester() {
		cacheWorking = false;
		findAllCadenas();
		fillOrdenMap();
		fillBienMap();
		cacheWorking = true;
	}
	
	private void findAllCadenas() {
		cadenasProd = cadenaProduccionDAO.obtenerTodasCadenasProd();
	}
	
	private void fillOrdenMap() {
		ordenIdMap = new HashMap<Long, CadenaProduccion>();
		for (CadenaProduccion cadena : cadenasProd) {
			ordenIdMap.put(cadena.getOrdenTrabajo().getId(), cadena);
		}
	}
	
	private void fillBienMap() {
		bienIdMap = new HashMap<Long, CadenaProduccion>();
		for (CadenaProduccion cadena : cadenasProd) {
			bienIdMap.put(cadena.getBien().getId(), cadena);
		}
	}
	
}
