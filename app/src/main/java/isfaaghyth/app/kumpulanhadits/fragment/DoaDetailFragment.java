package isfaaghyth.app.kumpulanhadits.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import isfaaghyth.app.kumpulanhadits.DetailActivity;
import isfaaghyth.app.kumpulanhadits.R;

/**
 * Created by isfaaghyth on 10/29/18.
 * github: @isfaaghyth
 */

public class DoaDetailFragment extends Fragment {

    private TextView txtNamaDoa;
    private Button btnReadMore;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doa_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtNamaDoa = (TextView) view.findViewById(R.id.txt_nama_doa);
        btnReadMore = (Button) view.findViewById(R.id.btn_read_more);

        txtNamaDoa.setText(getArguments().getString("nama_doa"));

        onClickReadMore();
    }

    private void onClickReadMore() {
        btnReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaDoa = getArguments().getString("nama_doa");
                String surahDoa = getArguments().getString("surah_doa");
                String artiDoa = getArguments().getString("arti_doa");

                Intent detailIntent = new Intent(getContext(), DetailActivity.class);
                detailIntent.putExtra("nama_doa", namaDoa);
                detailIntent.putExtra("surah_doa", surahDoa);
                detailIntent.putExtra("arti_doa", artiDoa);
                startActivity(detailIntent);
            }
        });
    }

}
