package holamundo.blanchardspace.com.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNombre;
    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtMensaje = (TextView) findViewById(R.id.txtMensaje);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String Nombre = "";
                Nombre = txtNombre.getText().toString() ;

                txtMensaje.setText(Nombre);

            }
        });



    }
}
