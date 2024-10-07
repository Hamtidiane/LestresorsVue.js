package fr.campus.dnd.personnages;

import fr.campus.dnd.armes.EquipementOffensif;
import fr.campus.dnd.boucliers.EquipementDefensif;

public class Guerrier extends Personnage {

    public Guerrier() {
        this.equipementOffensif = new EquipementOffensif(" epée", 5," armes" );
        this.equipementDefensif = new EquipementDefensif(" defensif", 3," boucliers");

    }

    public Guerrier( String name, String type) {
        super(name, "guerrier", 5, 6);
        this.name = name;
        this.type = type;
        this.niveauVie = 5;
        this.forceAttaque = 6 ;
        this.equipementOffensif = new EquipementOffensif(" epée", 5," armes" );
        this.equipementDefensif = new EquipementDefensif(" defensif", 3," boucliers");
    }

}