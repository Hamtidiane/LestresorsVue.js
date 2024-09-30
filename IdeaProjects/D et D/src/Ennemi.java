public enum Ennemi  {
    sorcier("sorcier", 2, 9),
    gobelin("gobelin", 1, 6),
    dragon("dragon", 4, 15);

    private final String name;
    private  int niveauVie;
    private final int forceAttaque;

    Ennemi(String name,  int niveauVie, int forceAttaque) {
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

    public  Ennemi random() {
        return values()[(int) (Math.random() * values().length)];
    }

    @Override
    public String toString() {
        return "Ennemi [Name=" + name + ", Force d'attaque=" + forceAttaque +", Niveau de vie=" + niveauVie + "]";    }
}
