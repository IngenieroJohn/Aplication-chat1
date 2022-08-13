package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.chat.repositorio.RepositoryMessages;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Users {
	
	private List<RepositoryMessages> contactosId = new ArrayList<>();
	private List<Image> contactosImg = new ArrayList<Image>();
	private Map<String, Image> usuarios;
	private Circle imgCircle;
	private Map<Integer, String> disponibilidad = new TreeMap<Integer, String>();	
	public Users() {
		this.usuarios = new TreeMap<String, Image>();
	}

	public Map<String, Image> getUsuarios() {
		return usuarios;
	}

	public List<RepositoryMessages> getContactosId() {
		return contactosId;
	}

	public List<Image> getContactosImg() {
		return contactosImg;
	}

	public void setContactosImg(List<Image> contactosImg) {
		this.contactosImg = contactosImg;
	}

	public void setUsuarios(Map<String, Image> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void listaUsuarios(){
		usuarios.put("Jhon", new Image("file:ft1.jpg"));//mauricio
		usuarios.put("Diego", new Image("file:ft2.jpg"));//Denisse
		usuarios.put("William", new Image("file:ft3.jpg"));//hilary
		usuarios.put("Oscar",new Image("file:ft4.jpg"));
		usuarios.put("Franklin", new Image("file:ft5.jpg"));
		usuarios.put("Paula", new Image("file:ft9.jpg"));
		usuarios.put("Azucena", new Image("file:ft10.jpg"));
		usuarios.put("Emiliano", new Image("file:ft8.jpg"));
		usuarios.put("Anthony", new Image("file:ft7.jpg"));
		usuarios.put("Alejandro", new Image("file:ft6.jpg"));
		usuarios.put("Tifany", new Image("file:ft11.jpg"));
		usuarios.put("Omar", new Image("file:ft13.jpg"));
		usuarios.put("Nicole", new Image("file:ft12.jpg"));
	}
	
	public Circle validacion(String id){
		for(Entry<String, Image> ids: usuarios.entrySet()) {
			if(ids.getKey().equals(id)) {
				Image foto = new Image(ids.getValue().getUrl());
				imgCircle = new Circle(20);
				imgCircle.setStroke(Color.TRANSPARENT);
				imgCircle.setFill(new ImagePattern(foto));			        
				imgCircle.setSmooth(true);
			}
		}
		
		return imgCircle;			
	}
	
	public Map<Integer, String> getDisponibilidad(){
		
		disponibilidad.put(1, "Activo");
		disponibilidad.put(2, "Inactivo");
		disponibilidad.put(3, "Activo");
		disponibilidad.put(4, "Activo");
		disponibilidad.put(5, "Inactivo");
		disponibilidad.put(6, "Inactivo");
		disponibilidad.put(7, "Activo");
		disponibilidad.put(8, "Activo");
		disponibilidad.put(9, "Inactivo");
		disponibilidad.put(10, "Inactivo");
		disponibilidad.put(11, "Inactivo");
		disponibilidad.put(12, "Activo");
		
		return disponibilidad;
	}
	
	

}
