package fr.campus.dnd;

import fr.campus.dnd.boucliers.EquipementDefensif;

public class Bouclier extends EquipementDefensif {
    private String type;
    private int defensiveStrong;
    private String name;


    public Bouclier(String type, int defensiveStrong, String name) {
        super(type, defensiveStrong, name);
        this.type = type;
        this.defensiveStrong = defensiveStrong;
        this.name = name;
    }
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    public int getDefensiveStrong() {
        return defensiveStrong;
    }
    public void setDefensiveStrong(int defensiveStrong) {
        this.defensiveStrong = defensiveStrong;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            return super.toString();
    }
}