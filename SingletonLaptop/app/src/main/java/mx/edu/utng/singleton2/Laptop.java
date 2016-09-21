package mx.edu.utng.singleton2;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Laptop {
    private String nombre;
    private static Laptop unicaLaptop;


    private Laptop(){
        this.nombre="";
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    public static Laptop getUnicaInstancia() {
        if(unicaLaptop==null){
            unicaLaptop = new Laptop();
        }
        return unicaLaptop;
    }


}
