package com.bpsi.cjnnetwork.Dashboard_all_in_one;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bpsi.cjnnetwork.MainActivity;
import com.bpsi.cjnnetwork.R;
import com.bpsi.cjnnetwork.UIHelper;
import com.bpsi.cjnnetwork.model.Videomodel;
import com.bpsi.cjnnetwork.network.ApiClient;
import com.bpsi.cjnnetwork.network.AuthenticationApi;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TVDashBoard extends AppCompatActivity implements OnClick_dashboard {
    private SimpleExoPlayer player;
    private PlayerView playerView;
    String videourl = "myResponse";
    String[] advtImages;
    ImageView qr1;

    private YouTubePlayerView yt_player;
    ImageView advertisement;
    String url="";
    String test="dev";

    String[] audiencefeedback;

    RecyclerView recycler_view_qrcodes;
    RecyclerView recycler_messages;

    TextView openingnumbers;
    TextView intervirenumber;
    TextView offerednumber;

    ArrayList<String> advertisements_links=new ArrayList<>();
    ArrayList<qrcodes> qr_codes_links=new ArrayList<>();



    ArrayList<Message_holder> messageHolders=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvdashboard);
        Log.e("1onCreate:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>", "!@#$%^&()O!@#$%^&()_");
        /*
        playerView = findViewById(R.id.exoplaytv);
        player = new SimpleExoPlayer.Builder(TVDashBoard.this).build();
        playerView.setPlayer(player);
        playerView.setUseController(false);
        preparePlayer();
        // Call method to get video URL
        getvideourl();
         */


        try{
            {

                openingnumbers = findViewById(R.id.openingnumbers);
                intervirenumber = findViewById(R.id.intervirenumber);
                offerednumber = findViewById(R.id.offerednumber);


                recycler_view_qrcodes = findViewById(R.id.recycler_view_qrcodes);
                recycler_messages = findViewById(R.id.recycler_messages);

                advertisement = findViewById(R.id.advertisement);
                yt_player = findViewById(R.id.yt_player);
                Picasso.get().load("https://"+test+".cjnnow.com/advertisement/1715402944v1S05nruQo.png").into(advertisement);


                RequestQueue requestQueue = Volley.newRequestQueue(TVDashBoard.this);
                StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://"+test+".cjnnow.com/api/gettvshowinfo01", new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("1onResponse: 1", response.toString());
                        JsonParser jsonParser = new JsonParser();
                        JsonObject jsonObject = jsonParser.parse(response).getAsJsonObject();
                        try {
                            String string = jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("0").getAsJsonObject().get("0").getAsJsonArray().get(0).getAsJsonObject().get("video_url").toString();
                            Log.e("1onResponse: 123>>>>>>>>", "--" + string.replace("https://www.youtube.com/embed/", "").charAt(12) + "--");
                            url = "";
                            url = string.replace("https://www.youtube.com/embed/", "").replace("\"","");
                            getLifecycle().addObserver((LifecycleObserver) yt_player);
                            yt_player.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                                @Override
                                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                                    youTubePlayer.loadVideo(url, 0);
                                    Log.e("1onReady:!!!!!!!!!!!!!", "ready");
                                }

                                @Override
                                public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError error) {
                                    super.onError(youTubePlayer, error);
                                    Log.e("1onError:!!!!!!!!!!", error.toString());
                                }
                            });
                            Log.e("1onResponse: 123>>>>>>>>", "--" + url + "--");
                            System.out.println(string);
                            StringBuilder stringBuilder = new StringBuilder(string);

                        } catch (Exception e) {
                            Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            Log.e("1onResponse: 123<<<<<<<<<<<", e.toString());
                        }

                        try{
                            Log.e( "onResponse::::::::::::::::::>>>>>>",jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("1").getAsJsonObject().get("0").getAsJsonArray().toString());
                            JsonArray advertisements=jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("1").getAsJsonObject().get("0").getAsJsonArray();
                            for (int i = 0; i < advertisements.size(); i++) {
                                //if (i!=0){
                                JsonObject jsonObject1=advertisements.get(i).getAsJsonObject();Log.e("1onResponse: 12345>>>>>>>>", "--" + jsonObject1.get("advertisement_asset").toString().replace("\"","") + "--");
                                advertisements_links.add(jsonObject1.get("advertisement_asset").toString().replace("\"",""));
                                //}

                            }
                            Log.e("1onResponse: 12345>>>>>>>>", "--" + advertisements_links.toString() + "--");
                            startchanging(0);
                        }catch (Exception e){
                            Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            Log.e("1onResponse: 123<<<<<<<<<<<", e.toString());
                        }
                        try{
                            openingnumbers.setText(jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("3").getAsJsonObject().get("0").getAsJsonArray().get(0).getAsJsonObject().get("number_of_opening").toString());
                            offerednumber.setText(jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("3").getAsJsonObject().get("0").getAsJsonArray().get(0).getAsJsonObject().get("number_of_job_offers_made").toString().replace("\"",""));
                            intervirenumber.setText(jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("3").getAsJsonObject().get("0").getAsJsonArray().get(0).getAsJsonObject().get("number_of_candidate_waiting").toString().replace("\"",""));
                        }catch (Exception e){
                            Log.e( "onResponse: ",e.toString());
                            Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                        try {
                            JsonArray qr_code4 = jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("4").getAsJsonArray();

                            for (int i = 0; i < qr_code4.size(); i++) {
                                qr_codes_links.add(new qrcodes("training/"+qr_code4.get(i).getAsJsonObject().get("training_qrcode_id").toString().replace("\"",""),qr_code4.get(i).getAsJsonObject().get("training_institute_id").toString().replace("\"",""),qr_code4.get(i).getAsJsonObject().get("web_link").toString().replace("\"","")));
                            }


                            JsonArray qr_code5 = jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("5").getAsJsonArray();
                            for (int i = 0; i < qr_code5.size(); i++) {
                                qr_codes_links.add(new qrcodes("assessment/"+qr_code5.get(i).getAsJsonObject().get("assessment_qrcode_filename").toString().replace("\"",""),qr_code5.get(i).getAsJsonObject().get("assessment_system").toString().replace("\"",""),qr_code5.get(i).getAsJsonObject().get("assessment_test_link").toString().replace("\"","")));
                            }


                            JsonArray qr_code6 = jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("6").getAsJsonArray();
                            for (int i = 0; i < qr_code6.size(); i++) {
                                qr_codes_links.add(new qrcodes("interviewroom/"+qr_code6.get(i).getAsJsonObject().get("interview_qr_code").toString().replace("\"",""),qr_code6.get(i).getAsJsonObject().get("conference_system_type").toString().replace("\"",""),qr_code6.get(i).getAsJsonObject().get("interview_room_link").toString().replace("\"","")));
                            }


                            JsonArray qr_code7 = jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("7").getAsJsonArray();
                            for (int i = 0; i < qr_code7.size(); i++) {
                                qr_codes_links.add(new qrcodes("jobdesc/"+qr_code7.get(i).getAsJsonObject().get("qrcode_filename").toString().replace("\"",""),qr_code7.get(i).getAsJsonObject().get("Job_title").toString().replace("\"",""),qr_code7.get(i).getAsJsonObject().get("Job_desc_pdf_link").toString().replace("\"","").replace("localhost.devcjnnow.com","dev.cjnnow.com")));
                            }
                            Recyclerview_qr_code recyclerviewQrCode=new Recyclerview_qr_code(qr_codes_links,TVDashBoard.this,TVDashBoard.this::onClick_dashboard_tapped);
                            recycler_view_qrcodes.setLayoutManager(new LinearLayoutManager(TVDashBoard.this,LinearLayoutManager.HORIZONTAL,false));
                            recycler_view_qrcodes.setAdapter(recyclerviewQrCode);
                        }catch (Exception e){
                            Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }



                        try {
                            JsonArray qr_code = jsonObject.get("responseMessage").getAsJsonObject().get("Display").getAsJsonObject().get("2").getAsJsonObject().get("0").getAsJsonArray();
                            for (int i = 0; i < qr_code.size(); i++) {
                                if (qr_code.get(i).getAsJsonObject().get("employer_image").toString()!=null && !qr_code.get(i).getAsJsonObject().get("employer_image").toString().equals("null") && qr_code.get(i).getAsJsonObject().get("employer_image").toString().length()>0){
                                    messageHolders.add(new Message_holder(qr_code.get(i).getAsJsonObject().get("feedback_user_role").toString().replace("\"",""),qr_code.get(i).getAsJsonObject().get("employer_image").toString().replace("\"",""),qr_code.get(i).getAsJsonObject().get("feedback_text").toString().replace("\"",""),qr_code.get(i).getAsJsonObject().get("feedback_user").toString().replace("\"","")));
                                }
                                else {
                                    messageHolders.add(new Message_holder(qr_code.get(i).getAsJsonObject().get("feedback_user_role").toString().replace("\"",""),qr_code.get(i).getAsJsonObject().get("candidate_image").toString().replace("\"",""),qr_code.get(i).getAsJsonObject().get("feedback_text").toString().replace("\"",""),qr_code.get(i).getAsJsonObject().get("feedback_user").toString().replace("\"","")));
                                }
                            }
                            Log.e( "onResponse:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",qr_codes_links.toString());
                            Recyclerview_messages recyclerviewMessages= new Recyclerview_messages(messageHolders,TVDashBoard.this);
                            recycler_messages.setLayoutManager(new LinearLayoutManager(TVDashBoard.this,LinearLayoutManager.VERTICAL,false));
                            recycler_messages.setAdapter(recyclerviewMessages);
                        }catch (Exception e){
                            Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                        Log.e("1onResponse: 1.2", "-------------------------" + jsonObject.toString() + "-------------------------");
                    }
                }, new com.android.volley.Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("1onResponse: 2", error.toString());
                    }
                }) {
                    @Override
                    public Map<String, String> getHeaders() {
                        Map<String, String> params = new HashMap<>();
                        params.put("apikey", "SYXMcLRzqq1VRby6xISkrn3ieu8kmkHVWW37sRWK2b831424");
                        return params;
                    }

                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<>();
                        params.put("show_id", "s501");
                        return params;
                    }
                };
                requestQueue.add(stringRequest);


                StringRequest yt_video_desc = new StringRequest(Request.Method.POST, "https://"+test+".cjnnow.com/api/listFeedback", new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("1onResponse: 1", response.toString());
                        JsonParser jsonParser = new JsonParser();
                        JsonObject jsonObject = jsonParser.parse(response).getAsJsonObject();
                        Log.e("1onResponse: 1.2", "-------------------------" + jsonObject.toString() + "-------------------------");
                    }
                }, new com.android.volley.Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("1onResponse: 2", error.toString());
                    }
                }) {
                    @Override
                    public Map<String, String> getHeaders() {
                        Map<String, String> params = new HashMap<>();
                        params.put("apikey", "SYXMcLRzqq1VRby6xISkrn3ieu8kmkHVWW37sRWK2b831424");
                        return params;
                    }
                };
                requestQueue.add(yt_video_desc);






            }
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            },3000);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the player when it's no longer needed.
        try {
            if (player != null) {
                player.release();
                player = null;
            }
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            },3000);
        }

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
    public void startchanging(int i){
        try{
            if(i%2==0){
                Picasso.get().load("https://dev.cjnnow.com/advertisement/"+advertisements_links.get(0)).into(advertisement);

            }else {
                Picasso.get().load("https://dev.cjnnow.com/advertisement/"+advertisements_links.get(1)).into(advertisement);
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startchanging(i+1);
                }
            },5000);
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(TVDashBoard.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            },3000);
        }

    }


    @Override
    public void onClick_dashboard_tapped(int position, int tapped_on) {
        SharedPreferences sharedPreferences=getSharedPreferences("Login_Info_for_usage",0);
        if (sharedPreferences.getBoolean("Logged_In",false)){
            if (tapped_on==1){
                try {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(qr_codes_links.get(position).assessment_test_link));
                    startActivity(intent);
                }catch (Exception e){
                    try {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://"+qr_codes_links.get(position).assessment_test_link));
                        startActivity(intent);
                    }catch (Exception e1){
                        Toast.makeText(this, e1.getMessage(), Toast.LENGTH_SHORT).show();
                        Log.e("onClick_dashboard_tapped:------------------",e1.toString());
                        Log.e("onClick_dashboard_tapped:------------------",qr_codes_links.get(position).assessment_test_link.replace("http","-->>"));
                    }
                }
            }
        }else{
            Toast.makeText(this, "Please Login First", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(TVDashBoard.this,MainActivity.class));
        }
    }
}