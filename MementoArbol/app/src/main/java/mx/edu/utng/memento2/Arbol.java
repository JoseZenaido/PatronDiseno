package mx.edu.utng.memento2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by ZENAIDO-PC on 14/09/2016.
 */
public class Arbol {
    private int color;

    public Arbol(){

    }

    public void dibujar(Canvas canvas, int color){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);

        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;


        //Path path = new Path();
       /* path = mitadX - mitadY;
        path.moveTo(mitad+half*0.5f, half*0.84f);
        path.lineTo(mitad+half*1.5f, half*0.84f);
        path.lineTo(mitad+half*0.68f, half*1.45f);
        path.lineTo(mitad+half*1.0f, half*0.5f);
        path.lineTo(mitad+half*1.32f, half*1.45f);
        path.lineTo(mitad+half*0.5f, half*0.84f);*/


        Path path = new Path();
        path.moveTo(mitadX, mitadY*0.5f);
        path.lineTo(mitadX * 0.5f, mitadY*1.5f);
        path.lineTo(mitadX * 1.5f, mitadY* 1.5f);
        path.lineTo(mitadX , mitadY * 0.5f);
        path.lineTo(mitadX, mitadY*2.5f);
        path.lineTo(mitadX * 1.3f, mitadY*2.5f);


        path.close();

        canvas.drawPath(path, paint);

    }

    public Memento guardarMemento() {

        return new Memento(color);

    }
    public void restaurarMemento(Memento m) {
        color = m.getColor();
    }

    public void setColor(int color) {

        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
