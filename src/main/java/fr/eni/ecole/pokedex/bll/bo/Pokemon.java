package fr.eni.ecole.pokedex.bll.bo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
	private int id;
	private String name;
	private String image;
	private List<Type> types;
}
