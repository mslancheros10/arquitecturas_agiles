package impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mapper.JsonMapper;
import dto.CadenaProdJson;
import interfaces.ICadenaProduccionDAO;
import interfaces.IConsultarCadenaProduccion;

@Stateless
public class ConsultarCadenaProdBL implements IConsultarCadenaProduccion {
	
	@EJB
	private ICadenaProduccionDAO cadenaProduccionDAO;
	
	@Override
	public CadenaProdJson obtenerCadenaPorOrdenTrabajo(Long ordenId) {
		return JsonMapper.convertToCadenaProdJson(cadenaProduccionDAO.obtenerCadenaPorOrdenTrabajo(ordenId));
	}

	@Override
	public CadenaProdJson obtenerCadenaPorBien(Long bienId) {
		return JsonMapper.convertToCadenaProdJson(cadenaProduccionDAO.obtenerCadenaPorBien(bienId));
	}

}
