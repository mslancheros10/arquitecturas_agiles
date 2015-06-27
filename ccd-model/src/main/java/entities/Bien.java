package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import enums.BienTipoEnum;
import enums.EstadoTipoEnum;

@Entity
public class Bien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EstadoTipoEnum estado;
	
	private Date fechaCreacion;
	
	private Double valor;
	
	private String descripcion;
	
	@Enumerated(EnumType.STRING)
	private BienTipoEnum tipo;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name ="tags")
	private List<String> tags;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Socio socio;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Comercio comercio;
	
	@OneToMany(mappedBy="bien", fetch=FetchType.LAZY)
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
	public BienTipoEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(BienTipoEnum tipo) {
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
