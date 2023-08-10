package com.example.stayweeb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.stayweeb.Adapter.AnimeAdapter;
import com.example.stayweeb.Adapter.RankingAdapter;
import com.example.stayweeb.Anime.Anime;
import com.example.stayweeb.Anime.DataItem;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ranking#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ranking extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView ranklist;
    private ProgressBar progressBar;
    private Context context;
    RankingAdapter rankingAdapter;
    List<DataItem> rank = new ArrayList<>();
    public ranking() {
        // Required empty public constructor
    }


    public static ranking newInstance(String param1, String param2) {
        ranking fragment = new ranking();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ranking, container, false);
        ranklist = rootView.findViewById(R.id.rvRank);
        progressBar = rootView.findViewById(R.id.rank_progressbar);
        context=getActivity();
        rankingAdapter = new RankingAdapter(context,rank);

        API_Request ranking = Retrofit.getRetrofit().create(API_Request.class);
        Call<Anime> call = ranking.getRankdata();
        call.enqueue(new Callback<Anime>() {
            @Override
            public void onResponse(Call<Anime> call, Response<Anime> response) {
                if (response.isSuccessful() && response.body() != null) {
                    rankingAdapter.setRank(response.body().getData());
                    rankingAdapter.notifyDataSetChanged();
                    ranklist.setLayoutManager(new LinearLayoutManager(context));
                    ranklist.setAdapter(rankingAdapter);
                }
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<Anime> call, Throwable t) {

            }
        });




        return rootView;
    }
}