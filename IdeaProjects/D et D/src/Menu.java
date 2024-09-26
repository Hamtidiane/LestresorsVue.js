import java.util.Random;
import java.util.Scanner;

public class Menu {
    Scanner scanner;


    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public  Personnage creerPersonnage(Scanner scanner) {
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
            personnage = new Magicien(name ,type);
        }

        System.out.println("Personnage créé : " + personnage);
        return personnage;
    }

    public  int lancerDe() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Méthode principale pour lancer le jeu
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

                    int[] plateau = new int[64];
                    int position = 0;
///////////////////////////////////////////////////////////////////////////////////////////////////////////
                    Random random = new Random();
                    int casePerdante = random.nextInt(62) + 1;
                    System.out.println("Attention ! La case " + casePerdante + " est une case perdante !");
///////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //int ennemi = random.nextInt(62) + 1;
                    // System.out.println("Combat contre un ennemi : " + ennemi);
                    //int caseSurprise = random.nextInt(62) + 1;
                    //System.out.println("Vous avez une surprise: " + caseSurprise);
                    // String event = plateau.get(position).toString();
                    /*if (event.equals("bonus")) {
                        position = new RandomBonus(personnage, sc, position).invoke();
                    } else if (event.equals("ennemi")) {
                        Ennemi randomEnnemi = Ennemi.random();
                        int ennemyLife = randomEnnemi.getniveauVie();
                        System.out.println("Vous êtes sur une case ennemi !");
                        System.out.println("Votre ennemi: " + randomEnnemi.getName() + " !");
                        System.out.println("Il possède " + ennemyLife + " points de vie et " + randomEnnemi.getforceAttaque() + " de puissance");

                        while (ennemyLife > 0) {
                            int dmg = (player.getForce() + player.getArmePuissance());
                            System.out.println("Vous infligez " + dmg + " points de dégats");
                            System.out.println(randomEnnemi.getName() + " vous inflige " + randomEnnemi.getPuissance() + " points de dégats");
                            player.setVie(player.getVie() - randomEnnemi.getPuissance());
                            if (player.getVie() < 1) {
                                System.out.println("You lost");
                                System.out.println("Tu t'es fais DÉTRUIRE par " + randomEnnemi.getName());
                                play = false;
                                break;
                            }
                            ennemyLife = ennemyLife - dmg;
                            System.out.println("Vos points de vie: " + player.getVie());
                            System.out.println("Les points de vie de l'adversaire: " + ennemyLife);
                            if (ennemyLife < 1) {
                                System.out.println("Vous avez tué " + randomEnnemi.getName() + " !");
                            }

                            System.out.println("Appuyer sur Entrée pour continuer");
                            scanner.nextLine();
                        }*/
                    System.out.println("Plateau de 64 cases initialisé. Vous commencez à la case 0.");

                    while (position < 63) {
                        System.out.println("\nAppuyez sur Entrée pour lancer le dé...");
                        scanner.nextLine();

                        int lancer = lancerDe();
                        System.out.println("Vous avez lancé un " + lancer + " !");
                        position += lancer;
////////////////////////////////////////////////////////////////////////////////////////////////////////
                        if (position == casePerdante) {
                            System.out.println("Oh non ! Vous êtes tombé sur la case " + casePerdante + " et vous avez perdu !");
                            playGame = false;
                            break;
                        } else {
                            System.out.println("Vous êtes maintenant à la case " + position);
                        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
                    }
                    position = 63;
                    System.out.println("Vous êtes arrivé à la dernière case du plateau ! Félicitations !");
                    break;

                case "2":
                    playGame = false;
                    System.out.println("Merci d'avoir joué. À bientôt !");
                    break;

                default:
                    System.out.println("Choix non valide, veuillez réessayer.");
            }
        }
        scanner.close();
    }


}