package com.blachardspace.appregistro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class frmRegistro extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNombre, txtApellido, txtCorreo, txtTelefono, txtDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frm_registro);


         btnEnviar = (Button) findViewById(R.id.btnEnviar);


        //Obtener los editTexts
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        txtDireccion = (EditText) findViewById(R.id.txtDireccion);


      //Al presionar el boton
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                String Nombre = "";
                String Apellido  = "";
                String Telefono = "";
                String Direccion = "";
                String Correo = "";

                Nombre = txtNombre.getText().toString();
                Apellido = txtApellido.getText().toString();
                Telefono = txtTelefono.getText().toString();
                Direccion = txtDireccion.getText().toString();
                Correo = txtCorreo.getText().toString();

                Bundle valores = new Bundle();
                valores.putString("Nombres", Nombre);
                valores.putString("Apellidos", Apellido);
                valores.putString("Telefono", Telefono);
                valores.putString("Direccion", Direccion);
                valores.putString("Correo", Correo);

                Intent FrmDetalleIntent = new Intent(frmRegistro.this, frmDetalle.class);
                FrmDetalleIntent.putExtras(valores);
                startActivity(FrmDetalleIntent);


            }
        });



    }
}
