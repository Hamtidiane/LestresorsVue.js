package fr.campus.dnd.items;

public class Potion {
    private String name;
    private int niveauVie;

    public Potion(String name, int niveauVie){
        this.name = name;
        this.niveauVie = niveauVie;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNiveauVie(){
        return niveauVie;
    }
    public void setNiveauVie(int niveauVie){

    }

    public String toString(){
        return "Potion [vous avez une potion " +name+ ",niveau de vie : " + niveauVie+"]" ;
    }
}
