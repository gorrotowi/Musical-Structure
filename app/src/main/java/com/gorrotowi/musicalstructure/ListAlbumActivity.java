package com.gorrotowi.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.gorrotowi.musicalstructure.adapters.AdapterAlbum;
import com.gorrotowi.musicalstructure.items.ItemAlbum;

import java.util.ArrayList;
import java.util.List;

public class ListAlbumActivity extends AppCompatActivity {

    AdapterAlbum adapterAlbum;
    RecyclerView rcAlbums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_album);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcAlbums = (RecyclerView) findViewById(R.id.rcAlbums);

        toolbar.setTitle(R.string.albums);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rcAlbums.setLayoutManager(new GridLayoutManager(this, 2));

        adapterAlbum = new AdapterAlbum(this, getDummyAlbums());
        rcAlbums.setAdapter(adapterAlbum);

    }

    private List<ItemAlbum> getDummyAlbums() {
        List<ItemAlbum> albumList = new ArrayList<>();
        albumList.add(new ItemAlbum(R.drawable.white_lies_album, "To lose life", "White Lies"));
        albumList.add(new ItemAlbum(R.drawable.pixies_surfer_rosa, "Surfer rosa", "Pixies"));
        albumList.add(new ItemAlbum(R.drawable.theclash_london_calling, "Longon Calling", "The clash"));
        albumList.add(new ItemAlbum(R.drawable.placebo_a_place_for_us_to_dream, "A place for us to dream", "Placebo"));
        albumList.add(new ItemAlbum(R.drawable.rancid_life_wont_wait, "Life won't wait", "Rancid"));
        albumList.add(new ItemAlbum(R.drawable.soad_hypnotize, "Hipnotize", "System Of A Down"));
        albumList.add(new ItemAlbum(R.drawable.sodastereo_me_veras_volver, "Me veras volver", "Soda Stereo"));
        albumList.add(new ItemAlbum(R.drawable.daftpunk_ram, "Random Access Memories", "Daft Punk"));
        return albumList;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
