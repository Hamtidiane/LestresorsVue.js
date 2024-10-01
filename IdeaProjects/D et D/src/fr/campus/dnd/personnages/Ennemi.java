package fr.campus.dnd.personnages;

public class Ennemi  {

    private final String name;
    private  int niveauVie;
    private final int forceAttaque;

    Ennemi(String name, int niveauVie, int forceAttaque) {
        this.name = name;
        this.forceAttaque = forceAttaque;
        this.niveauVie = niveauVie;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

    }
    public int getForceAttaque() {
        return forceAttaque;
    }
    public int getNiveauVie() {
        return niveauVie;
    }
    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }



    @Override
    public String toString() {
        return "fr.campus.dnd.Ennemi [Name=" + name + ", Force d'attaque=" + forceAttaque +", Niveau de vie=" + niveauVie + "]";    }
}
