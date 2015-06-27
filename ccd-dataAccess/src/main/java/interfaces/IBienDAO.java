package interfaces;

import java.util.List;

import entities.Bien;

public interface IBienDAO {
	
	public List<Bien> getAllBienes();
	
	public List<Bien> getProductos();
	
	public List<Bien> getServicios();
	
	public Bien getBienById(Long Id);

}
