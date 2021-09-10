import java.util.ArrayList;
import java.util.List;

public class Joueur {
    List<Carte> JeuDeCartes = new ArrayList<Carte>();
    public String nom;
    public int points;

    public Joueur(String Nom) {
        this.nom = Nom;
        this.points = 0;
    }

    public String toString() {
        return this.nom + " | " + this.points + " ";
	}
}