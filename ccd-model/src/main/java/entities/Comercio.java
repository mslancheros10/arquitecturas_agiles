package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import enums.SectorTipoEnum;

@Entity
public class Comercio extends Usuario{
	
	@Enumerated(EnumType.STRING)
	private SectorTipoEnum sector;
	
	private String descripcion;
	
	@OneToMany(mappedBy="comercio", fetch=FetchType.LAZY)
	private List<Bien> bienes;

	/**
	 * @return the sector
	 */
	public SectorTipoEnum getSector() {
		return sector;
	}

	/**
	 * @param sector the sector to set
	 */
	public void setSector(SectorTipoEnum sector) {
		this.sector = sector;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the bienes
	 */
	public List<Bien> getBienes() {
		return bienes;
	}

	/**
	 * @param bienes the bienes to set
	 */
	public void setBienes(List<Bien> bienes) {
		this.bienes = bienes;
	}
	
	

}
