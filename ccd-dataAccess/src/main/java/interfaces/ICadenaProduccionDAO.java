package interfaces;

import entities.CadenaProduccion;

public interface ICadenaProduccionDAO {

	public CadenaProduccion obtenerCadenaPorOrdenTrabajo(Long idOrdenTrabajo);

	public CadenaProduccion obtenerCadenaPorBien(Long idBien);

}
