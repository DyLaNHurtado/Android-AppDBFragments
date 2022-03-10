package es.dylanhurtado.examenandroiddemo.ui.home;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.dylanhurtado.examenandroiddemo.R;
import es.dylanhurtado.examenandroiddemo.model.Receta;

public class RecetasAdapter extends RecyclerView.Adapter<RecetasAdapter.ViewHolder> {

    List<Receta> datoLista;
    Context context;
    private onClickListener onClickListener;


    public RecetasAdapter(List<Receta> datoLista, Context context) {

        this.datoLista = datoLista;
        this.context = context;
    }

    public void setFilmOnClickListener(onClickListener filmOnClickListener){
        this.onClickListener=filmOnClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecetasAdapter.ViewHolder holder, int position) {
        Receta item = datoLista.get(position);
        holder.itemTV.setText(item.getName());
        holder.itemIV.setImageURI(Uri.parse(item.getImage()));
    }

    @Override
    public int getItemCount() {
        return datoLista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView itemTV;
        ImageView itemIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTV = itemView.findViewById(R.id.itemTV);
            itemIV = itemView.findViewById(R.id.itemIV);
        }
    }
}
