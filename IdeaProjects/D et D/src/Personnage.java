abstract class Personnage {
    protected String type;
    protected String name;
    EquipementOffensif equipementOffensif;
    EquipementDefensif equipementDefensif;
    protected int niveauVie;
    protected int forceAttaque;

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
        return "Personnage cvzcv[Name=" + name + ", Type=" + type + ", Niveau de vie=" + niveauVie +
                ", Force d'attaque=" + forceAttaque +
                ", Equipement offensif=" + equipementOffensif +
                ", Equipement défensif=" + equipementDefensif + "]";
    }
}






