package fr.campus.dnd.board;
import fr.campus.dnd.personnages.Personnage;

public interface Case {
    /**
     * Dans cette fonction le joueur combat l'ennemi
     * @param personnage se deplace sur la plateau et tombe sur une case ennemi
     * @return true si la partie continue et false quand le personnage meurt
     */
     boolean appliquerEvenement(Personnage personnage);

    String getDescription();

    }

