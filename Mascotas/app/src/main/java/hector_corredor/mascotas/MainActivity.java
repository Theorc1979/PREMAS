package hector_corredor.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascota;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

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

        mascota.add(new Mascota(R.drawable.gato, "Gato", "5"));
        mascota.add(new Mascota(R.drawable.llama, "Llama", "8"));
        mascota.add(new Mascota(R.drawable.lobo, "Lobo", "4"));
        mascota.add(new Mascota(R.drawable.oveja, "Oveja", "7"));
        mascota.add(new Mascota(R.drawable.pollo, "Pollo", "6"));
        mascota.add(new Mascota(R.drawable.tigre, "Tigre", "1"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

        //getMenuInflater().inflate(R.menu.main, menu);
        //return true;
    }


    public void irDetalleMascota1(){
        Intent intent = new Intent(this, DetalleMascota.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_Detalle:
                irDetalleMascota1();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
