public class ArmeEpee extends Arme{
    private String type;
    private int strong;
    private String name;

    public ArmeEpee(String type, int strong, String name){
        super(type, strong, name);
        this.type = type;
        this.strong = strong;
        this.name = name;
    }
    public String getType(){
        return type;
    }

    @Override
    public void setType(String name) {
        this.name = name;
    }
    public int getStrong(){
        return strong;
    }
    public void setStrong(int strong){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
