package interfaces;

import java.util.List;

import entities.CadenaProduccion;

public interface ICadenaProduccionDAO {

	public CadenaProduccion obtenerCadenaPorOrdenTrabajo(Long idOrdenTrabajo);

	public CadenaProduccion obtenerCadenaPorBien(Long idBien);

	public List<CadenaProduccion> obtenerTodasCadenasProd();
}
