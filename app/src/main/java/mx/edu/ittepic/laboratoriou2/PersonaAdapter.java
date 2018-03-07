package mx.edu.ittepic.laboratoriou2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by OEM on 05/03/2018.
 */

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder>{
    List<Usuario> personas;

    public PersonaAdapter(List<Usuario> personas){
        this.personas = personas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.persona,parent,false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonaAdapter.ViewHolder holder, int position) {
        holder.txtClave.setText(personas.get(position).getClave());
        holder.txtNombre.setText(personas.get(position).getNombre());
        holder.txtSalario.setText(""+personas.get(position).getSueldo());
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtClave, txtNombre, txtSalario;

        public ViewHolder(View itemView) {
            super(itemView);
            txtClave = itemView.findViewById(R.id.txtClave);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtSalario = itemView.findViewById(R.id.txtSalario);
        }
    }
}
