package com.mycompany.intento3;

import java.util.Scanner;

public class Intento3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int puerta;
        String matricula;
        String modelo;
        boolean valor;
        System.out.println("Bienvenido, dime sobre tu auto");
        System.out.println("Dime el Numero de puertas de tu auto");
        puerta = entrada.nextInt();
        System.out.println("Dime la matricula");
        entrada.nextLine();
        matricula = entrada.nextLine();
        System.out.println("Dime el modelo");
        modelo = entrada.nextLine();
        System.out.println("Tu auto es todo terrero True/false");
        valor = entrada.nextBoolean();
        if(valor == true){
            String suspencion;
            System.out.println("Que calidad de suspencion tiene tu auto?");
            entrada.nextLine();
            suspencion= entrada.nextLine();
            //EL polimorfismo consiste en utilizar un mismo nombre para diferentes usos 
            //tambien usado para reducir codigo dublicado 
        Vehiculo carro = new VehiculoTodoTerremo(puerta, matricula, modelo, suspencion);
        carro.Mostrar_Datos();
        //return para finailzar el codigo y que no siga la partre de abajo
        return ;
        }
        System.out.println("Tu auto es Deportivo? true/false");
        valor = entrada.nextBoolean();
        if(valor == true){
            String llanta;
            System.out.println("Cual es el tipo de llantas que tiene?");
            entrada.nextLine();
            llanta = entrada.nextLine();
            Vehiculo carro = new VehiculoDeportivo(puerta, matricula, modelo, llanta);
            carro.Mostrar_Datos();
            return;
        }
        System.out.println("Tu auto es industrial? true/false");
        valor= entrada.nextBoolean();
        if(valor ==true){
            int maletero;
            System.out.println("Capacidad del maletaero?");
            entrada.nextLine();
            maletero = entrada.nextInt();
            Vehiculo carro = new VehiculoIndustrial(puerta, matricula, modelo, maletero);
            carro.Mostrar_Datos();
            return;
        }
        //nota se puede usar polimorfismo con clasea asbtractas siempre que esta no se instancie a si misma
        Vehiculo carro = new Vehiculo(puerta, matricula, modelo);
        carro.Mostrar_Datos();
        
    }
}
