package com.example.stayweeb.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.stayweeb.Anime.DataItem;
import com.example.stayweeb.Anime.GenresItem;
import com.example.stayweeb.DetailAnimeActivity;
import com.example.stayweeb.R;


import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder>{

    Context context;
    private List<DataItem> anime;


    public AnimeAdapter(Context context, List<DataItem> anime) {
        this.context = context;
        this.anime = anime;
    }



    public void setAnime(List<DataItem> Anime){
        this.anime = Anime;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context)
                        .load(anime.get(position).getImages().getJpg().getLargeImageUrl())
                                .apply(new RequestOptions().override(133,122))
                                        .into(holder.poster);

        holder.title.setText(anime.get(position).getTitle());

        holder.itemview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(context, DetailAnimeActivity.class);
                Bundle mBundle = new Bundle();
                mBundle.putInt("mal_id",anime.get(position).getMalId());
                mBundle.putString("title",anime.get(position).getTitle());
                if(anime.get(position).getTitleEnglish() != null) {
                    mBundle.putString("alternate", anime.get(position).getTitleEnglish().toString());
                }else {
                    mBundle.putString("alternate", null);
                }
                mBundle.putString("url",anime.get(position).getUrl());
                mBundle.putString("images",anime.get(position).getImages().getJpg().getLargeImageUrl());
                mBundle.putString("embed_url",anime.get(position).getTrailer().getEmbedUrl());
                if(anime.get(position).getScore() != null) {
                    mBundle.putString("score", anime.get(position).getScore().toString());
                }else
                    mBundle.putString("score", "?");
                mBundle.putInt("reviewers",anime.get(position).getScoredBy());
                if(anime.get(position).getRank() != 0) {
                    mBundle.putInt("ranked", anime.get(position).getRank());
                }else{
                    mBundle.putInt("ranked", 0);
                }
                mBundle.putInt("popularity",anime.get(position).getPopularity());
                mBundle.putString("type",anime.get(position).getType());
                mBundle.putString("season",anime.get(position).getSeason());
                mBundle.putInt("year",anime.get(position).getYear());
                mBundle.putString("status",anime.get(position).getStatus());
                mBundle.putString("rating",anime.get(position).getRating());

                String genre = "Genres: ";
                for (int i=0;i<anime.get(position).getGenres().size();i++){
                    genre = genre + anime.get(position).getGenres().get(i).getName()+", ";
                };

                mBundle.putString("genres", genre);




                mBundle.putString("synopsis",anime.get(position).getSynopsis());
                intent.putExtras(mBundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return anime.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView poster;
        TextView title;

        View itemview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.posters);
            title = itemView.findViewById(R.id.titles);

            this.itemview=itemView;
        }
    }


}
