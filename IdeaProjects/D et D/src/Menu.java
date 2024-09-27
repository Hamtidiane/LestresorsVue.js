import java.util.Random;
import java.util.Scanner;

public class Menu {
    Scanner scanner;


    public Menu(Scanner scanner) {
        this.scanner = scanner;
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

    public int lancerDe() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }


    public void play() {
        boolean playGame = true;
        Personnage personnage = null;


        while (playGame) {
            System.out.println("Donjons et Dragons - Menu principal");
            System.out.println("1 - Jouer");
            System.out.println("2 - Quitter");
            System.out.print("Votre choix: ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    if (personnage == null) {
                        personnage = creerPersonnage(scanner);
                    }
            }
        }
    }


}