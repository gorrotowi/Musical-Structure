package com.gorrotowi.musicalstructure.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gorrotowi.musicalstructure.ArtistDetailActivity;
import com.gorrotowi.musicalstructure.R;
import com.gorrotowi.musicalstructure.items.ItemArtist;

import java.util.List;

/**
 * Created by Gorro on 20/12/16.
 */

public class AdapterArtist extends RecyclerView.Adapter<AdapterArtist.Holder> {

    private Context ctx;
    private List<ItemArtist> artists;

    public AdapterArtist(Context ctx, List<ItemArtist> artists) {
        this.ctx = ctx;
        this.artists = artists;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(ctx).inflate(R.layout.item_artist, parent, false));
    }

    @Override
    public void onBindViewHolder(final Holder holder, final int position) {
        holder.imgArtist.setImageResource(artists.get(position).getImg());
        holder.txtArtist.setText(artists.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, ArtistDetailActivity.class);
                intent.putExtra("artist", position);

                String transitionname = ctx.getString(R.string.transitionImgArtist);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) ctx, holder.imgArtist, transitionname);
                ActivityCompat.startActivity(ctx, intent, optionsCompat.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        ImageView imgArtist;
        TextView txtArtist;

        public Holder(View itemView) {
            super(itemView);
            imgArtist = (ImageView) itemView.findViewById(R.id.imgItemArtist);
            txtArtist = (TextView) itemView.findViewById(R.id.txtItemArtist);
        }
    }

}
