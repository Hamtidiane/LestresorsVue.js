package fr.campus.dnd.board;

import fr.campus.dnd.personnages.Personnage;

public class EmptyCase implements Case {
    String name;

    public EmptyCase(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }


    @Override
    public void appliquerEvenement(Personnage personnage) {

    }

    @Override
    public String getDescription() {
        return "Vous êtes sur : " + name;
    }
}

