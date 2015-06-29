package services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import cache.ConsultaBienes;

@Stateless
@Path("/cache-service")
public class CacheService {
	
	@EJB
	private ConsultaBienes cacheBien;
	
	@POST
	@Path("/bien")
	public Response updateBienCache(){
		try {
			cacheBien.orchester();
			return Response.status(200).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}

}
