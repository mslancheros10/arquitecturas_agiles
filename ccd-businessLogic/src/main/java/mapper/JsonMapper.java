package mapper;

import java.util.ArrayList;
import java.util.List;

import dto.BienJson;
import dto.CadenaProdJson;
import entities.Bien;
import entities.CadenaProduccion;

public class JsonMapper {

	public static BienJson convertToBienJson(Bien bien){
		BienJson bienJson = new BienJson();
		if(bien!=null){
			bienJson.setId(bien.getId());
			bienJson.setDescripcion(bien.getDescripcion());
			bienJson.setEstado(bien.getEstado()!=null?bien.getEstado().toString():null);
			bienJson.setFechaCreacion(bien.getFechaCreacion());
			bienJson.setSocioId(bien.getSocio()!=null?bien.getSocio().getId():null);
			bienJson.setComercioId(bien.getComercio()!=null?bien.getComercio().getId():null);
			bienJson.setTags(bien.getTags());
			bienJson.setValor(bien.getValor());
			bienJson.setTipo(bien.getTipo()!=null?bien.getTipo().toString():null);
			List<Long> cadenas = new ArrayList<Long>();
			for(CadenaProduccion c:bien.getCadenasProduccion()){
				cadenas.add(c.getId());

			}
		}
		return bienJson;
	}

	public static CadenaProdJson convertToCadenaProdJson(CadenaProduccion cadenaProduccion) {
		CadenaProdJson cadenaProdJson = new CadenaProdJson();
		if (cadenaProduccion != null) {
			cadenaProdJson.setId(cadenaProduccion.getId());
			cadenaProdJson.setDescripcion(cadenaProduccion.getDescripcion());
			cadenaProdJson.setEtapa(cadenaProduccion.getEtapa().toString());
			cadenaProdJson.setIdBien(cadenaProduccion.getBien()!=null ? cadenaProduccion.getBien().getId():null);
			cadenaProdJson.setIdOrdenTrabajo(cadenaProduccion.getOrdenTrabajo()!=null ? cadenaProduccion.getOrdenTrabajo().getId():null);
		}
		return cadenaProdJson;
	}

}
