package fr.campus.dnd.board;

import fr.campus.dnd.personnages.Personnage;
import fr.campus.dnd.armes.Arme;
import fr.campus.dnd.armes.ArmeEpee;
import fr.campus.dnd.armes.ArmeMassue;


import java.util.Random;

public class CaseArme implements Case {
    private String name;
    private Arme arme;

    // Constructeur de fr.campus.dnd.board.CaseArme
    public CaseArme() {
        Random random = new Random();
        // Choix aléatoire entre fr.campus.dnd.ArmeEpee et fr.campus.dnd.ArmeMassue
        if (random.nextBoolean()) {
            this.arme = new ArmeEpee("equipementOffensif", 5, "Epee");
        } else {
            this.arme = new ArmeMassue("equipementOffensif", 3, "Massue");
        }
        this.name = "fr.campus.dnd.board.Case fr.campus.dnd.Arme";
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
    @Override
    public void appliquerEvenement(Personnage personnage) {
        System.out.println("Vous avez trouvé une arme : " + arme.getName());
        personnage.equiperArme(arme); // Le personnage équipe l'arme
    }

    // Description de la case
    @Override
    public String getDescription() {
        return "Vous êtes sur une case contenant une arme : " + arme.getName();
    }
}
