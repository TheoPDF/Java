public class Carte{
	private int valeur;
	private String type;
	
	private int[] valeurs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private String[] types = {"Coeur", "Carreaux", "Pique", "Trèfle"};
	
	public Carte(int valeur, int type) {
		this.valeur = valeurs[valeur];
		this.type = types[type];
	}
	
	public int getValeur() { return valeur; }
	public String getType() { return type; }
	
	public String toString() {
		String Carte = " de " + type;
		if (valeur == 1) {
			Carte = "As" + Carte;
		} else if (valeur == 11) {
			Carte = "Valet" + Carte;
		} else if (valeur == 12) {
			Carte = "Reine" + Carte;
		} else if (valeur == 13) {
			Carte = "Roi" + Carte;
		} else {
			Carte = valeur + Carte;
		}
		return Carte;
	}	
}