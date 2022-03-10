package es.dylanhurtado.examenandroiddemo.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import es.dylanhurtado.examenandroiddemo.R;
import es.dylanhurtado.examenandroiddemo.model.Receta;

public class ListRecetasFragment extends Fragment implements onClickListener {

    private List<Receta> datoList;
    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        datoList = new ArrayList<>();

        super.onCreate(savedInstanceState);

    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listrecetas, container, false);
        recyclerView= view.findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecetasAdapter adapter = new RecetasAdapter(datoList,getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setFilmOnClickListener(this);
        return view;
    }


    @Override
    public void onclick(int position) {

        Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
    }
}