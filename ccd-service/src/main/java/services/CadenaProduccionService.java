package services;

import interfaces.IConsultarCadenaProduccion;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Stateless
@Path("/cadenaprod-service")
public class CadenaProduccionService {

	@EJB
	private IConsultarCadenaProduccion consultarCadenaProduccion;
	
	@GET
	@Path("/bien/{bienId}")
	@Produces("application/json")
	public Response obtenerCadenaPorBien(@PathParam("bienId") Long bienId){
		try {
			return Response.ok(consultarCadenaProduccion.obtenerCadenaPorBien(bienId)).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}
	
	@GET
	@Path("/orden/{ordenId}")
	@Produces("application/json")
	public Response obtenerCadenaPorOrdenTrabajo(@PathParam("ordenId") Long ordenId){
		try {
			return Response.ok(consultarCadenaProduccion.obtenerCadenaPorOrdenTrabajo(ordenId)).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}
}
