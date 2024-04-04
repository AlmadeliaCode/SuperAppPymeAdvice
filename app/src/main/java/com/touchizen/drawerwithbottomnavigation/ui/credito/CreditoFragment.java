package com.touchizen.drawerwithbottomnavigation.ui.credito;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.touchizen.drawerwithbottomnavigation.R;
import com.touchizen.drawerwithbottomnavigation.ui.cupones.ListViewAdapterCupones;
import com.touchizen.drawerwithbottomnavigation.ui.mercadito.ListViewAdapterMercadito;
import com.touchizen.drawerwithbottomnavigation.ui.pago.FormulariopagodeserviciosFragment;
import com.touchizen.drawerwithbottomnavigation.ui.pagoservicios.ListViewAdapterPagoServicios;

public class CreditoFragment extends Fragment  {

    ListViewAdapterCupones adapter;
    String[] titulo = new String[]{
            "Burger King",
            "Pizza Hut",
            "Bodega Ahorrera"
    };

    String[] mensaje = new String[]{
            "10 %  de Descuenta en 2 x 1",
            "Llevate una pizza familiar con 30% Descuento",
            "10% en Electrodosmesticos"

    };

    int[] imagenes = {
            R.drawable.baseline_description_24,
            R.drawable.baseline_description_24,
            R.drawable.baseline_description_24,
            R.drawable.baseline_description_24


    };


    private TextView recargaLabel=null;
    private TextView mercaditoLabel=null;
    private Button bottonRecargas=null;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_mercadito, container, false);
        //  recargaLabel= root.findViewById(R.id.id_recarga_Label);
        mercaditoLabel=root.findViewById(R.id.text_nombre);



        final ListView lista = (ListView) root.findViewById(R.id.listViewHome);

      //  adapter = new ListViewAdapterMercadito(this, titulo, mensaje,imagenes,inflater);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Fragment pagodeServicios = new FormulariopagodeserviciosFragment();
                FragmentTransaction pagoServicios = getParentFragmentManager().beginTransaction();
                pagoServicios.replace(R.id.nav_host_fragment, pagodeServicios);
                pagoServicios.addToBackStack("tarjetasderegalo");
                // Commit a la transacción
                pagoServicios.commit();
                Toast.makeText(getActivity(), "Tarjetas de regalo" + i, Toast.LENGTH_SHORT).show();
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