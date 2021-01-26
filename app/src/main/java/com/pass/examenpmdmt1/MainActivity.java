package com.pass.examenpmdmt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements Actualizacion {

    private Button btnPedir = null;
    private Camaras camaras = null;
    MainActivity contexto = this;
    WebView wv = null;
    ProgressBar pb = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = findViewById(R.id.webView);
        pb = findViewById(R.id.progressBar);
        pb.setVisibility(View.INVISIBLE);

        btnPedir = findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccesoDatos.pedirDatosXML(contexto);

                pb.setVisibility(View.VISIBLE);


            }
        });
    }

    @Override
    public void recuperarDatos(Camaras c) {
        camaras = c;
        Log.d("Mensaje",c.toString());
        wv.loadData(EntradaSalida.pintarHTML(camaras),"text/html","UTF-8");
        pb.setVisibility(View.INVISIBLE);
    }
}