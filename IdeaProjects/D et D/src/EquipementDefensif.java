public class EquipementDefensif {
    private String type;
    private int defensiveStrong;
    private String name;

    public EquipementDefensif(String name, int defensiveStrong, String type) {
        this.type = type;
        this.defensiveStrong = defensiveStrong;
        this.name = name;
    }

    public String getType(){
        return type;
    }

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
    public String toString() {
    return " Bouclier " + name + " - Puissance: " + defensiveStrong;
    }

}
