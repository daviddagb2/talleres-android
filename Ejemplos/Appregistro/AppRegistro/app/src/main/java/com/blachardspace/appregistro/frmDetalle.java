package com.blachardspace.appregistro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class frmDetalle extends AppCompatActivity {

    TextView lblApellidos, lblNombres, lblCorreo, lblTelefono, lblDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frm_detalle);

        Intent datos = getIntent();
        Bundle extras = datos.getExtras();


        lblApellidos = (TextView) findViewById(R.id.lblApellidos);
        lblNombres = (TextView) findViewById(R.id.lblNombres);
        lblCorreo = (TextView) findViewById(R.id.lblCorreo);
        lblTelefono = (TextView) findViewById(R.id.lblTelefono);
        lblDireccion = (TextView) findViewById(R.id.lblDireccion);


        lblNombres.setText("Nombres: " + extras.getString("Nombres"));
        lblApellidos.setText("Apellidos: " + extras.getString("Apellidos"));
        lblCorreo.setText("Email: " + extras.getString("Correo"));
        lblTelefono.setText("Telefono: " + extras.getString("Telefono"));
        lblDireccion.setText("Dirección: " + extras.getString("Direccion"));

        

    }
}
