package fr.campus.dnd.personnages;

import fr.campus.dnd.armes.EquipementOffensif;
import fr.campus.dnd.boucliers.EquipementDefensif;

public class Guerrier extends Personnage {

    String name;
    String type;
    int niveauVie;
    int forceAttaque;

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

    @Override
    public int getNiveauVie() {
        return super.getNiveauVie();
    }

    @Override
    public void setNiveauVie(int niveauVie) {
        super.setNiveauVie(niveauVie);
    }

    @Override
    public int getForceAttaque() {
        return super.getForceAttaque();
    }
    public void setForceAttaque(int forceAttaque) {
        super.setForceAttaque(forceAttaque);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
    return super.toString()  ;
    }
}