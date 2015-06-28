package interfaces;

import java.util.List;

import dto.BienJson;

public interface IConsultarBien {
	
	public List<BienJson> obtenerTodosBienes();
	
	public List<BienJson> obtenerTodosProductos();
	
	public List<BienJson> obtenerTodosServicios();
	
	public BienJson obtenerBien(Long Id);

}
