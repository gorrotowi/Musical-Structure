package com.gorrotowi.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListLibraryActivity extends AppCompatActivity {

    private static final String TAG = ListLibraryActivity.class.getSimpleName();

    ListView listView;
    Button btnLibraryArtists;
    Button btnLibraryAlbums;
    Button btnLibrarySongs;

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
        btnLibraryArtists = (Button) findViewById(R.id.btnLibraryArtists);
        btnLibraryAlbums = (Button) findViewById(R.id.btnLibraryAlbums);
        btnLibrarySongs = (Button) findViewById(R.id.btnLibrarySongs);

        toolbar.setTitle("Library");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.close);
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getSongsList());
        listView.setAdapter(adapter);

        btnLibraryArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListLibraryActivity.this, ListArtistActivity.class));
            }
        });

        btnLibraryAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListLibraryActivity.this, ListAlbumActivity.class));
            }
        });

        btnLibrarySongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListLibraryActivity.this, ListSongActivity.class));
            }
        });

    }

    private String[] getSongsList() {
        return dummySongsList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_library, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.menuSearch:
                Log.i(TAG, "onOptionsItemSelected: Go to SearchView");
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
