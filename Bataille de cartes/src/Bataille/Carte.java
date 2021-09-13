package Bataille;
public class Carte{
	//attributes
	private int valeur;
	private String type;
	
	//those tables contain the values of the future cards
	private int[] valeurs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private String[] types = {"Coeur", "Carreaux", "Pique", "Trèfle"};
	
	//constructor
	public Carte(int valeur, int type) {
		this.valeur = valeurs[valeur];
		this.type = types[type];
	}
	
	//getters
	public int getValeur() { return valeur; }
	
	//we define a toString to keep the value of cards and still have a nice display
	public String toString() {
		String Carte = " de " + type;
		switch (valeur){
			case 1: {
				Carte = "As" + Carte;
				break;
			}
			case 11: {
				Carte = "Valet" + Carte;
				break;
			}
			case 12: {
				Carte = "Reine" + Carte;
				break;
			}
			case 13: {
				Carte = "Roi" + Carte;
				break;
			}
			default:
				Carte = valeur + Carte;
		}
		return Carte;
	}	
}