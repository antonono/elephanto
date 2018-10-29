package fr.iut;

public class Item {
	
	

	private String nom;
	private int prix;

	public int getPrix() {
		return prix;
	}

	public Item(String string, int i) {
		this.nom = string;
		this.prix = i;
	}

}
