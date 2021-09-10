import java.util.*;

public class Bataille {

    public static void main(String[] args) {
        Joueur player2 = new Joueur("player2");
        Joueur player1 = new Joueur("player1");
        jouer(player1, player2);

    }

    public static void jouer(Joueur player1, Joueur player2) {
        List<Carte> paquetDeCartes = new ArrayList<Carte>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                paquetDeCartes.add(new Carte(i, j));
            }
        }
        System.out.println(paquetDeCartes);
        Collections.shuffle(paquetDeCartes);

        int size = paquetDeCartes.size();
        System.out.println(size);
        for (int i = 0; i < size / 2; i++)
            player1.JeuDeCartes.add(paquetDeCartes.get(i));
            
        for (int i = size / 2; i < size; i++)
            player2.JeuDeCartes.add(paquetDeCartes.get(i));

        while (player1.JeuDeCartes.size()>= 1 && player2.JeuDeCartes.size()>= 1){
            if (player1.JeuDeCartes.size()==1){
                System.out.println(player2.nom + " est le vainqueur");
                break;
            }
            if (player2.JeuDeCartes.size()==1){
                System.out.println(player1.nom + " est le vainqueur");
                break;
            }
            List<Carte> tie = new ArrayList<Carte>();
            Carte c1 = player1.JeuDeCartes.get(0);
            Carte c2 = player2.JeuDeCartes.get(0);
            if (c1.getValeur() < c2.getValeur()){
                player1.JeuDeCartes.remove(0);
                player2.JeuDeCartes.add(c1);
                player2.JeuDeCartes.add(c2);
                player2.JeuDeCartes.addAll(tie);
                player2.points += 1;
            }
            else if (c1.getValeur() > c2.getValeur()) {
                player2.JeuDeCartes.remove(0);
                player1.JeuDeCartes.add(c2);
                player1.JeuDeCartes.add(c1);
                player2.JeuDeCartes.addAll(tie);
                player1.points += 1;
            }
            else {
                player2.JeuDeCartes.remove(0);
                player1.JeuDeCartes.remove(0);
                tie.add(c1);
                tie.add(c2);
            }
        }
    }
}