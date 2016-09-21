package mx.edu.utng.prototype1;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Auto implements Clonable {
    private String modelo;
    private  String color;
    private  String tipo;

    public Auto(){
        this.modelo = "";
        this.tipo = "";
        this.color = "";
    }
    public Auto(String modelo, String tipo, String color){
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
    }
    public Clonable clonable(){
        Auto clo = new Auto();
        clo.setModelo(modelo);
        clo.setTipo(tipo);
        clo.setColor(color);
        return clo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo(){
        return  tipo;
    }
    public  void  setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
