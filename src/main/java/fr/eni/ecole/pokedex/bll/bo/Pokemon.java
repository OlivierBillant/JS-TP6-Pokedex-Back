package fr.eni.ecole.pokedex.bll.bo;

import java.util.List;

public class Pokemon {
	private String name;
	private int id;
	private String image;
	private List<Type> types;
	
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}
	
	public Pokemon(String name, int id, String image, List<Type> types) {
		super();
		this.name = name;
		this.id = id;
		this.image = image;
		this.types = types;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "Pokemon : " + name + " " + id + " " + image + " " + types;
	}
	
	
}
