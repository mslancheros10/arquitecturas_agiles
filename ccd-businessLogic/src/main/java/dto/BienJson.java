package dto;

import java.util.Date;
import java.util.List;

public class BienJson {
		
	private Long id;
	
	private String estado;
	
	private Date fechaCreacion;
	
	private Double valor;
	
	private String descripcion;
	
	private String tipo;

	private List<String> tags;
	
	private Long socioId;

	private Long comercioId;

	private List<Long> cadenasProduccionIds;

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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * @return the socioId
	 */
	public Long getSocioId() {
		return socioId;
	}

	/**
	 * @param socioId the socioId to set
	 */
	public void setSocioId(Long socioId) {
		this.socioId = socioId;
	}

	/**
	 * @return the comercioId
	 */
	public Long getComercioId() {
		return comercioId;
	}

	/**
	 * @param comercioId the comercioId to set
	 */
	public void setComercioId(Long comercioId) {
		this.comercioId = comercioId;
	}

	/**
	 * @return the cadenasProduccionIds
	 */
	public List<Long> getCadenasProduccionIds() {
		return cadenasProduccionIds;
	}

	/**
	 * @param cadenasProduccionIds the cadenasProduccionIds to set
	 */
	public void setCadenasProduccionIds(List<Long> cadenasProduccionIds) {
		this.cadenasProduccionIds = cadenasProduccionIds;
	}	
	
	

}
