package com.example.stayweeb;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.stayweeb.Anime.GenresItem;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.google.android.material.card.MaterialCardView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.PrivateKey;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailAnimeActivity extends AppCompatActivity {

    @BindView(R.id.detail_poster)
    ImageView poster;

    @BindView(R.id.main_title)
    TextView title;

    @BindView(R.id.alternate_title)
    TextView alternate_title;

    @BindView(R.id.score)
    TextView score;

    @BindView(R.id.members)
    TextView members;

    @BindView(R.id.ranked)
    TextView ranked;

    @BindView(R.id.popularity)
    TextView popularity;

    @BindView(R.id.types)
    TextView types;

    @BindView(R.id.rating)
    TextView rating;

    @BindView(R.id.genres)
    TextView genres;

    @BindView(R.id.synopsis)
    TextView synopsis;

    @BindView(R.id.trailer)
    WebView trailer;

    private Context context;
    private WebView webview;
    String id;
    private ImageView facebook;
    private ImageView twitter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);
        context = getApplicationContext();
        webview = findViewById(R.id.trailer);
        facebook = findViewById(R.id.fb_share);
        twitter = findViewById(R.id.twiiter_share);


        ButterKnife.bind(this);

        Bundle mBundle=getIntent().getExtras();

        String trailer = mBundle.getString("embed_url");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl(trailer);


        String images = mBundle.getString("images");
        Glide.with(context)
                .load(images)
                .apply(new RequestOptions().override(138,194))
                .into(poster);

        title.setText(mBundle.getString("title"));
        if(mBundle.getString("alternate") != null) {
            alternate_title.setText(mBundle.getString("alternate"));
        }else{
            alternate_title.setText(" ");
        }
        score.setText(mBundle.getString("score"));
        members.setText(mBundle.getInt("reviewers")+" Reviewers");
        if(mBundle.getInt("ranked") != 0 ) {
            ranked.setText("Rangked #" + mBundle.getInt("ranked"));
        }else{
            ranked.setText("Unranked" );
        }
        popularity.setText("Popularity #"+mBundle.getInt("popularity"));
        String seasion = "";
        int year = 0;
        if(mBundle.getString("season") != null){
            seasion = mBundle.getString("season");
        }else {
            seasion = "N/A";
        }
        if(mBundle.getString("year") == "0"){
            year = Integer.parseInt(" ");
        }else{
            year = mBundle.getInt("year");
        }
        types.setText(mBundle.getString("type")+" | "+seasion+" "+year+" | "+mBundle.getString("status"));
        rating.setText("Rating Audience: "+mBundle.getString("rating"));

        genres.setText(mBundle.getString("genres"));

        synopsis.setText(mBundle.getString("synopsis"));

        Activity share = this;
        String url = mBundle.getString("url");
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareDialog shareDialog = new ShareDialog(share);
                ShareLinkContent shareLinkContent = new ShareLinkContent.Builder()
                        .setContentUrl(Uri.parse(url))
                        .build();
                shareDialog.show(shareLinkContent);

            }
        });

            twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = mBundle.getString("title");
                String via = "myanimelist";
                String url = mBundle.getString("url");
                String related = "MyAnimeList.net";
                String hashtags = "anime";

                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https")
                        .authority("twitter.com")
                        .appendPath("intent")
                        .appendPath("tweet")
                        .appendQueryParameter("related", related)
                        .appendQueryParameter("via", via)
                        .appendQueryParameter("url", url)
                        .appendQueryParameter("text", text)
                        .appendQueryParameter("hashtags", hashtags);
                Uri TwitterUri = builder.build();

                Intent intent = new Intent(Intent.ACTION_VIEW, TwitterUri);
                    startActivity(intent);
                };

        });

        id=Bundle.EMPTY.getString("mal_id");
    }

}

