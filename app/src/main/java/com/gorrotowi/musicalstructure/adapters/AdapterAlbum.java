package com.gorrotowi.musicalstructure.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gorrotowi.musicalstructure.R;
import com.gorrotowi.musicalstructure.items.ItemAlbum;

import java.util.List;

/**
 * Created by Gorro on 20/12/16.
 */

public class AdapterAlbum extends RecyclerView.Adapter<AdapterAlbum.Holder> {

    private List<ItemAlbum> albumList;
    private Context ctx;

    public AdapterAlbum(Context ctx, List<ItemAlbum> albumList) {
        this.ctx = ctx;
        this.albumList = albumList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(ctx).inflate(R.layout.item_album, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.imgAlbum.setImageResource(albumList.get(position).getImgAlbum());
        holder.txtTitle.setText(albumList.get(position).getTitle());
        holder.txtAuthor.setText(albumList.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView imgAlbum;
        TextView txtTitle;
        TextView txtAuthor;

        Holder(View itemView) {
            super(itemView);

            imgAlbum = (ImageView) itemView.findViewById(R.id.imgItemAlbum);
            txtTitle = (TextView) itemView.findViewById(R.id.txtItemAlbumName);
            txtAuthor = (TextView) itemView.findViewById(R.id.txtItemAlbumArtist);

        }
    }

}
