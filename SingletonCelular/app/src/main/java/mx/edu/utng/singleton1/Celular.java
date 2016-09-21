package mx.edu.utng.singleton1;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Celular {
    private String nombre;
    private static Celular unicoCelular;



    private   Celular(){
        this.nombre="";

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public static Celular getUnicoCelular() {
        if(unicoCelular==null){
            unicoCelular = new Celular();
        }
        return unicoCelular;
    }


}
