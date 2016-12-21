package com.gorrotowi.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.gorrotowi.musicalstructure.adapters.AdapterAlbum;
import com.gorrotowi.musicalstructure.items.ItemAlbum;

import java.util.ArrayList;
import java.util.List;

public class ArtistDetailActivity extends AppCompatActivity {

    AdapterAlbum adapterAlbum;
    RecyclerView rcAlbums;
    ImageView imgArtistDetailHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcAlbums = (RecyclerView) findViewById(R.id.rcArtistAlbums);
        imgArtistDetailHeader = (ImageView) findViewById(R.id.imgArtistDetailHeader);

        int artist = getIntent().getExtras().getInt("artist", 0);
        setArtistHeader(artist, toolbar);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        rcAlbums.setLayoutManager(new GridLayoutManager(this, 2));


        adapterAlbum = new AdapterAlbum(this, getDummyAlbumsData(artist));
        rcAlbums.setAdapter(adapterAlbum);

    }

    private void setArtistHeader(int artist, Toolbar toolbar) {
        switch (artist) {
            case 0:
                toolbar.setTitle("Placebo");
                imgArtistDetailHeader.setImageResource(R.drawable.placebotop);
                break;
            case 1:
                toolbar.setTitle("Rancid");
                imgArtistDetailHeader.setImageResource(R.drawable.rancid);
                break;
            case 2:
                toolbar.setTitle("System Of A Down");
                imgArtistDetailHeader.setImageResource(R.drawable.system_of_a_down);
                break;
            case 3:
                toolbar.setTitle("White Lies");
                imgArtistDetailHeader.setImageResource(R.drawable.white_lies);
                break;
            case 4:
                toolbar.setTitle("Pixies");
                imgArtistDetailHeader.setImageResource(R.drawable.pixies);
                break;
            case 5:
                toolbar.setTitle("Soda Stereo");
                imgArtistDetailHeader.setImageResource(R.drawable.soda_stereo);
                break;
            case 6:
                toolbar.setTitle("The Clash");
                imgArtistDetailHeader.setImageResource(R.drawable.the_clash);
                break;
            case 7:
                toolbar.setTitle("Daft Punk");
                imgArtistDetailHeader.setImageResource(R.drawable.daft_punk);
                break;
        }
    }

    private List<ItemAlbum> getDummyAlbumsData(int artist) {
        List<ItemAlbum> albumList = new ArrayList<>();
        switch (artist) {
            case 0:
                albumList.add(new ItemAlbum(R.drawable.placebo_placebo, "Placebo", "Placebo"));
                albumList.add(new ItemAlbum(R.drawable.placebo_meds, "Meds", "Placebo"));
                albumList.add(new ItemAlbum(R.drawable.placebo_with_out_you, "Without you i'm nothing", "Placebo"));
                albumList.add(new ItemAlbum(R.drawable.placebo_a_place_for_us_to_dream, "A place for us to dream", "Placebo"));
                break;
            case 1:
                albumList.add(new ItemAlbum(R.drawable.rancid_album, "Indestructable", "Rancid"));
                albumList.add(new ItemAlbum(R.drawable.rancid_and_out_come_the_wolves, "And out come the wolves", "Rancid"));
                albumList.add(new ItemAlbum(R.drawable.rancid_life_wont_wait, "Life won't wait", "Rancid"));
                albumList.add(new ItemAlbum(R.drawable.rancid_2000, "2000", "Rancid"));
                break;
            case 2:
                albumList.add(new ItemAlbum(R.drawable.soad_toxicity, "Toxicity", "System Of A Down"));
                albumList.add(new ItemAlbum(R.drawable.soad_hypnotize, "Hipnotize", "System Of A Down"));
                albumList.add(new ItemAlbum(R.drawable.soad_steal_this_album, "Steal this album", "System Of A Down"));
                albumList.add(new ItemAlbum(R.drawable.soad_mezmerize, "Mezmerize", "System Of A Down"));
                break;
            case 3:
                albumList.add(new ItemAlbum(R.drawable.white_lies_album, "To lose life", "White Lies"));
                albumList.add(new ItemAlbum(R.drawable.white_lies_big_tv, "Big TV", "White Lies"));
                albumList.add(new ItemAlbum(R.drawable.white_lies_friends, "Friends", "White Lies"));
                albumList.add(new ItemAlbum(R.drawable.white_lies_ritual, "Ritual", "White Lies"));
                break;
            case 4:
                albumList.add(new ItemAlbum(R.drawable.pixies_bossanova, "Bossanova", "Pixies"));
                albumList.add(new ItemAlbum(R.drawable.pixies_doolittle, "Doolittle", "Pixies"));
                albumList.add(new ItemAlbum(R.drawable.pixies_surfer_rosa, "Surfer rosa", "Pixies"));
                break;
            case 5:
                albumList.add(new ItemAlbum(R.drawable.sodastereo_me_veras_volver, "Me veras volver", "Soda Stereo"));
                albumList.add(new ItemAlbum(R.drawable.sodastereo_cancion_animal, "Cancion animal", "Soda Stereo"));
                albumList.add(new ItemAlbum(R.drawable.sodastereo_sodastereo, "Soda Stereo", "Soda Stereo"));
                break;
            case 6:
                albumList.add(new ItemAlbum(R.drawable.theclash_london_calling, "Longon Calling", "The clash"));
                albumList.add(new ItemAlbum(R.drawable.theclash_combat_rock, "Combat rock", "The clash"));
                albumList.add(new ItemAlbum(R.drawable.thclash_sandinista, "Sandinista", "The clash"));
                break;
            case 7:
                albumList.add(new ItemAlbum(R.drawable.daftpunk_ram, "Random Access Memories", "Daft Punk"));
                albumList.add(new ItemAlbum(R.drawable.daftpunk_homework, "Homework", "Daft Punk"));
                albumList.add(new ItemAlbum(R.drawable.daftpunk_daft_club, "Daft Club", "Daft Punk"));
                albumList.add(new ItemAlbum(R.drawable.daftpunk_human_after_all, "Human after all", "Daft Punk"));
                break;
            default:
                albumList.add(new ItemAlbum(R.drawable.placebo_placebo, "Placebo", "Placebo"));
                albumList.add(new ItemAlbum(R.drawable.placebo_meds, "Meds", "Placebo"));
                albumList.add(new ItemAlbum(R.drawable.placebo_with_out_you, "Without you i'm nothing", "Placebo"));
                albumList.add(new ItemAlbum(R.drawable.placebo_a_place_for_us_to_dream, "A place for us to dream", "Placebo"));
                break;
        }
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
