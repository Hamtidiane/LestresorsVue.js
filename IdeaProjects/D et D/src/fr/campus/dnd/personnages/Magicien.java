package fr.campus.dnd.personnages;

import fr.campus.dnd.armes.EquipementOffensif;
import fr.campus.dnd.boucliers.EquipementDefensif;

public class Magicien extends Personnage {
    String name;
    String type;
    int niveauVie;
    int forceAttaque;

    public Magicien() {

        this.equipementOffensif = new EquipementOffensif("boule de feu ", 7,"armes" );
        this.equipementDefensif = new EquipementDefensif("philtre", 3,"philtre");
    }

    public Magicien(String name, String type){
        super(name, "magicien", 6, 15 );
        this.name = name;
        this.type = type;
        this.niveauVie = 6;
        this.forceAttaque = 15;
        this.equipementOffensif = new EquipementOffensif("boule de feu ", 7,"armes" );
        this.equipementDefensif = new EquipementDefensif("philtre", 3,"philtre");
    }

    @Override
    public int getniveauVie() {
        return super.getniveauVie();
    }

    @Override
    public void setniveauVie(int niveauVie) {
        super.setniveauVie(niveauVie);
    }


    @Override
    public int getForceAttaque() {
        return super.getForceAttaque();
    }

    @Override
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

