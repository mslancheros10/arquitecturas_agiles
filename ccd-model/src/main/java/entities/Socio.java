package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import enums.SectorTipoEnum;

@Entity
public class Socio extends Usuario {
	
	@Enumerated(EnumType.STRING)
	private SectorTipoEnum sector;
	
	private String descripcion;
	
	@OneToMany(mappedBy="socio", fetch=FetchType.LAZY)
	private List<OrdenTrabajo> ordenesTrabajo;
	
	@OneToMany(mappedBy="socio", fetch=FetchType.LAZY)
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
	 * @return the ordenesTrabajo
	 */
	public List<OrdenTrabajo> getOrdenesTrabajo() {
		return ordenesTrabajo;
	}

	/**
	 * @param ordenesTrabajo the ordenesTrabajo to set
	 */
	public void setOrdenesTrabajo(List<OrdenTrabajo> ordenesTrabajo) {
		this.ordenesTrabajo = ordenesTrabajo;
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
