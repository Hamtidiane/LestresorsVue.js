
import java.util.Random;
import java.util.Scanner;

public class Menu {
    Scanner scanner;
    boolean playGame = false;



    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

   public String choixMenu(){
       System.out.println("Donjons et Dragons - Menu principal");
       System.out.println("1 - Jouer");
       System.out.println("2 - Quitter");
       System.out.print("Votre choix: ");
       String choixMenu = scanner.nextLine();


       if(choixMenu.equals("1")){

       System.out.println(weaponFactory());
           playGame = true;
           play();
           System.out.println(playGame);
       }else {
           playGame = false;
           System.out.println("Merci de votre visite.");
       }

       return choixMenu;
   }

    public Arme weaponFactory(){
        Random rand = new Random();
        ArmeEpee createEpee = new ArmeEpee("Epée", 5, "excalibur");
        ArmeMassue createMassue = new ArmeMassue("Massue", 3, "togum");
        Arme [] weaponsCloset = {createEpee, createMassue};

        int weaponsIndex = rand.nextInt(weaponsCloset.length);

        return weaponsCloset[weaponsIndex];
    }

    public Personnage creerPersonnage(Scanner scanner) {
        Personnage personnage = null;
        String type;
        String name;

        do {
            System.out.println("Quel type de personnage souhaitez-vous créer ? (guerrier/magicien)");
            type = scanner.nextLine();
        } while (!type.equals("guerrier") && !type.equals("magicien"));

        System.out.println("Entrez le nom du personnage: ");
        name = scanner.nextLine();


        if (type.equals("guerrier")) {
            personnage = new Guerrier(name, type);
        } else {
            personnage = new Magicien(name, type);
        }

        System.out.println("Personnage créé : " + personnage);
        return personnage;
    }


    public void play() {

        Personnage personnage = null;


        while (playGame) {
                if (personnage == null) {
                    personnage = creerPersonnage(scanner);
                    Game game = new Game();
                    game. jouer_un_tour();
                }
            }
        }

    }





