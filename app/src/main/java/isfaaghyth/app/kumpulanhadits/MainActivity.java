package isfaaghyth.app.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import isfaaghyth.app.kumpulanhadits.adapter.DoaAdapter;
import isfaaghyth.app.kumpulanhadits.adapter.DoaListener;
import isfaaghyth.app.kumpulanhadits.fragment.DoaDetailFragment;
import isfaaghyth.app.kumpulanhadits.model.Doa;

/**
 * Created by isfaaghyth on 10/1/18.
 * github: @isfaaghyth
 */

public class MainActivity extends AppCompatActivity implements DoaListener {

    private List<Doa> doas = new ArrayList<>();
    private RecyclerView lstDoa;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recyclerviewnya
        lstDoa = (RecyclerView) findViewById(R.id.lst_doa);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        lstDoa.setLayoutManager(linear);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doas);
        adapter.setListener(this);
        lstDoa.setAdapter(adapter);
    }

    private void replaceFrameDetail(Doa doa) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();

        DoaDetailFragment doaFragment = new DoaDetailFragment();

        Bundle kirimDoaBundle = new Bundle();
        kirimDoaBundle.putString("nama_doa", doa.getNama());
        kirimDoaBundle.putString("surah_doa", doa.getSurah());
        kirimDoaBundle.putString("arti_doa", doa.getArti());

        doaFragment.setArguments(kirimDoaBundle);

        ft.replace(R.id.frm_detail, doaFragment);
        ft.commit();
    }

    private void doaCollections() {
        doas.add(new Doa("Doa Belajar",
                "doa-belajar",
                "surah-doa-belajar"));

        doas.add(new Doa("Doa Masuk Masjid",
                "doa-Masuk-Masjid",
                "surah-doa-Masuk-Masjid"));

    }

    @Override
    public void onDoaClick(Doa doa) {
        replaceFrameDetail(doa);
    }

}
