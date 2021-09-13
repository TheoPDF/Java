package forme;

public class PointColore extends Point{
	private String couleur;
	public PointColore(double x, double y, String couleur){
		super(x, y);
		this.couleur = couleur;
	}
	public String getCouleur() { return this.couleur; }
	public String toString() { return super.toString() + " - " + getCouleur(); }
}
