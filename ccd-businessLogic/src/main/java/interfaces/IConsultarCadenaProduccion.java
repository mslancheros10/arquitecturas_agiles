package interfaces;

import dto.CadenaProdJson;

public interface IConsultarCadenaProduccion {

	public CadenaProdJson obtenerCadenaPorOrdenTrabajo(Long ordenId);
	
	public CadenaProdJson obtenerCadenaPorBien(Long bienId);
}
