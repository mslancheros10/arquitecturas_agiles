package impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import entities.Bien;
import enums.BienTipoEnum;
import enums.EstadoTipoEnum;
import interfaces.IBienDAO;

@Stateless
public class BienDAO implements IBienDAO{
	
	@PersistenceContext(unitName = "ccdPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
	
	@Override
	public List<Bien> getAllBienes() {
		return em.createNamedQuery("Bien.findAll")
				.getResultList();
	}
	
	@Override
	public Bien getBienById(Long id) {
		return em.find(Bien.class, id);
	} 
	
	@Override
	public List<Bien> getProductos() {
		return em.createNamedQuery("Bien.findAllByTipoAndEstado")
				.setParameter("estado", EstadoTipoEnum.ACTIVO)
				.setParameter("tipo", BienTipoEnum.PRODUCTO)
				.getResultList();
	}
	
	@Override
	public List<Bien> getServicios() {
		return em.createNamedQuery("Bien.findAllByTipoAndEstado")
				.setParameter("estado", EstadoTipoEnum.ACTIVO)
				.setParameter("tipo", BienTipoEnum.SERVICIO)
				.getResultList();
	}

}
