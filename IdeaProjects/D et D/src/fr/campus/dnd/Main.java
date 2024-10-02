package fr.campus.dnd;

import java.sql.SQLException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        menu.choixMenu();
    }
}


