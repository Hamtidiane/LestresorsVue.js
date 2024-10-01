package fr.campus.dnd.board;
import fr.campus.dnd.personnages.Personnage;

public interface Case {
     void appliquerEvenement(Personnage personnage);

    String getDescription();

    }

