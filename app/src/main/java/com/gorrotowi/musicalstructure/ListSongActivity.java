package com.gorrotowi.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListSongActivity extends AppCompatActivity {

    ListView listSongs;

    ArrayAdapter<String> adapter;

    String[] dummySongsList = {
            "Tropical London\nRancid",
            "Death\nWhite Lies",
            "36 Degrees\nPlacebo",
            "Hey\nPixies",
            "Should I Stay Or Should I Go\nThe clash",
            "Ella Uso Mi Cabeza Como Un Revolver\nSoda Stereo",
            "Cocktails\nRancid",
            "Goodbye Weekend\nMac Demarco",
            "Something About Us\nDaft Punk",
            "Contrabando y Traición\nLa Lupita",
            "All I Think About Us\nPixies",
            "Cara de Pizza\nLa Cuca",
            "DARE\nGorillaz",
            "La Guitarra\nLos Auténticos Decadentes",
            "Rivers and Roads\nThe Head and the Heart"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_song);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        listSongs = (ListView) findViewById(R.id.listSongs);

        toolbar.setTitle(R.string.songs);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dummySongsList);
        listSongs.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
