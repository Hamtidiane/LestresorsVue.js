public class CaseArme implements Case{
    public String name;
   CaseArme(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }

    @Override
    public String toString() {
       return "Vous venez d'acquerir un(e) " + name;
    }
}