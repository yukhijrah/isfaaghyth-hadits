package isfaaghyth.app.kumpulanhadits.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import isfaaghyth.app.kumpulanhadits.R;
import isfaaghyth.app.kumpulanhadits.model.Doa;
import isfaaghyth.app.kumpulanhadits.viewholder.DoaHolder;

/**
 * Created by isfaaghyth on 10/8/18.
 * github: @isfaaghyth
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;
    private DoaListener listener;

    public DoaAdapter(List<Doa> doas) {
        this.doas = doas;
    }

    public void setListener(DoaListener listener) {
        this.listener = listener;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, parent, false));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                listener.onDoaClick(doas.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }

}
