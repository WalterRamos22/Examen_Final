/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_Final;

/**
 *
 * @author Walter Ramos
 */
public class Animal {
    private int id;
    private String nombre;
    private String fechaNacimiento;
    private String especie;

    // Constructor
    public Animal(int id, String nombre, String fechaNacimiento, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
}
