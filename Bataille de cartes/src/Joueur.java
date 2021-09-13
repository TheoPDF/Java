import java.util.ArrayList;
import java.util.List;

public class Joueur {
	//attributes
    List<Carte> JeuDeCartes = new ArrayList<Carte>();
    public String nom;
    public int points;

    //constructor
    public Joueur(String Nom) {
        this.nom = Nom;
        this.points = 0;
    }

    //we define a toString to define a display for a player
    public String toString() {
        return this.nom + " | " + this.points;
	}
}