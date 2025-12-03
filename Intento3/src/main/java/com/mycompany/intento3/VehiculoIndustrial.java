package com.mycompany.intento3;

public class VehiculoIndustrial extends Vehiculo{
    private int capacidad_maletero;
    
    public VehiculoIndustrial(int no_puertas, String matricula, String modelo, int capacidad_maletero){
        super(no_puertas, matricula, modelo);
        this.capacidad_maletero = capacidad_maletero;
    }
    @Override
    public void Mostrar_Datos(){
        System.out.println("Numero de puertas: " + no_puertas+ 
                "\nMatricula: " +matricula+
                "\nModelo: " +modelo+
                "\nCapacidad del Maletero: " +capacidad_maletero+ "KG");
    }
}
