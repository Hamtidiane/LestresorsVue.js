package fr.campus.dnd;

import fr.campus.dnd.personnages.Guerrier;
import fr.campus.dnd.personnages.Magicien;
import fr.campus.dnd.personnages.Personnage;

import java.util.Scanner;

public class Menu {
    Scanner scanner;
    boolean playGame = false;



    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

   public String choixMenu(){
       System.out.println("Donjons et Dragons - fr.campus.dnd.Menu principal");
       System.out.println("1 - Jouer");
       System.out.println("2 - Quitter");
       System.out.print("Votre choix: ");
       String choixMenu = scanner.nextLine();


       if(choixMenu.equals("1")){

       //System.out.println(weaponFactory());
           playGame = true;
           play();
           System.out.println(playGame);
       }else {
           playGame = false;
           System.out.println("Merci de votre visite.");
       }

       return choixMenu;
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

        System.out.println("fr.campus.dnd.Personnage créé : " + personnage);
        return personnage;
    }


    public void play() {

        Personnage nouveauPersonnage = null;


        while (playGame) {
                if (nouveauPersonnage == null) {
                    nouveauPersonnage = creerPersonnage(scanner);
                    Game game = new Game();
                    game.setJoueur(nouveauPersonnage);
                    game. jouer_un_tour();
                }
            }
        }

    }





