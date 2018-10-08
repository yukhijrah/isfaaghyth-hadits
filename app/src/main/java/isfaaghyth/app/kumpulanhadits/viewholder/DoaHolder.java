package isfaaghyth.app.kumpulanhadits.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import isfaaghyth.app.kumpulanhadits.R;


/**
 * Created by isfaaghyth on 10/8/18.
 * github: @isfaaghyth
 */

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);
    }

}
