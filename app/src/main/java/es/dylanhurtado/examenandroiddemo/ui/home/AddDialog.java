package es.dylanhurtado.examenandroiddemo.ui.home;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import es.dylanhurtado.examenandroiddemo.R;

public class AddDialog extends DialogFragment {
    private View dialogView;
    //Atributos
    private Button buttonPhoto,buttonAdd;
    private EditText nameET,duracionET,ingredientesET,elaboracionET;
    private ImageView imageView;
    private RadioGroup radioGroup;
    private RadioButton easy,medium,hard;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_add, null);
        buttonPhoto= dialogView.findViewById(R.id.fotoButton);
        buttonAdd= dialogView.findViewById(R.id.buttonAdd);
        nameET=dialogView.findViewById(R.id.nameET);
        duracionET=dialogView.findViewById(R.id.tiempoET);
        ingredientesET=dialogView.findViewById(R.id.ingredientesET);
        elaboracionET=dialogView.findViewById(R.id.elaboracionET);
        imageView=dialogView.findViewById(R.id.imageView2);
        radioGroup=dialogView.findViewById(R.id.radioGroup);
        easy=dialogView.findViewById(R.id.rb1);
        medium=dialogView.findViewById(R.id.rb2);
        hard=dialogView.findViewById(R.id.rb3);

        builder.setView(dialogView);
        return builder.show();
    }
}
