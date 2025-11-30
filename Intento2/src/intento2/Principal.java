package intento2;

import java.util.Scanner;
//la abstraccion va de la mano con la herenia sirve para crear un modelo de programar 
//para tener un orden y privacidad 
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Hija1 opcion1 = new Hija1();
        Nieta1 opcion2 = new Nieta1();
        Nieta2 opcion3 = new Nieta2();
        int menu;
        System.out.println("Hola, dime que te gustaria cenar?");
        System.out.println("1. Pollo con arroz");
        System.out.println("2. Caldo de Res");
        System.out.println("3. Camarones asados");
        menu = entrada.nextInt();
        switch(menu){
            case 1 :
                opcion1.Alimentarse();
                break;
            case 2 : 
                opcion2.Alimentarse();
                break;
            case 3 : 
                opcion3.Alimentarse();
                break;
        }
    }
    
}
