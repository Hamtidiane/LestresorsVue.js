package fr.campus.dnd.board;

import fr.campus.dnd.personnages.EnnemiDragon;
import fr.campus.dnd.personnages.EnnemiGobelin;
import fr.campus.dnd.personnages.EnnemiSorcier;
import fr.campus.dnd.personnages.Ennemi;
import fr.campus.dnd.personnages.Personnage;

import java.util.Random;

public class CaseEnnemi implements Case {
    private String name;
    private Ennemi ennemi;

    // Constructeur de fr.campus.dnd.board.CaseEnnemi
    public CaseEnnemi() {
        Random random = new Random();
        // Choix aléatoire entre fr.campus.dnd.EnnemiDragon, fr.campus.dnd.EnnemiSorcier et fr.campus.dnd.EnnemiGobelin
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                this.ennemi = new EnnemiDragon();
                break;
            case 1:
                this.ennemi = new EnnemiSorcier();
                break;
            case 2:
                this.ennemi = new EnnemiGobelin();
                break;
        }
        this.name = "Ennemi";
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Setter pour le nom
    public void setName(String name) {
        this.name = name;
    }

    // Méthode à appliquer lorsque le joueur atterrit sur cette case

    /**
     * Dans cette fonction le joueur combat l'ennemi
     * @param personnage se deplace sur la plateau et tombe sur une case ennemi
     * @return true si la partie continue et false quand le personnage meurt
     */
    @Override
    public boolean appliquerEvenement(Personnage personnage) {
        System.out.println("Vous rencontrez un ennemi : " + ennemi.getName());
        boolean continuePartie = personnage.combattreEnnemi(ennemi); // Le personnage engage le combat contre l'ennemi
        return continuePartie;
    }// combattre ennemi est la methode a appliquer dans Personnage

    // Description de la case
    @Override
    public String getDescription() {
        return "Vous êtes sur une case contenant un ennemi : " + ennemi.getName();
    }
}
