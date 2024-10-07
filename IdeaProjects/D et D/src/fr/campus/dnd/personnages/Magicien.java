package fr.campus.dnd.personnages;

import fr.campus.dnd.armes.EquipementOffensif;
import fr.campus.dnd.boucliers.EquipementDefensif;

public class Magicien extends Personnage {


    public Magicien() {

        this.equipementOffensif = new EquipementOffensif("boule de feu ", 7,"armes" );
        this.equipementDefensif = new EquipementDefensif("philtre", 3,"philtre");
    }

    public Magicien(String name, String type){
        super(name, "magicien", 5, 8 );
        this.name = name;
        this.type = type;
        this.niveauVie = 5;
        this.forceAttaque = 8;
        this.equipementOffensif = new EquipementOffensif("boule de feu ", 7,"armes" );
        this.equipementDefensif = new EquipementDefensif("philtre", 3,"philtre");
    }

}

