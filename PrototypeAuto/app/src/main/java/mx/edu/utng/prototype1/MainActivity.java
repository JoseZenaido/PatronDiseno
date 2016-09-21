package mx.edu.utng.prototype1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtModelo;
    private EditText edtTipo;
    private  EditText edtColor;

    private Button btnClonar;

    private GridView grvAuto;
    private ArrayList<Auto>autos;
    private Auto auto;
    private AutoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtModelo = (EditText)findViewById(R.id.edt_modelo);
        edtTipo = (EditText)findViewById(R.id.edt_tipo);
        edtColor = (EditText)findViewById(R.id.edt_color);

        btnClonar = (Button)findViewById(R.id.btn_clonar);

        grvAuto = (GridView)findViewById(R.id.grv_auto);

        autos= new ArrayList<Auto>();
        auto = new Auto();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auto.setModelo(edtModelo.getText().toString());
                auto.setColor(edtColor.getText().toString());
                auto.setTipo(edtTipo.getText().toString());

                Auto clon = (Auto) auto.clonable();
                autos.add(clon);

                adapter = new AutoAdapter(MainActivity.this,
                        (ArrayList)autos);
                grvAuto.setAdapter(adapter);
            }
        });


    }
}
