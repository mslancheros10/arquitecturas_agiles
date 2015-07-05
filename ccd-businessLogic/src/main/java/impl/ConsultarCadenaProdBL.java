package impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import cache.ConsultaCadenasProd;
import mapper.JsonMapper;
import dto.CadenaProdJson;
import entities.CadenaProduccion;
import interfaces.ICadenaProduccionDAO;
import interfaces.IConsultarCadenaProduccion;

@Stateless
public class ConsultarCadenaProdBL implements IConsultarCadenaProduccion {
	
	@EJB
	private ICadenaProduccionDAO cadenaProduccionDAO;
	
	@EJB
	private ConsultaCadenasProd cacheCadenasProd;
	
	@Override
	public CadenaProdJson obtenerCadenaPorOrdenTrabajo(Long ordenId) {
		if (cacheCadenasProd.getCacheWorking()) {
			return JsonMapper.convertToCadenaProdJson(cacheCadenasProd.getOrdenIdMap().get(ordenId));
		} else {
			return JsonMapper.convertToCadenaProdJson(cadenaProduccionDAO.obtenerCadenaPorOrdenTrabajo(ordenId));
		}
	}

	@Override
	public CadenaProdJson obtenerCadenaPorBien(Long bienId) {
		if (cacheCadenasProd.getCacheWorking()) {
			return JsonMapper.convertToCadenaProdJson(cacheCadenasProd.getBienIdMap().get(bienId));
		} else {
			return JsonMapper.convertToCadenaProdJson(cadenaProduccionDAO.obtenerCadenaPorBien(bienId));
		}
	}

	@Override
	public List<CadenaProdJson> obtenerTodasCadenasProd() {
		List<CadenaProduccion> cadenasProd = new ArrayList<CadenaProduccion>();
		if (cacheCadenasProd.getCacheWorking()) {
			cadenasProd = cacheCadenasProd.getCadenasProd();
		} else {
			cadenasProd = cadenaProduccionDAO.obtenerTodasCadenasProd();
		}
		List<CadenaProdJson> cadenasProdJson = new ArrayList<CadenaProdJson>();
		for (CadenaProduccion cadenaProduccion : cadenasProd) {
			cadenasProdJson.add(JsonMapper.convertToCadenaProdJson(cadenaProduccion));
		}
		return cadenasProdJson;
	}

}
