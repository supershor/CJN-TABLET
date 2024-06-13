package com.bpsi.cjnnetwork;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.bpsi.cjnnetwork.model.Videomodel;
import com.bpsi.cjnnetwork.network.ApiClient;
import com.bpsi.cjnnetwork.network.AuthenticationApi;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TVDashBoard extends AppCompatActivity {
    private SimpleExoPlayer player;
    private PlayerView playerView;
    String videourl = "myResponse";
    String[] advtImages;

    String[] audiencefeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvdashboard);

        playerView = findViewById(R.id.exoplaytv);
        player = new SimpleExoPlayer.Builder(TVDashBoard.this).build();
        playerView.setPlayer(player);
        playerView.setUseController(false);
        preparePlayer();
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

    public void getvideourl() {

        AuthenticationApi authenticationApi = ApiClient.getClient().create(AuthenticationApi.class);
        Call<Videomodel> call = authenticationApi.getVideoUrl();
        Log.e("request_api_url", "" + call.request().url());
        call.enqueue(new Callback<Videomodel>() {
            @Override
            public void onResponse(Call<Videomodel> call, Response<Videomodel> response) {
                Log.e("TAG", "Video Response: " + new Gson().toJson(response.body()));
                if (response.body().getResponseStatus() == true) {
                    if (response.body().getResponseMessage().getDisplay().get0().getLocation().equals("videobar")) {
                        videourl = response.body().getResponseMessage().getDisplay().get0().get0().get(0).getVideoUrl();
                        Log.d("Video URL for VieoBar:", "MSG" + videourl);

                    }
                    advtImages = new String[response.body().getResponseMessage().getDisplay().get1().get0().size()];
                    for (int i = 0; i < advtImages.length; i++) {
                        advtImages[i] = response.body().getResponseMessage().getDisplay().get1().get0().get(i).getAdvertisementAsset();
                    }
                } else {
                    UIHelper.toast(TVDashBoard.this, "Failed To Play Video");
                }
            }

            @Override
            public void onFailure(Call<Videomodel> call, Throwable t) {
                Log.d("myResponse:", "MSG" + t.toString());
                UIHelper.toast(TVDashBoard.this, t.toString());
            }
        });
    }


    private void preparePlayer() {
        if (videourl != null) {
            MediaItem mediaItem = MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4");
            // Set media item to the player
            player.setMediaItem(mediaItem);
            // Prepare the player
            player.prepare();
            // Start playing
            player.setPlayWhenReady(true);
        }
    }
}
