package com.bpsi.cjnnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//import com.bpsi.cjnnetwork.databinding.ActivityTvdashboardBinding;
import com.bpsi.cjnnetwork.model.ApiResponse;
import com.bpsi.cjnnetwork.model.Display;
//import com.bpsi.cjnnetwork.model.ResponseMessage;
import com.bpsi.cjnnetwork.model.ResponseMessage;
import com.bpsi.cjnnetwork.model.Videomodel;
import com.bpsi.cjnnetwork.network.ApiClient;
import com.bpsi.cjnnetwork.network.ApiService;
import com.bpsi.cjnnetwork.network.AuthenticationApi;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
//import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class tvdashboard extends AppCompatActivity {
    private SimpleExoPlayer player;
    private PlayerView playerView;
    String videourl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvdashboard);

        playerView = findViewById(R.id.exoplaytv);
        player = new SimpleExoPlayer.Builder(tvdashboard.this).build();
        playerView.setPlayer(player);
        playerView.setUseController(false);

        // Call method to get video URL
        getvideourl();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the player when it's no longer needed.
        if (player != null) {
            player.release();
            player = null;
        }
    }

    public void getvideourl(){
        AuthenticationApi authenticationApi = ApiClient.getClient().create(AuthenticationApi.class);
        Call<Videomodel> call = authenticationApi.getVideoUrl();
        Log.e("request_api_url", "" + call.request().url());
        call.enqueue(new Callback<Videomodel>() {
            @Override
            public void onResponse(Call<Videomodel> call, Response<Videomodel> response) {
                Log.e("TAG", "Video Response: " + new Gson().toJson(response.body()));
                if (response.isSuccessful() && response.body() != null) {
                    // Get the video URL from response
                    if(response.body().getVideoUrl() != null){
                        videourl = response.body().getVideoUrl();
                        preparePlayer();
                    }} else {
                    UIHelper.toast(tvdashboard.this,"Failed To Play Video");
                }}
            @Override
            public void onFailure(Call<Videomodel> call, Throwable t) {
                Log.d("myResponse:", "MSG" + t.toString());
                UIHelper.toast(tvdashboard.this,t.toString());
            }}); }






    private void preparePlayer() {
        if (videourl != null) {
            MediaItem mediaItem = MediaItem.fromUri(videourl);
            // Set media item to the player
            player.setMediaItem(mediaItem);
            // Prepare the player
            player.prepare();
            // Start playing
            player.setPlayWhenReady(true);
        }
    }
}
