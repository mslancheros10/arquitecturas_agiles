package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import enums.EstadoTipoEnum;

@Entity
public class OrdenTrabajo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EstadoTipoEnum estado;
	
	private Date fechaInicio;
	
	private Date fechaEntrega;
	
	private Double valor;
	
	private String observaciones;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Socio socio;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Comercio comercio;
	
	@OneToMany(mappedBy="ordenTrabajo", fetch=FetchType.LAZY)
	private List<CadenaProduccion> cadenasProduccion;

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
	public EstadoTipoEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoTipoEnum estado) {
		this.estado = estado;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
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
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return the socio
	 */
	public Socio getSocio() {
		return socio;
	}

	/**
	 * @param socio the socio to set
	 */
	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	/**
	 * @return the cadenasProduccion
	 */
	public List<CadenaProduccion> getCadenasProduccion() {
		return cadenasProduccion;
	}

	/**
	 * @param cadenasProduccion the cadenasProduccion to set
	 */
	public void setCadenasProduccion(List<CadenaProduccion> cadenasProduccion) {
		this.cadenasProduccion = cadenasProduccion;
	}

	/**
	 * @return the comercio
	 */
	public Comercio getComercio() {
		return comercio;
	}

	/**
	 * @param comercio the comercio to set
	 */
	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}
	
	

}
