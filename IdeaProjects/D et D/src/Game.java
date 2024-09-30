import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    int[] Plateau = new int[64];
    int positionJoueur = 0;
    int casePerdante = random.nextInt(62) + 1;
    boolean playGame = true;

    public void game() {
        System.out.println("Attention ! La case " + casePerdante + " est une case perdante !");
    }

    public void  jouer_un_tour() {

        System.out.println("Plateau de 64 cases initialisé. Vous commencez à la case 0.");

        while (positionJoueur < 63 && playGame) {
            System.out.println("\nAppuyez sur Entrée pour lancer le dé...");
            scanner.nextLine();

            int lancer = lancerDe();
            System.out.println("Vous avez lancé un " + lancer + " !");
            positionJoueur += lancer;

            try {
                if (positionJoueur > 63) {
                    throw new PersonnageHorsPlateauException();
                } else if (positionJoueur == casePerdante) {
                    System.out.println("Oh non ! Vous êtes tombé sur la case " + casePerdante + " et vous avez perdu !");
                    playGame = false;
                    break;
                } else {
                    System.out.println("Vous êtes maintenant à la case " + positionJoueur);
                }
            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Vous avez dépassé la dernière case et êtes hors plateau !");
                positionJoueur = 63; // On remet le joueur à la dernière case
                System.out.println("Vous êtes maintenant à la case " + positionJoueur);
            }
        }

        if (positionJoueur == 63) {
            System.out.println("Vous êtes arrivé à la dernière case du plateau ! Félicitations !");
        }

        scanner.close();
    }

    // Méthode pour lancer un dé
    public int lancerDe() {
        return random.nextInt(6) + 1;
    }




}
