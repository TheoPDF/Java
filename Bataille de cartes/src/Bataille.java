import java.util.*;

public class Bataille {

    public static void main(String[] args) {
    	//we create two players and make them plays
        Joueur player2 = new Joueur("player2");
        Joueur player1 = new Joueur("player1");
        jouer(player1, player2);

    }

    public static void jouer(Joueur player1, Joueur player2) {
    	//we create a deck of cards with 52 cards
        List<Carte> paquetDeCartes = new ArrayList<Carte>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                paquetDeCartes.add(new Carte(i, j));
            }
        }
        Collections.shuffle(paquetDeCartes);
        
        //we gives half of the deck to player1
        int size = paquetDeCartes.size();
        //we need to set the size here because the size will shrink
        for (int i = 0; i < size / 2; i++) {
            player1.JeuDeCartes.add(paquetDeCartes.get(i));
        	paquetDeCartes.remove(i);
        }
            
        //we give the remaining cards to player2
        for (int i = 0; i < paquetDeCartes.size(); i++)
            player2.JeuDeCartes.add(paquetDeCartes.get(i));
        
        //we check if there is still cards in the cards deck of player1 and player2
        while (player1.JeuDeCartes.size()>= 1 && player2.JeuDeCartes.size()>= 1){
        	//if there is no card left in the deck of player1, player2 is the winner
            if (player1.JeuDeCartes.size()==1){
                System.out.println(player2.nom + " est le vainqueur");
                break;
            }

        	//if there is no card left in the deck of player2, player1 is the winner
            if (player2.JeuDeCartes.size()==1){
                System.out.println(player1.nom + " est le vainqueur");
                break;
            }
            //we count the point by drawing the first card if each deck
            List<Carte> tie = new ArrayList<Carte>();
            Carte c1 = player1.JeuDeCartes.get(0);
            Carte c2 = player2.JeuDeCartes.get(0);
            
            System.out.println(player1.toString() + ", carte: " + c1);
            System.out.println(player2.toString() + ", carte: " + c2);
            //if the value of player1 card is bigger then he win the card of player2
            if (c1.getValeur() < c2.getValeur()){
                player1.JeuDeCartes.remove(0);
                player2.JeuDeCartes.add(c1);
                player2.JeuDeCartes.add(c2);
                player2.JeuDeCartes.addAll(tie);
                player2.points += 1;
                System.out.println("Player2 remporte le round");
            }
            //if the value of player2ccard is bigger then he win the card of player1
            else if (c1.getValeur() > c2.getValeur()) {
                player2.JeuDeCartes.remove(0);
                player1.JeuDeCartes.add(c2);
                player1.JeuDeCartes.add(c1);
                player1.JeuDeCartes.addAll(tie);
                player1.points += 1;
                System.out.println("Player1 remporte le round");
            }
            //if the value are equal the cards goes in the tie list 
            //were they will stack until one of the player win a round
            else {
                player2.JeuDeCartes.remove(0);
                player1.JeuDeCartes.remove(0);
                tie.add(c1);
                tie.add(c2);
            }
            System.out.println(System.getProperty("line.separator"));
        }
    }
}