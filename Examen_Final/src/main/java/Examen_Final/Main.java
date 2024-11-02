/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_Final;

/**
 *
 * @author Walter Ramos
 */
public class Main {
    public static void main(String[] args) {
        AnimalDAO animalDAO = new AnimalDAO();

        // Crear un nuevo animal
        Animal nuevoAnimal = new Animal(1, "León", "2020-05-15", "Felino");
        animalDAO.insertarAnimal(nuevoAnimal);

        // Leer todos los animales
        for (Animal animal : animalDAO.obtenerAnimales()) {
            System.out.println("ID: " + animal.getId() + ", Nombre: " + animal.getNombre() +
                    ", Fecha Nacimiento: " + animal.getFechaNacimiento() + ", Especie: " + animal.getEspecie());
        }

        // Actualizar un animal
        nuevoAnimal.setNombre("León Modificado");
        animalDAO.actualizarAnimal(nuevoAnimal);

        // Eliminar un animal
        animalDAO.eliminarAnimal(1);
    }
}
