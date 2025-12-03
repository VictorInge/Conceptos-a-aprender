package com.mycompany.intento3;

public class VehiculoDeportivo extends Vehiculo{
    
    private String tipo_llanta;
    
    public VehiculoDeportivo(int no_puertas, String matricula, String modelo, String tipo_llanta){
        super(no_puertas, matricula, modelo);
        this.tipo_llanta= tipo_llanta ;
    }
    
    @Override
    public void Mostrar_Datos(){
        System.out.println("Numero de puertas: " + no_puertas+ 
                "\nMatricula: " +matricula+
                "\nModelo: " +modelo+ 
                "\nTipo de llantas: " +tipo_llanta);
    }
}
