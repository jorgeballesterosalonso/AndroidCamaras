package com.pass.examenpmdmt1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioCamaras {
    @GET("datos/camaras.xml")
    Call<Camaras> getCamaras();
}
