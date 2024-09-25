import java.util.Random;

public class Plateau {

    // Représentation du plateau de 64 cases
    private static final int TAILLE_PLATEAU = 64;
    private String[] plateau = new String[TAILLE_PLATEAU];



    // Méthode pour initialiser le plateau
    private void initialiserPlateau() {
        for (int i = 0; i < TAILLE_PLATEAU; i++) {
            plateau[i] = "Case " + (i + 1);
        }
    }

    // Méthode pour simuler un lancé de dé (6 faces)
    public int lancerDe() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Retourne un nombre entre 1 et 6
    }

    // Afficher le plateau
    public void afficherPlateau() {
        for (int i = 0; i < TAILLE_PLATEAU; i++) {
            System.out.println(plateau[i]);
        }
    }
}

    /*public static void main(String[] args) {
        DonjonEtDragon jeu = new DonjonEtDragon();
        jeu.afficherPlateau(); // Affiche les 64 cases du plateau

        // Exemple de lancer de dé
        int resultatDe = jeu.lancerDe();
        System.out.println("Résultat du lancer de dé : " + resultatDe);
    }
}*/
