package services;

import interfaces.IConsultarBien;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Stateless
@Path("/bien-service")
public class BienService {
	
	@EJB
	private IConsultarBien consultarBien;
	
	@GET
	@Path("/bien/{bienId}")
	@Produces("application/json")
	public Response obtenerBien(@PathParam("bienId") Long bienId){
		try {
			return Response.ok(consultarBien.obtenerBien(bienId)).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}
	
	@GET
	@Path("/bien")
	@Produces("application/json")
	public Response obtenerBienes(){
		try {
			return Response.ok(consultarBien.obtenerTodosBienes()).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}
	
	@GET
	@Path("/productos")
	@Produces("application/json")
	public Response obtenerProductos(){
		try {
			return Response.ok(consultarBien.obtenerTodosProductos()).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}
	
	@GET
	@Path("/servicios")
	@Produces("application/json")
	public Response obtenerServicios(){
		try {
			return Response.ok(consultarBien.obtenerTodosServicios()).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}

}
