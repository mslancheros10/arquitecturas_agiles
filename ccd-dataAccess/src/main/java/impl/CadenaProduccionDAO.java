package impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import entities.CadenaProduccion;
import interfaces.ICadenaProduccionDAO;

@Stateless
public class CadenaProduccionDAO implements ICadenaProduccionDAO {

	@PersistenceContext(unitName = "ccdPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
	
	@Override
	public CadenaProduccion obtenerCadenaPorOrdenTrabajo(
			Long idOrdenTrabajo) {
		CadenaProduccion cadenaProduccion = null;
		try {
			cadenaProduccion = (CadenaProduccion) em.createNamedQuery("CadenaProduccion.findByOrden")
					.setParameter("ordenId", idOrdenTrabajo).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cadenaProduccion;
	}

	@Override
	public CadenaProduccion obtenerCadenaPorBien(Long idBien) {
		CadenaProduccion cadenaProduccion = null;
		try {
			cadenaProduccion =  (CadenaProduccion) em.createNamedQuery("CadenaProduccion.findByBien")
					.setParameter("bienId", idBien).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cadenaProduccion;
	}

}
