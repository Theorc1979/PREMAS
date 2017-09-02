package hector_corredor.mascotas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 30/08/2017.
 */

class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador (ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;

    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFotoCV.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewHolder.tvHuesosCV.setText(mascota.getHuesos());
    }

    @Override
    public int getItemCount() {//Cantidad de elementos
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoCV;
        private TextView tvNombreCV;
        private TextView tvHuesosCV;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFotoCV   = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvNombreCV  = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvHuesosCV  = (TextView) itemView.findViewById(R.id.tvHuesosCV);
        }
    }
}
