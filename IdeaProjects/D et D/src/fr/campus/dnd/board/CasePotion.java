package fr.campus.dnd.board;

import fr.campus.dnd.personnages.Personnage;
import fr.campus.dnd.items.GrandePotion;
import fr.campus.dnd.items.Potion;
import fr.campus.dnd.items.PotionStandard;

import java.util.Random;

public class CasePotion implements Case {
    private String name;
    private final Potion potion;

    // Constructeur de fr.campus.dnd.board.CasePotion
    public CasePotion() {
        Random random = new Random();
        if (random.nextBoolean()) {
            this.potion = new GrandePotion();
        } else {
            this.potion = new PotionStandard();
        }
        this.name = "Potion";
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Setter pour le nom (accepte un paramètre)
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void appliquerEvenement(Personnage personnage) {
        System.out.println("Vous avez trouvé une potion : " + potion.getName());
        personnage.boirePotion(potion);

    }

    // Description de la case
    @Override
    public String getDescription() {
        return "Vous êtes sur une case contenant une potion : " + potion.getName();
    }
}
