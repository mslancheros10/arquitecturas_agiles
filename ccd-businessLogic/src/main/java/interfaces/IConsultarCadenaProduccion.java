package interfaces;

import java.util.List;

import dto.CadenaProdJson;

public interface IConsultarCadenaProduccion {

	public CadenaProdJson obtenerCadenaPorOrdenTrabajo(Long ordenId);
	
	public CadenaProdJson obtenerCadenaPorBien(Long bienId);
	
	public List<CadenaProdJson> obtenerTodasCadenasProd();
	
}
