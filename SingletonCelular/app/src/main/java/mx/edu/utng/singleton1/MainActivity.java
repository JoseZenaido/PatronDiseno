package mx.edu.utng.singleton1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {
    private EditText edtNombre;
    private Button btnCrear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = (EditText)findViewById(R.id.edt_Nombre);
        btnCrear = (Button)findViewById(R.id.btn_Nombre);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Celular celular = Celular.getUnicoCelular();
                celular.setNombre(edtNombre.getText().toString());

                Toast.makeText(MainActivity.this, "Celular Creado: "+
                        celular.getNombre(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
