package impl;

import interfaces.IAppLogDAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import entities.AppLog;

@Stateless
public class AppLogDAO implements IAppLogDAO {
	
	@PersistenceContext(unitName = "ccdPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;

	@Override
	public AppLog saveLog(AppLog applog) {
		em.persist(applog);
		return applog;
	}

}