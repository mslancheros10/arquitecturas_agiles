package impl;

import java.util.ArrayList;
import java.util.List;

import interfaces.IBienDAO;
import interfaces.IConsultarBien;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import cache.ConsultaBienes;
import mapper.JsonMapper;
import dto.BienJson;
import entities.Bien;

@Stateless
public class ConsultarBienBL implements IConsultarBien{
	
	@EJB
	private IBienDAO bienDAO;
	
	@EJB
	private ConsultaBienes cacheBien;
	
	@Override
	public BienJson obtenerBien(Long id) {
		if(cacheBien.getCacheWorking()){
			return JsonMapper.convertToBienJson(cacheBien.getBienIdMap().get(id));
		}else{
			return JsonMapper.convertToBienJson(bienDAO.getBienById(id));
		}
		
	}
	
	@Override
	public List<BienJson> obtenerTodosBienes() {
		List<BienJson> bienesJson = new ArrayList<BienJson>();
		if(cacheBien.getCacheWorking()){
			for(Bien b:cacheBien.getAllBienes()){
				bienesJson.add(JsonMapper.convertToBienJson(b));
			}
		}
		else{
			List<Bien> bienes = bienDAO.getAllBienes();	
			for(Bien b:bienes){
				bienesJson.add(JsonMapper.convertToBienJson(b));
			}
		}
		return bienesJson;
	}
	
	@Override
	public List<BienJson> obtenerTodosProductos() {
		List<BienJson> bienesJson = new ArrayList<BienJson>();
		if(cacheBien.getCacheWorking()){
			for(Bien b:cacheBien.getProducts()){
				bienesJson.add(JsonMapper.convertToBienJson(b));
			}
		}else{
			List<Bien> bienes = bienDAO.getProductos();
			for(Bien b:bienes){
				bienesJson.add(JsonMapper.convertToBienJson(b));
			}
		}
		return bienesJson;
	}
	
	@Override
	public List<BienJson> obtenerTodosServicios() {
		List<BienJson> bienesJson = new ArrayList<BienJson>();
		if(cacheBien.getCacheWorking()){
			for(Bien b:cacheBien.getServices()){
				bienesJson.add(JsonMapper.convertToBienJson(b));
			}
		}else{
			List<Bien> bienes = bienDAO.getServicios();
			for(Bien b:bienes){
				bienesJson.add(JsonMapper.convertToBienJson(b));
			}
		}
		return bienesJson;
	}

}
