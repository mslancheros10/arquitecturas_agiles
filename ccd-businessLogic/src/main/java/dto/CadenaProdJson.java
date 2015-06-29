package dto;

public class CadenaProdJson {

	private Long id;
	
	private String etapa;
	
	private String descripcion;
	
	private Long idOrdenTrabajo;
	
	private Long idBien;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the etapa
	 */
	public String getEtapa() {
		return etapa;
	}

	/**
	 * @param etapa the etapa to set
	 */
	public void setEtapa(String etapa) {
		this.etapa = etapa;
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
	 * @return the idOrdenTrabajo
	 */
	public Long getIdOrdenTrabajo() {
		return idOrdenTrabajo;
	}

	/**
	 * @param idOrdenTrabajo the idOrdenTrabajo to set
	 */
	public void setIdOrdenTrabajo(Long idOrdenTrabajo) {
		this.idOrdenTrabajo = idOrdenTrabajo;
	}

	/**
	 * @return the idBien
	 */
	public Long getIdBien() {
		return idBien;
	}

	/**
	 * @param idBien the idBien to set
	 */
	public void setIdBien(Long idBien) {
		this.idBien = idBien;
	}
	
}
