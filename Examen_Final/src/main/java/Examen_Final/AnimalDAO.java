/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_Final;

/**
 *
 * @author Walter Ramos
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    // Insertar un nuevo animal
    public void insertarAnimal(Animal animal) {
        String sql = "INSERT INTO animales (id, nombre, fecha_nacimiento, especie) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, animal.getId());
            stmt.setString(2, animal.getNombre());
            stmt.setString(3, animal.getFechaNacimiento());
            stmt.setString(4, animal.getEspecie());

            stmt.executeUpdate();
            System.out.println("Animal insertado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Leer todos los animales
    public List<Animal> obtenerAnimales() {
        List<Animal> animales = new ArrayList<>();
        String sql = "SELECT * FROM animales";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Animal animal = new Animal(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("especie")
                );
                animales.add(animal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animales;
    }

    // Actualizar un animal existente
    public void actualizarAnimal(Animal animal) {
        String sql = "UPDATE animales SET nombre = ?, fecha_nacimiento = ?, especie = ? WHERE id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNombre());
            stmt.setString(2, animal.getFechaNacimiento());
            stmt.setString(3, animal.getEspecie());
            stmt.setInt(4, animal.getId());

            stmt.executeUpdate();
            System.out.println("Animal actualizado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar un animal
    public void eliminarAnimal(int id) {
        String sql = "DELETE FROM animales WHERE id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Animal eliminado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
