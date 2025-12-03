package com.mycompany.intento3;


public class VehiculoTodoTerremo extends Vehiculo {
    
    private String calidad_suspencion;
    
    public VehiculoTodoTerremo(int no_puertas, String matricula, String modelo, String calidad_suspencion){
        super(no_puertas, matricula, modelo);
        this.calidad_suspencion= calidad_suspencion;
    }
    
    @Override
    public void Mostrar_Datos(){
     System.out.println("Numero de puertas: " + no_puertas+ 
                "\nMatricula: " +matricula+
                "\nModelo: " +modelo+
                "\nCalidad de la suspencion: " +calidad_suspencion);   
    }
}
