package mx.edu.utng.state1;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Apagado   extends  Control{
    @Override
    public void CambiarEstado(Pantalla pantalla, Canvas canvas) {
        pantalla.setEstado(new Encendido());
        Paint paint = new Paint();
        paint.setARGB(50,254,30,10);
        paint.setTextAlign(Paint.Align.RIGHT);
        paint.setTextSize(60);
        canvas.drawText("Apagado", canvas.getWidth(),100,paint);
    }
}
