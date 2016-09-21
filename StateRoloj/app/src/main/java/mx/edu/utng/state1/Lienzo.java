package mx.edu.utng.state1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Lienzo extends View {
    private  Control estado;
    private Pantalla pantalla;
    public Lienzo(Context context, Control estado, Pantalla pantalla){
        super(context);
        this.estado=estado;
        this.pantalla = pantalla;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if(estado!=null&&pantalla!=null){
            pantalla.setCanvas(canvas);
            estado.CambiarEstado(pantalla, canvas);
        }
    }
    public Control getEstado(){
        return  estado;
    }

    public void setEstado(Control estado) {
        this.estado = estado;
    }
}
