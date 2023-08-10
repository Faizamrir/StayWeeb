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
import com.example.stayweeb.DetailAnimeActivity;
import com.example.stayweeb.R;

import java.util.List;

public class RankingAdapter extends RecyclerView.Adapter<RankingAdapter.ViewHolder> {

    private Context context;

    private List<DataItem> rank;

    public RankingAdapter(Context context, List<DataItem> rank) {
        this.context = context;
        this.rank = rank;
    }

    public void setRank(List<DataItem> Rank){
        this.rank = Rank;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rank_item,parent,false);
        return new RankingAdapter.ViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull RankingAdapter.ViewHolder holder, int position) {
        Glide.with(context)
                .load(rank.get(position).getImages().getJpg().getLargeImageUrl())
                .apply(new RequestOptions().override(133,122))
                .into(holder.poster_rank);

        holder.title_rank.setText(rank.get(position).getTitle());
        holder.rank.setText("#"+rank.get(position).getRank());

        holder.itemview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(context, DetailAnimeActivity.class);
                Bundle mBundle = new Bundle();
                mBundle.putInt("mal_id",rank.get(position).getMalId());
                mBundle.putString("title",rank.get(position).getTitle());
                if(rank.get(position).getTitleEnglish() != null) {
                    mBundle.putString("alternate", rank.get(position).getTitleEnglish().toString());
                }else {
                    mBundle.putString("alternate", null);
                }
                mBundle.putString("url",rank.get(position).getUrl());
                mBundle.putString("images",rank.get(position).getImages().getJpg().getLargeImageUrl());
                mBundle.putString("embed_url",rank.get(position).getTrailer().getEmbedUrl());
                if(rank.get(position).getScore() != null) {
                    mBundle.putString("score", rank.get(position).getScore().toString());
                }else
                    mBundle.putString("score", "?");
                mBundle.putInt("reviewers",rank.get(position).getScoredBy());
                if(rank.get(position).getRank() != 0) {
                    mBundle.putInt("ranked", rank.get(position).getRank());
                }else{
                    mBundle.putInt("ranked", 0);
                }
                mBundle.putInt("popularity",rank.get(position).getPopularity());
                mBundle.putString("type",rank.get(position).getType());
                mBundle.putString("season",rank.get(position).getSeason());
                mBundle.putInt("year",rank.get(position).getYear());
                mBundle.putString("status",rank.get(position).getStatus());
                mBundle.putString("rating",rank.get(position).getRating());

                String genre = "Genres: ";
                for (int i=0;i<rank.get(position).getGenres().size();i++){
                    genre = genre + rank.get(position).getGenres().get(i).getName()+", ";
                };

                mBundle.putString("genres", genre);




                mBundle.putString("synopsis",rank.get(position).getSynopsis());
                intent.putExtras(mBundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return rank.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView poster_rank;

        TextView title_rank;

        TextView rank;
        View itemview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            poster_rank = itemView.findViewById(R.id.poster_rank);
            title_rank = itemView.findViewById(R.id.title_rank);
            rank = itemView.findViewById(R.id.rank);

            this.itemview = itemView;
        }
    }
}
