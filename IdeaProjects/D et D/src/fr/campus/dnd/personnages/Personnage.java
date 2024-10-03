package fr.campus.dnd.personnages;

import fr.campus.dnd.armes.Arme;
import fr.campus.dnd.armes.EquipementOffensif;
import fr.campus.dnd.boucliers.EquipementDefensif;
import fr.campus.dnd.items.Potion;

public class Personnage {
    protected String type;
    protected String name;
    EquipementOffensif equipementOffensif;
    EquipementDefensif equipementDefensif;
    protected int niveauVie;
    protected int forceAttaque;
    private int id;

    public Personnage() {
        this.type = "unknown";
        this.name = "unknown";
    }

    public Personnage(String name) {
        this.type = "unknown";
        this.name = name;
    }

    public Personnage(String name, String type, int niveauVie, int forceAttaque) {
        this.type = type;
        this.name = name;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;


    }

    public EquipementOffensif getEquipementOffensif() {
        return equipementOffensif;
    }

    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    public EquipementDefensif getEquipementDefensif() {
        return equipementDefensif;
    }

    public void setEquipementDefensif(EquipementDefensif equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }

    public void boirePotion(Potion potion) {
        this.niveauVie += potion.getNiveauVie();
        System.out.println("Vous avez récupéré " + potion.getNiveauVie() + " points de vie.");
    }

    public void equiperArme(Arme arme) {
        this.equipementOffensif = arme;
        System.out.println("Vous avez équipé l'arme : " + arme.getName() + " avec " + arme.getStrong() + " dégâts.");
    }
    public void combattreEnnemi(Ennemi ennemi) {
        System.out.println("Vous combattez : " + ennemi.getName() + " avec " + ennemi.getNiveauVie() + " points de vie.");
    }
        //GETTERS & SETTERS

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

    public int getniveauVie() {
        return niveauVie;
    }
    public void setniveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    @Override
    public String toString() {
        return "Personnage [Name=" + name + ", Type=" + type + ", Niveau de vie=" + niveauVie +
                ", Force d'attaque=" + forceAttaque +
                ", Equipement offensif=" + equipementOffensif +
                ", Equipement défensif=" + equipementDefensif + "]";
    }



    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}




//https://github.com/antoineGranjon/Donjon-et-dragons/blob/master/src/main/java/dungeonanddragons/main.java

