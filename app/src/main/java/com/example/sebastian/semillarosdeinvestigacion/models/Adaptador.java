package com.example.sebastian.semillarosdeinvestigacion.models;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sebastian.semillarosdeinvestigacion.R;

import java.util.List;

/**
 * Created by sebastian on 19/10/17.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView facultad , investiga;
        private CardView card;


        public ViewHolder(View itemView) {
            super(itemView);

            facultad =(TextView)itemView.findViewById(R.id.tvFac);
            investiga =(TextView)itemView.findViewById(R.id.tvInv);
            card=(CardView)itemView.findViewById(R.id.card);
        }
    }

    public List<Semillero> lista;

    public Adaptador(List<Semillero> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.facultad.setText(lista.get(position).getFacultad());
        holder.investiga.setText(lista.get(position).getSemilleroDeInvestigacion());

        //RollIn Landing DropOut BounceIn FadeIn FlipInX RotateIn SlideInLeft ZoomIn
        //YoYo.with(Techniques.ZoomIn).playOn(holder.card);

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
