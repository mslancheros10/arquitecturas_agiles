package mapper;

import java.util.ArrayList;
import java.util.List;

import dto.BienJson;
import entities.Bien;
import entities.CadenaProduccion;

public class BienJsonMapper {
	
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

}
