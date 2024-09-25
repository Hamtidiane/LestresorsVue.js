public class Boucliers {
    private String name;
    private int defensiveStrong;
    private String type;

    public Boucliers(String name, int defensiveStrong, String type) {
        this.name = name;
        this.defensiveStrong = defensiveStrong;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefensiveStrong() {
        return defensiveStrong;
    }

    public void setDefensiveStrong(int defensiveStrong) {
        this.defensiveStrong = defensiveStrong;
    }

    public String toString() {
    return "Bouclier " + name + " - Puissance: " + defensiveStrong;
    }

}
