package holamundo2.blanchardspace.com.appholamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    EditText txtNombre;
    Button btnEnviar;
    TextView lblEtiqueta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        lblEtiqueta = (TextView) findViewById(R.id.lblEtiqueta);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String Nombre = "";
                Nombre = txtNombre.getText().toString() ;

                lblEtiqueta.setText("Hola " + Nombre);
                Toast.makeText(Principal.this, "Hola " + Nombre, Toast.LENGTH_LONG).show();

            }
        });


    }
}
