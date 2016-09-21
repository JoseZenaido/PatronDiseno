package mx.edu.utng.prototype2;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Calendario implements Clonable {


    private String nombre;
    private String tamanio;
    private String año;

    public Calendario(){
        this.nombre = "";
        this.tamanio = "";
        this.año = "";
    }

    public Calendario(String nombre, String tamanio, String año) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.año = año;
    }

    @Override
    public Clonable clonar() {
        Calendario clon = new Calendario(nombre, tamanio, año);
        return clon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

}
