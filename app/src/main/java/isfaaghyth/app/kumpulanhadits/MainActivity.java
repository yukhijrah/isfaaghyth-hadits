package isfaaghyth.app.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import isfaaghyth.app.kumpulanhadits.model.Doa;

/**
 * Created by isfaaghyth on 10/1/18.
 * github: @isfaaghyth
 */

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doaCollections();
    }

    private void doaCollections() {
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
    }

}
