package com.gorrotowi.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.gorrotowi.musicalstructure.adapters.AdapterArtist;
import com.gorrotowi.musicalstructure.items.ItemArtist;

import java.util.ArrayList;
import java.util.List;

public class ListArtistActivity extends AppCompatActivity {

    RecyclerView rcArtists;
    AdapterArtist adapterArtist;
    List<ItemArtist> artists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_artist);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcArtists = (RecyclerView) findViewById(R.id.rcArtists);

        toolbar.setTitle(R.string.artists);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rcArtists.setLayoutManager(new GridLayoutManager(this, 2));
        rcArtists.setHasFixedSize(true);

        adapterArtist = new AdapterArtist(this, getDummyArtistList());
        rcArtists.setAdapter(adapterArtist);

    }

    private List<ItemArtist> getDummyArtistList() {
        artists = new ArrayList<>();
        artists.add(new ItemArtist(R.drawable.placebotop, "Placebo"));
        artists.add(new ItemArtist(R.drawable.rancid, "Rancid"));
        artists.add(new ItemArtist(R.drawable.system_of_a_down, "System Of A Down"));
        artists.add(new ItemArtist(R.drawable.white_lies, "White Lies"));
        artists.add(new ItemArtist(R.drawable.pixies, "Pixies"));
        artists.add(new ItemArtist(R.drawable.soda_stereo, "Soda Stereo"));
        artists.add(new ItemArtist(R.drawable.the_clash, "The Clash"));
        artists.add(new ItemArtist(R.drawable.daft_punk, "Daft Punk"));
        return artists;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
