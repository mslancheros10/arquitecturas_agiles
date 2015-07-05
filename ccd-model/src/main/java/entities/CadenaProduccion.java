package entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import enums.EtapaCadenaEnum;

@Entity
@NamedQueries({
@NamedQuery(name="CadenaProduccion.findAll", query="SELECT c FROM CadenaProduccion c"),
@NamedQuery(name="CadenaProduccion.findByOrden", query="SELECT c FROM CadenaProduccion c WHERE c.ordenTrabajo.id=:ordenId"),
@NamedQuery(name="CadenaProduccion.findByBien", query="SELECT c FROM CadenaProduccion c WHERE c.bien.id=:bienId")})
public class CadenaProduccion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EtapaCadenaEnum etapa;
	
	private String descripcion;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private OrdenTrabajo ordenTrabajo;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Bien bien;

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
	public EtapaCadenaEnum getEtapa() {
		return etapa;
	}

	/**
	 * @param etapa the etapa to set
	 */
	public void setEtapa(EtapaCadenaEnum etapa) {
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
	 * @return the ordenTrabajo
	 */
	public OrdenTrabajo getOrdenTrabajo() {
		return ordenTrabajo;
	}

	/**
	 * @param ordenTrabajo the ordenTrabajo to set
	 */
	public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
		this.ordenTrabajo = ordenTrabajo;
	}

	/**
	 * @return the bien
	 */
	public Bien getBien() {
		return bien;
	}

	/**
	 * @param bien the bien to set
	 */
	public void setBien(Bien bien) {
		this.bien = bien;
	}
	
	

}
