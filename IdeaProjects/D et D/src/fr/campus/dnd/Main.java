package fr.campus.dnd;

import java.sql.SQLException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

                                            System.out.println("        ,     \\    /      ,        \n" +
                                                    "       / \\    )\\__/(     / \\       \n" +
                                                    "      /   \\  (_\\  /_)   /   \\      \n" +
                                                    " ____/_____\\__\\@  @/___/_____\\____ \n" +
                                                    "|             |\\../|              |\n" +
                                                    "|              \\VV/               |\n" +
                                                    "|        Donjons et Dragons       |\n" +
                                                    "|_________________________________|\n" +
                                                    " |    /\\ /      \\\\       \\ /\\    | \n" +
                                                    " |  /   V        ))       V   \\  | \n" +
                                                    " |/     `       //        '     \\| \n" +
                                                    " `              V                '");

        menu.choixMenu();
    }
}


