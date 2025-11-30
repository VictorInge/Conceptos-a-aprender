package intento1;

import java.util.Scanner;

public class ClaseHija extends ClasePadre {
    Scanner parametro = new Scanner(System.in);
    private int id; 
    public ClaseHija(String nombre, int edad, String genero, int id){
        super(nombre, edad, genero);
        this.id = id;
    }
    public int getId(){
        return id; 
    }
    public String MostraDatos(String libro){
        System.out.println("Nombre: " + getNombre() +
        "\nEdad: " + getEdad() +
        "\nGenero: " + getGenero() +
        "\nid: " + getId() +
        "\nLibro leido: " + libro );
        return null;
    }
}
