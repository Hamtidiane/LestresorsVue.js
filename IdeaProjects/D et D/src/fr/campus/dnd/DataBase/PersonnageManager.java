package fr.campus.dnd.DataBase;

import fr.campus.dnd.personnages.Guerrier;
import fr.campus.dnd.personnages.Magicien;
import fr.campus.dnd.personnages.Personnage;

import java.sql.*;
import java.util.Scanner;

public class PersonnageManager {
    private static final String URL = "jdbc:mysql://localhost:3306/DonjonsEtDragons";
    private static final String USER = "Hamtidiane";
    private static final String PASSWORD = "Despreslecoco10@";


    public  void getHeroes() {

        String query = "SELECT * FROM Hero";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "Hamtidiane", "Despreslecoco10@");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Afficher tous les héros disponibles
            System.out.println("Liste des héros disponibles :");
            while (resultSet.next()) {
                Personnage personnage;
                if (resultSet.getString("type").equals("Guerrier")) {
                    personnage = new Guerrier();
                } else {
                    personnage = new Magicien();
                }
                personnage.setId(resultSet.getInt("id"));
                personnage.setName(resultSet.getString("name"));
                personnage.setType(resultSet.getString("type"));
                personnage.setNiveauVie(resultSet.getInt("niveauVie"));
                personnage.setForceAttaque(resultSet.getInt("forceAttaque"));
                System.out.println("ID: " + personnage.getId() + " - Nom: " + personnage.getName() + " -  Type: " + personnage.getType() + " - Points de vie: " + personnage.getNiveauVie()+ " -  Force: " + personnage.getForceAttaque()+ " - " +
                        "Arme: " + personnage.getEquipementOffensif() );
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Personnage getHeroFromId(){

        Scanner scanner = new Scanner(System.in);
        // Demander à l'utilisateur de sélectionner un héros par ID
        System.out.println("Veuillez entrer l'ID du personnage que vous souhaitez sélectionner :");
        int idSelectionne = scanner.nextInt();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "Hamtidiane", "Despreslecoco10@");
            // Exécuter une nouvelle requête pour obtenir les détails du héros sélectionné
            String selectHeroQuery = "SELECT * FROM Hero WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectHeroQuery)) {
                preparedStatement.setInt(1, idSelectionne);
                ResultSet heroResult = preparedStatement.executeQuery();

                if (heroResult.next()) {
                    Personnage personnageSelectionne;
                    if (heroResult.getString("type").equals("Guerrier")) {
                        personnageSelectionne = new Guerrier();
                    } else {
                        personnageSelectionne = new Magicien();
                    }
                    personnageSelectionne.setId(heroResult.getInt("id"));
                    personnageSelectionne.setName(heroResult.getString("name"));
                    personnageSelectionne.setType(heroResult.getString("type"));
                    personnageSelectionne.setNiveauVie(heroResult.getInt("niveauVie"));
                    personnageSelectionne.setForceAttaque(heroResult.getInt("forceAttaque"));
                    System.out.println("Vous avez sélectionné : " + personnageSelectionne.getName());
                    return personnageSelectionne;
                } else {
                    System.out.println("personnage non trouvé.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public  void createHero(Personnage nouveauPersonnage) {

        // Requête SQL pour insérer un personnage
        String insertPersonnage = "INSERT INTO Hero (name, type, niveauVie, forceAttaque, equipementOffensif, equipementDefensif) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "Hamtidiane", "Despreslecoco10@");
             PreparedStatement preparedStatement = connection.prepareStatement(insertPersonnage)) {

            // Remplissage des paramètres de la requête préparée
            preparedStatement.setString(1, nouveauPersonnage.getName());
            preparedStatement.setString(2, nouveauPersonnage.getType());
            preparedStatement.setInt(3, nouveauPersonnage.getNiveauVie());
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

    public boolean editHero(int id, String nouveauName, String nouveauType, int nouveauNiveauVie, int nouveauForceAttaque) {
        String sql = "UPDATE heros SET name = ?, type = ?, niveauVie = ?, forceAttaque = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "Hamtidiane", "Despreslecoco10@");
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Définir les nouveaux paramètres
            statement.setString(1, nouveauName);
            statement.setString(2, nouveauType);
            statement.setInt(3, nouveauNiveauVie);
            statement.setInt(4, nouveauForceAttaque);
            statement.setInt(5, id);

            // Exécuter la mise à jour
            int rowsUpdated = statement.executeUpdate();

            // Vérifier si la mise à jour a réussi
            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }





}


