package com.pass.examenpmdmt1;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class AccesoDatos {

    static Camaras camaras = null;

    public static Camaras pedirDatosXML(Actualizacion a) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.mc30.es/components/com_hotspots/")
                .addConverterFactory(SimpleXmlConverterFactory.create()).build();

        ServicioCamaras service = retrofit.create(ServicioCamaras.class);

        Call<Camaras> llamada = service.getCamaras();
        llamada.enqueue(new Callback<Camaras>() {
            @Override
            public void onResponse(Call<Camaras> call, Response<Camaras> response) {
                camaras = response.body();
                a.recuperarDatos(camaras);
            }

            @Override
            public void onFailure(Call<Camaras> call, Throwable t) {
                Log.d("Mensaje",t.getLocalizedMessage());
            }
        });
        return camaras;
    }
}
