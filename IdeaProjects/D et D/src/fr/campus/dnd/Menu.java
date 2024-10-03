package fr.campus.dnd;

import fr.campus.dnd.personnages.Guerrier;
import fr.campus.dnd.personnages.Magicien;
import fr.campus.dnd.personnages.Personnage;
import fr.campus.dnd.DataBase.PersonnageManager;
import java.sql.SQLException;
import java.util.Scanner;


public class Menu {
    Scanner scanner;
    boolean playGame = false;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String choixMenu() throws SQLException {
        System.out.println("Donjons et Dragons - Menu principal");
        System.out.println("1 - Jouer");
        System.out.println("2 - Quitter");
        System.out.print("Votre choix: ");
        String choixMenu = scanner.nextLine();

        switch (choixMenu) {
            case "1":
                playGame = true;
                play();
                break;
            case "2":
                playGame = false;
                System.out.println("Merci de votre visite.");
                break;
            default:
                System.out.println("Choix invalide.");
        }
        return choixMenu;
    }

    public Personnage choisirOuCreerPersonnage() throws SQLException {
        System.out.println("Souhaitez-vous selectionner ou créer un joueur.");
        System.out.println("1 - Créer un joueur");
        System.out.println("2 - Selectionner un joueur");
        String choixJoueur = scanner.nextLine();
        switch (choixJoueur) {
            case "1":
                 return creerPersonnage(scanner);
            case "2":
                return afficherEtChoisirPersonnages();
            default:
                System.out.println("Choix invalide.");
                return null;
        }
    }

    private Personnage afficherEtChoisirPersonnages() throws SQLException {
        PersonnageManager personnageManager = new PersonnageManager();

        System.out.println("Liste des personnages disponibles :");
        personnageManager.getHeroes();
        Personnage selectedperso = personnageManager.getHeroFromId();
        return selectedperso;
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
            System.out.println();
        } else {
            personnage = new Magicien(name, type);
        }

        System.out.println("Personnage créé : " + personnage);
        return personnage;
    }

    public void play() throws SQLException {


        while (playGame) {
           /* choixJoueur();
            if
            (nouveauPersonnage == null) {
                nouveauPersonnage = creerPersonnage(scanner);

                // Enregistrer le personnage dans la base de données
                personnageManager.createHero(nouveauPersonnage);

                Game game = new Game();
                game.setJoueur(nouveauPersonnage);
                game.jouer_un_tour();
            }*/
            Personnage personnageSelectionne =  choisirOuCreerPersonnage();
            Game game = new Game();
            game.setJoueur(personnageSelectionne);
            game.jouer_un_tour();
        }

    }
}

// Méthode pour afficher les personnages depuis la base de données


