package com.mycompany.intento3;

public class Vehiculo {
    protected int no_puertas;
    protected String matricula;
    protected String modelo;
    
    public Vehiculo(int no_puertas, String matricula, String modelo){
        this.no_puertas= no_puertas;
        this.matricula= matricula;
        this.modelo= modelo;
    }
    public int getno_puertas(){
        return no_puertas;
    }
    public String getmatricula(){
        return matricula;
    }
    public String getmodelo(){
        return modelo;
    }
    public void Mostrar_Datos(){
        System.out.println("Numero de puertas: " + no_puertas+ 
                "\nMatricula: " +matricula+
                "\nModelo: " +modelo);
    }
}
