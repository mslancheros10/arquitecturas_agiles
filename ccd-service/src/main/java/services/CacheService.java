package services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.logging.impl.Log4jLogger;

import cache.ConsultaBienes;
import cache.ConsultaCadenasProd;

@Stateless
@Path("/cache-service")
public class CacheService {
	
	@EJB
	private ConsultaBienes cacheBien;
	
	@EJB
	private ConsultaCadenasProd cacheCadenas;
	
	private Log4jLogger logger;
	
	@POST
	@Path("/bien")
	public Response updateBienCache(){
		try {
			cacheBien.orchester();
			return Response.status(200).build();
		} catch (Exception e) {
			logger.info("context",e);
			return Response.status(500).build();
		}
	}
	
	@POST
	@Path("/cadenas")
	public Response updateCadenasCache(){
		try {
			cacheCadenas.orchester();
			return Response.status(200).build();
		} catch (Exception e) {
			logger.info("context",e);
			return Response.status(500).build();
		}
	}

}
