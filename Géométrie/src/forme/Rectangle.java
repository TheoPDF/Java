package forme;

public class Rectangle extends Point{
	//attributes
	private double longueur;
	private double largeur;
	
	//constructor
	public Rectangle(double x, double y, double longueur, double largeur) {
		super(x, y);
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	//getters
	public double getLongueur() {
		return this.longueur;
	}
	public double getLargeur() {
		return this.largeur;
	}
	public double air() {
		return this.longueur*this.largeur;
	}
}
