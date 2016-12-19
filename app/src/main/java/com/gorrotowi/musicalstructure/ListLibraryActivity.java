package com.gorrotowi.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListLibraryActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;

    String[] dummySongsList = {
            "Tropical London\nRancid",
            "Death\nWhite Lies",
            "36 Degrees\nPlacebo",
            "Hey\nPixies",
            "Should I stay or should I go\nThe clash",
            "Ella uso mi cabeza como un revolver\nSoda Stereo",
            "Cocktails\nRancid",
            "Goodbye weekend\nMac Demarco",
            "Something about us\nDaft Punk"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_library);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.lvPlaylist);

        toolbar.setTitle("Library");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.close);
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getSongsList());
        listView.setAdapter(adapter);

    }

    private String[] getSongsList() {
        return dummySongsList;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_down);
    }
}
