package mx.edu.utng.state1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Apagado estadoInicial;
    private Pantalla pantalla;

    private LinearLayout layPrincipal;
    private ImageButton btnOpen;
    private Lienzo lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnOpen = (ImageButton)findViewById(R.id.btn_ope);
        estadoInicial = new Apagado();
        pantalla = new Pantalla(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, pantalla);
        layPrincipal.addView(lienzo);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzo.setEstado(pantalla.getEstado());
                pantalla.presionarBoton();
                lienzo.invalidate();
            }
        });

    }
}
