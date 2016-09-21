package mx.edu.utng.state1;

import android.graphics.Canvas;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Pantalla {
    private Control estado;
    private Canvas canvas;

    public Pantalla(Control estado){
        this.estado = estado;
    }

    public void presionarBoton(){
        estado.CambiarEstado
                (this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Control getEstado() {
        return estado;
    }

    public void setEstado(Control estado) {
        this.estado = estado;
    }

}//END CLASS
