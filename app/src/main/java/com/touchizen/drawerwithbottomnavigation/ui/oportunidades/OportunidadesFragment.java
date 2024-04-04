package com.touchizen.drawerwithbottomnavigation.ui.oportunidades;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.touchizen.drawerwithbottomnavigation.R;
import com.touchizen.drawerwithbottomnavigation.ui.bitcoin.BitcoinFragment;
import com.touchizen.drawerwithbottomnavigation.ui.credito.CreditoFragment;
import com.touchizen.drawerwithbottomnavigation.ui.cupones.CuponesFragment;
import com.touchizen.drawerwithbottomnavigation.ui.mercadito.MercaditoFragment;
import com.touchizen.drawerwithbottomnavigation.ui.pagoservicios.PagoServiciosFragment;
import com.touchizen.drawerwithbottomnavigation.ui.recargas.RecargasFragment;
import com.touchizen.drawerwithbottomnavigation.ui.tarjetaderegalo.TarjetasRegaloFragment;


public class OportunidadesFragment extends Fragment {



    ListViewAdapterOportunidades adapter;
    String[] titulo = new String[]{
            "Pago de Servicios",
            "Mercadito",
            "Generacion de Estado Financiero (Salud Empresarial)",
    };

    String[] mensaje = new String[]{

            "recargas ,luz ,amazon ,microsoft y muchos mas.",
            "vende y compra productos online con los usuarios registrados en Pyme-Advice ",
            "Generacion de estado  financiero de la  Pyme (para solicitud  de creditos)"

    };

    int[] imagenes = {

            R.drawable.baseline_location_city_24,
            R.drawable.baseline_local_grocery_store_24,
            R.drawable.baseline_local_grocery_store_24


    };


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_oportunidades, container, false);
        final ListView lista = (ListView) root.findViewById(R.id.listView1);
        adapter = new ListViewAdapterOportunidades(this, titulo, mensaje,imagenes,inflater);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {



                switch(i){
                    case 0:

                      //  Fragment Credito = new CreditoFragment();
                       // FragmentTransaction creditoRegalo = getParentFragmentManager().beginTransaction();
                        //creditoRegalo.replace(R.id.nav_host_fragment, Credito);
                        //creditoRegalo.addToBackStack("regalo");
                        //creditoRegalo.commit();
                        //Toast.makeText(getActivity(), "Credito Regalo" , Toast.LENGTH_SHORT).show();

                      //  Fragment RecargasFragment = new RecargasFragment();
                       // FragmentTransaction transicion = getParentFragmentManager().beginTransaction();
                        //transicion.replace(R.id.nav_host_fragment, RecargasFragment);
                         //transicion.addToBackStack("recarga");

                         //transicion.commit();
                          //Toast.makeText(getActivity(), "Recargas" + i, Toast.LENGTH_SHORT).show();

                        Fragment PagoServiciosFragment = new PagoServiciosFragment();
                        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                        transaction.replace(R.id.nav_host_fragment, PagoServiciosFragment);
                        transaction.addToBackStack("pago");
                        transaction.commit();
                        Toast.makeText(getActivity(), "Pagos de Servicios" + i, Toast.LENGTH_SHORT).show();


                        break;

                    case 1:
                      //  Fragment Credito = new CreditoFragment();
                       // FragmentTransaction creditoRegalo = getParentFragmentManager().beginTransaction();
                       // creditoRegalo.replace(R.id.nav_host_fragment, Credito);
                       // creditoRegalo.addToBackStack("regalo");
                       // creditoRegalo.commit();
                        //Toast.makeText(getActivity(), "Credito Regalo" , Toast.LENGTH_SHORT).show();

                        Fragment mercaditoFragmento = new MercaditoFragment();
                        FragmentTransaction mercadito = getParentFragmentManager().beginTransaction();
                        mercadito.replace(R.id.nav_host_fragment, mercaditoFragmento);
                        mercadito.addToBackStack("Mercadito de Emprendedores");
                        mercadito.commit();
                        Toast.makeText(getActivity(), "Mercadito de Emprendedores" + i, Toast.LENGTH_SHORT).show();

                        break;

                    case 2:
                        //Fragment RecargasFragment = new RecargasFragment();
                        //FragmentTransaction transicion = getParentFragmentManager().beginTransaction();
                        //transicion.replace(R.id.nav_host_fragment, RecargasFragment);
                       // transicion.addToBackStack("recarga");
                        // Commit a la transacción
                       // transicion.commit();
                      //  Toast.makeText(getActivity(), "Recargas" + i, Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity(), "DESCARGANDO EXCEL" + i, Toast.LENGTH_LONG).show();

                      //  Fragment PagoServiciossFragment = new PagoServiciosFragment();
                       // FragmentTransaction transactionn = getParentFragmentManager().beginTransaction();
                       // transactionn.replace(R.id.nav_host_fragment, PagoServiciossFragment);
                       // transactionn.addToBackStack("pago");
                       // transactionn.commit();
                       // Toast.makeText(getActivity(), "Pagos de Servicios" + i, Toast.LENGTH_SHORT).show();

                        break;

                    case 3:
                        Fragment TarjetasdeRegalo = new TarjetasRegaloFragment();
                        FragmentTransaction transaccionregalo = getParentFragmentManager().beginTransaction();
                        transaccionregalo.replace(R.id.nav_host_fragment, TarjetasdeRegalo);
                        transaccionregalo.addToBackStack("regalo");
                        transaccionregalo.commit();
                        Toast.makeText(getActivity(), "Tarjetas de Regalo" , Toast.LENGTH_SHORT).show();

                        break;
                    case 4:
                        Fragment Bitcoin = new BitcoinFragment();
                        FragmentTransaction bitcoinFragment = getParentFragmentManager().beginTransaction();
                        bitcoinFragment.replace(R.id.nav_host_fragment, Bitcoin);
                        bitcoinFragment.addToBackStack("regalo");
                        bitcoinFragment.commit();
                        Toast.makeText(getActivity(), "Credito Regalo" , Toast.LENGTH_SHORT).show();

                        break;
                    case 5:
                        Fragment nuevoFragmento = new CuponesFragment();
                        FragmentTransaction prueba = getParentFragmentManager().beginTransaction();
                        prueba.replace(R.id.nav_host_fragment, nuevoFragmento);
                        prueba.addToBackStack("cupon");
                        prueba.commit();
                        Toast.makeText(getActivity(), "Cupones de Descuento" + i, Toast.LENGTH_SHORT).show();

                        break;
                    case 6:
                     //   Fragment mercaditoFragmento = new MercaditoFragment();
                      //  FragmentTransaction mercadito = getParentFragmentManager().beginTransaction();
                      //  mercadito.replace(R.id.nav_host_fragment, mercaditoFragmento);
                      //  mercadito.addToBackStack("cupon");
                       // mercadito.commit();
                        Toast.makeText(getActivity(), "Cupones de Descuento" + i, Toast.LENGTH_SHORT).show();

                        break;
                }
                Toast.makeText(getActivity(), "presiono " + i +l, Toast.LENGTH_SHORT).show();
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