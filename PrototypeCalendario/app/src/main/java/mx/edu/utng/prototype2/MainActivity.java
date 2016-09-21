package mx.edu.utng.prototype2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtTamanio;
    private EditText edtAño;
    private Button btnClonar;
    private GridView grvCalendario;
    private ArrayList<Calendario> calendarios;
    private Calendario calendario;
    private CalendarioAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = (EditText) findViewById(R.id.edt_nombre);
        edtTamanio = (EditText) findViewById(R.id.edt_tamanio);
        edtAño = (EditText) findViewById(R.id.edt_Año);

        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvCalendario = (GridView)findViewById(R.id.grv_cale);
        calendarios = new ArrayList<Calendario>();
        calendario = new Calendario();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendario.setNombre(edtNombre.getText().toString());
                calendario.setAño(edtTamanio.getText().toString());
                calendario.setAño(edtAño.getText().toString());

                Calendario clon = (Calendario)calendario.clonar();

                calendarios.add(clon);

                adapter = new CalendarioAdapter(
                        MainActivity.this, calendarios);
                grvCalendario.setAdapter(adapter);
            }
        });

    }
}
