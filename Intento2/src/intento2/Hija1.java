package intento2;


public class Hija1 extends Abstraccion {
   //para Heredar una clase abstracta se usa @Override para identificar 
    //que proviene de una calse abstracta
    @Override
    public void Alimentarse(){
        System.out.println("Estoy comiendo pollo con arroz");
    }
}
