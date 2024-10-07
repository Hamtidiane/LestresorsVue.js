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
    public boolean appliquerEvenement(Personnage personnage) {

        return true;
    }

    @Override
    public String getDescription() {
        return "Vous êtes sur : " + name;
    }
}

