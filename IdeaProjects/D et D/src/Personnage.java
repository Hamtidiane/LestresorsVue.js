
import java.util.Scanner;
public class Personnage {
    private String type;
    private String name;
    private Armes equipementOffensif;
    private Boucliers equipementDefensif;
    private int niveauVie;
    private int forceAttaque;

    public Personnage() {
        this.type = "unknown";
        this.name = "unknown";
    }

    public Personnage(String name) {
        this.type = "unknown";
        this.name = name;
    }

    public Personnage(String type, String name) {
        this.type = type;
        this.name = name;
        if (type.equals("guerrier")) {
            this.niveauVie = 10;
            this.forceAttaque = 10;

            this.equipementOffensif = new Armes("epée", 5,"armes" );
            this.equipementDefensif = new Boucliers("defensif", 3,"boucliers");
        } else if (type.equals("magicien")) {
            this.niveauVie = 6;
            this.forceAttaque = 15;
            this.equipementOffensif = new Armes("epée", 5,"armes" );
            this.equipementDefensif = new Boucliers("boule de feu ", 7,"boucliers");
        } else {
            throw new IllegalArgumentException("Type de personnage non reconnu.");
        }
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
}






