package com.example.sebastian.semillarosdeinvestigacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.sebastian.semillarosdeinvestigacion.datosApi.Datos;
import com.example.sebastian.semillarosdeinvestigacion.models.Adaptador;
import com.example.sebastian.semillarosdeinvestigacion.models.Semillero;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private RecyclerView view;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=(RecyclerView)findViewById(R.id.reci);
        view.setLayoutManager(new LinearLayoutManager(this));

        retrofit=new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/").addConverterFactory(GsonConverterFactory.create()).build();

        obtenerDatos();
    }

    public void obtenerDatos() {

        Datos service = retrofit.create(Datos.class);
        final Call<List<Semillero>> institucionCall = service.obtenerListaSemillero();

        institucionCall.enqueue(new Callback<List<Semillero>>() {
            @Override
            public void onResponse(Call<List<Semillero>> call, Response<List<Semillero>> response) {

                if (response.isSuccessful()) {
                    List semille = response.body();
                    for (int i = 0; i < semille.size(); i++) {
                        Semillero s = (Semillero) semille.get(i);
                        adaptador = new Adaptador(semille);
                        view.setAdapter(adaptador);
                    }
                } else {

                    Toast notificacion = Toast.makeText(MainActivity.this, "Error al cargar datos!!", Toast.LENGTH_LONG);
                    notificacion.show();
                    //Log.e(TAG,"OnResponse "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Semillero>> call, Throwable t) {

                Toast notificacion = Toast.makeText(MainActivity.this, "Error!!", Toast.LENGTH_LONG);
                notificacion.show();
            }
        });
    }
}
