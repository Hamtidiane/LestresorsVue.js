package fr.campus.dnd.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Plateau {
    private List<Case> cases;

    public Plateau() {
        cases = new ArrayList<>(64);
        genererCases();
    }

    private void genererCases() {

        Random random = new Random();
        for (int i = 0; i < 64; i++) {
            int rand = random.nextInt(4); // 0, 1, ou 2 pour les différents types de cases
            Case caseActuelle;
            switch (rand) {
                case 0:
                    caseActuelle = new EmptyCase("Case vide");
                    break;
                case 1:
                    caseActuelle = new CaseArme();
                    break;
                case 2:
                    caseActuelle = new CasePotion();
                    break;
                default:
                    caseActuelle = new CaseEnnemi();
                    break;
            }
            cases.add(caseActuelle);
        }
    }

    public Case getCase(int position) {
        if (position >= 0 && position < cases.size()) {
            return cases.get(position);
        }
        return null;
    }

    public void afficherPlateau() {
        for (int i = 0; i < cases.size(); i++) {
            System.out.println("fr.campus.dnd.board.Case " + (i + 1) + ": " + cases.get(i).getDescription());
        }
    }
}
