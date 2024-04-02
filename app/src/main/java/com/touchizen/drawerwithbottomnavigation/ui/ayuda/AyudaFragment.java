package com.touchizen.drawerwithbottomnavigation.ui.ayuda;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.touchizen.drawerwithbottomnavigation.R;
import com.touchizen.drawerwithbottomnavigation.ui.notificaciones.ListViewAdapterNotificaciones;
//Cambio de Fragments

//
public class AyudaFragment extends Fragment   {


    ListViewAdapterAyuda adapter;

    String[] fechaHora = new String[]{
            "Linea de Ayuda",
            "Correo de Contacto y Sugerencias",
            "Asistente de Negocio   IA"

    };

    String[] titulo = new String[]{
            "¿Tu pago no paso y no sabes por que ? Contactanos",
            "En este Correo nos puedes mandar las Sugerencias que tengas",
            "Este assistente te ayudara con generacion de reportes y con solucion de problematicas comunes",


    };

    String[] mensaje = new String[]{
            "7352760364",
            "tecnoplacita@gmail.com",
            "PEPE-BOT"

    };

    int[] imagenes = {
            R.drawable.baseline_attach_money_24,
            R.drawable.baseline_attach_money_24

    };


    @SuppressLint("ResourceType")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_ayuda, container, false);
        final ListView lista = (ListView) root.findViewById(R.id.listView1);
        adapter = new ListViewAdapterAyuda(this, fechaHora,titulo, mensaje,imagenes,inflater);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "presiono " + i, Toast.LENGTH_SHORT).show();
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "presiono LARGO " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        return root;
    }





}