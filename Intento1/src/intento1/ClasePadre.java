package intento1;

public class ClasePadre {
    private String nombre;
    private int edad;
    private String genero;
 
    public ClasePadre(String nombre, int edad, String genero){
    this.nombre = nombre; 
    this.edad = edad;
    this.genero = genero;
    }
    // metodo getter muestra el dato 
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getGenero(){
        return genero;
    }
    // metodo setter establecemos el valor a la variable
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }
}
