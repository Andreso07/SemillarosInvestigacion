package com.example.sebastian.semillarosdeinvestigacion.datosApi;

import com.example.sebastian.semillarosdeinvestigacion.models.Semillero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sebastian on 19/10/17.
 */

public interface Datos {
    @GET("xmcd-xh4d.json")
    Call<List<Semillero>> obtenerListaSemillero();
}
