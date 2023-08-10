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
import android.widget.Toast;

import com.example.stayweeb.Adapter.AnimeAdapter;
import com.example.stayweeb.Anime.Anime;
import com.example.stayweeb.Anime.DataItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link list_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class list_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView animelist;
    private LinearLayoutManager layoutManager;
    private Context context;

    private ProgressBar progressBar;

    AnimeAdapter animeAdapter;
    List<DataItem> anime = new ArrayList<>();
    public list_fragment() {
        // Required empty public constructor
    }


    public static list_fragment newInstance(String param1, String param2) {
        list_fragment fragment = new list_fragment();
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
        View rootView = inflater.inflate(R.layout.fragment_list_fragment, container, false);
        animelist = rootView.findViewById(R.id.rvanime);
        progressBar = rootView.findViewById(R.id.anime_progress_bar);
        context = getActivity();


        animeAdapter = new AnimeAdapter(context, anime);



        API_Request anime = Retrofit.getRetrofit().create(API_Request.class);
        Call<Anime> call = anime.getAllData();
        call.enqueue(new Callback<Anime>() {
            @Override
            public void onResponse(Call<Anime> call, Response<Anime> response) {
                if (response.isSuccessful() && response.body() != null) {
                    animeAdapter.setAnime(response.body().getData());
                    animeAdapter.notifyDataSetChanged();
                    animelist.setLayoutManager(new GridLayoutManager(context,3));
                    animelist.setAdapter(animeAdapter);
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