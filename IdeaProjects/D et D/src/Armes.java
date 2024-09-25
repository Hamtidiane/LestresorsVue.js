
public class Armes {
    private String name;
    private int strong;
    private String type;

    public Armes(String name, int strong, String type) {
        this.name = name;
        this.strong = strong;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return name + " - Puissance: " + strong;
    }

}