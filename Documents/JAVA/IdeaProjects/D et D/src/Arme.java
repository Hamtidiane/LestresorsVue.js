public class Arme extends EquipementOffensif {
    private String type;
    private int strong;
    private String name;

    public Arme(String type, int strong, String name) {
        super(type, strong, name);
        this.type = type;
        this.strong = strong;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " - Puissance: " + strong;
    }
}
