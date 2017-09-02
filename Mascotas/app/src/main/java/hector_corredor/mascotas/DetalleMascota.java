package hector_corredor.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {

    ArrayList<Mascota> mascota;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasDet);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicialiozarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascota);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicialiozarListaMascotas (){

        mascota = new ArrayList<Mascota>();

        mascota.add(new Mascota(R.drawable.llama, "Llama", "8"));
        mascota.add(new Mascota(R.drawable.oveja, "Oveja", "7"));
        mascota.add(new Mascota(R.drawable.pollo, "Pollo", "6"));
        mascota.add(new Mascota(R.drawable.gato, "Gato", "5"));
        mascota.add(new Mascota(R.drawable.lobo, "Lobo", "4"));

    }

}
