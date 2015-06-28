package impl;

import java.util.ArrayList;
import java.util.List;

import interfaces.IBienDAO;
import interfaces.IConsultarBien;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mapper.BienJsonMapper;
import dto.BienJson;
import entities.Bien;

@Stateless
public class ConsultarBienBL implements IConsultarBien{
	
	@EJB
	private IBienDAO bienDAO;
	
	@Override
	public BienJson obtenerBien(Long Id) {
		return BienJsonMapper.convertToBienJson(bienDAO.getBienById(Id));
	}
	
	@Override
	public List<BienJson> obtenerTodosBienes() {
		List<Bien> bienes = bienDAO.getAllBienes();
		List<BienJson> bienesJson = new ArrayList<BienJson>();
		for(Bien b:bienes){
			bienesJson.add(BienJsonMapper.convertToBienJson(b));
		}
		return bienesJson;
	}
	
	@Override
	public List<BienJson> obtenerTodosProductos() {
		List<Bien> bienes = bienDAO.getProductos();
		List<BienJson> bienesJson = new ArrayList<BienJson>();
		for(Bien b:bienes){
			bienesJson.add(BienJsonMapper.convertToBienJson(b));
		}
		return bienesJson;
	}
	
	@Override
	public List<BienJson> obtenerTodosServicios() {
		List<Bien> bienes = bienDAO.getServicios();
		List<BienJson> bienesJson = new ArrayList<BienJson>();
		for(Bien b:bienes){
			bienesJson.add(BienJsonMapper.convertToBienJson(b));
		}
		return bienesJson;
	}

}
