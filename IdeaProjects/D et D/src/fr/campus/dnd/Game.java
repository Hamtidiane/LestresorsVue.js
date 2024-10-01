package fr.campus.dnd;

import fr.campus.dnd.exceptions.PersonnageHorsPlateauException;
import fr.campus.dnd.personnages.Personnage;
import fr.campus.dnd.board.Case;
import fr.campus.dnd.board.Plateau;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private Plateau plateau =null;
    private int positionJoueur = 0;
    private boolean playGame = true;
    private Personnage joueur;

    // Constructeurplateau
    public Game() {
        plateau = new Plateau();
        plateau.afficherPlateau();
        System.out.println("fr.campus.dnd.board.Plateau de 64 cases initialisé. Vous commencez à la case 0.");
    }


    public void jouer_un_tour() {
        while (positionJoueur < 63 && playGame) {
            System.out.println("\nAppuyez sur Entrée pour lancer le dé...");
            scanner.nextLine(); // Attendre l'entrée de l'utilisateur

            int lancer = lancerDe();
            System.out.println("Vous avez lancé un " + lancer + " !");
            positionJoueur += lancer;

            try {

                if (positionJoueur > 63) {
                    throw new PersonnageHorsPlateauException();
                } else {
                    System.out.println("Vous êtes maintenant à la case " + positionJoueur);
                    verifierCase();

                }
            } catch (PersonnageHorsPlateauException e) {
                System.out.println(e.getMessage());
                positionJoueur = 63; // On remet le joueur à la dernière case
                System.out.println("Vous êtes maintenant à la case " + positionJoueur);
            }
        }

        if (positionJoueur == 63) {
            System.out.println("Vous êtes arrivé à la dernière case du plateau ! Félicitations !");
        }

        scanner.close();
    }

    public void verifierCase(){
        //Stocker la case actuelle
        Case caseActuelle = plateau.getCase(positionJoueur);
        caseActuelle.appliquerEvenement(joueur);
        //faire l'action coorespondante

    }
    public int lancerDe() {
        return random.nextInt(6) + 1; // Retourne un nombre entre 1 et 6
    }

    public Personnage getJoueur() {
        return joueur;
    }
    public void setJoueur(Personnage joueur) {
        this.joueur = joueur;
    }
}
