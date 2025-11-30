package intento1;

import java.util.Scanner;
public class Intento1 {

    public static void main(String[] args) {
        String nombre;
        int edad; 
        String genero;
        int id;
        String libro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        System.out.println("Cual es su genero");
        entrada.nextLine();
        genero = entrada.nextLine();
        System.out.println("ID del estudiante");
        id = entrada.nextInt();
        // con la palabra new se esta instanciando una clase para crear un objeto en 
        //una direccion que seria el nombre del objeto
        ClaseHija Estudiante = new ClaseHija(nombre, edad, genero, id);
        System.out.println("Nombre del Libro leido");
        entrada.nextLine();
        libro = entrada.nextLine();
        Estudiante.MostraDatos(libro);
    }
    
}
