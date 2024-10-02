package fr.campus.dnd.DataBase;

import fr.campus.dnd.personnages.Guerrier;
import fr.campus.dnd.personnages.Magicien;
import fr.campus.dnd.personnages.Personnage;

import java.sql.*;

public class PersonnageManager {
    private static final String URL = "jdbc:mysql://localhost:3306/DonjonsEtDragons";
    private static final String USER = "Hamtidiane";
    private static final String PASSWORD = "Despreslecoco10@";








    public static void getHeroes() {
        String query = "SELECT * FROM Personnages";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "Hamtidiane", "Despreslecoco10@");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Personnage personnage ;
                if (resultSet.getString("type").equals("Guerrier")){
                    personnage = new Guerrier();
                }else{
                    personnage = new Magicien();
                }
                personnage.setId(resultSet.getInt("id"));
                personnage.setName(resultSet.getString("name"));
                personnage.setType(resultSet.getString("type"));
                personnage.setniveauVie(resultSet.getInt("niveauVie"));
                personnage.setForceAttaque(resultSet.getInt("forceAttaque"));
                System.out.println(personnage);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void ajouterPersonnage(Personnage nouveauPersonnage) {
        // Requête SQL pour insérer un personnage
        String insertPersonnage = "INSERT INTO Hero (name, type, niveauVie, forceAttaque, equipementOffensif, equipementDefensif) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "Hamtidiane", "Despreslecoco10@");
             PreparedStatement preparedStatement = connection.prepareStatement(insertPersonnage)) {

            // Remplissage des paramètres de la requête préparée
            preparedStatement.setString(1, nouveauPersonnage.getName());
            preparedStatement.setString(2, nouveauPersonnage.getType());
            preparedStatement.setInt(3, nouveauPersonnage.getniveauVie());
            preparedStatement.setInt(4, nouveauPersonnage.getForceAttaque());
            preparedStatement.setString(5, nouveauPersonnage.getEquipementOffensif().toString());
            preparedStatement.setString(6, nouveauPersonnage.getEquipementDefensif().toString());



            // Exécution de la requête
            preparedStatement.executeUpdate();
            System.out.println("Personnage ajouté : " + nouveauPersonnage.getName());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

