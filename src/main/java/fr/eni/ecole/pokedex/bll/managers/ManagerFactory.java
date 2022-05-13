package fr.eni.ecole.pokedex.bll.managers;

public abstract class ManagerFactory {
	//La factory sert de point d'entrée unique à tous les managers.
	
	public static PokedexManager getPokedexManager() {
		return PokedexManagerImpl.getInstance();
	}
}
