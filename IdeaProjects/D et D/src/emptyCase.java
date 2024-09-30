public class emptyCase implements Case {
    String name;

    public emptyCase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
      return   "vous êtes sur une case vide";
    }
}

