package com.bpsi.cjnnetwork.Dashboard_all_in_one;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bpsi.cjnnetwork.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Recyclerview_messages extends RecyclerView.Adapter<Recyclerview_messages.ViewHolder> {
    Context context;
    ArrayList<Message_holder>arrayList;

    public Recyclerview_messages(ArrayList<Message_holder> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.recyclerview_feedbacks,null);
        return new Recyclerview_messages.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String test="dev";
        Log.e( "onBindViewHolder:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!","--------------------------------------------------");
        if (arrayList.get(position).designation.equals("candidate")){
            Picasso.get().load("https://"+test+".cjnnow.com/candidate/profile/"+arrayList.get(position).image).into(holder.imageView);
        } else if (arrayList.get(position).designation.equals("viewer")) {
            Picasso.get().load("https://"+test+".cjnnow.com/viewer_picture/"+arrayList.get(position).image).into(holder.imageView);
        } else if (arrayList.get(position).designation.equals("employer")) {
            Picasso.get().load("https://"+test+".cjnnow.com/employer_picture/"+arrayList.get(position).image).into(holder.imageView);
        }
        if (arrayList.get(position).image.equals("NA")){
            holder.imageView.setImageDrawable(context.getDrawable(R.drawable.download));
        }
        Log.e( "onBindViewHolder:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",arrayList.get(position).image+"");
        holder.name.setText(arrayList.get(position).name);
        Log.e( "onBindViewHolder:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",arrayList.get(position).name+"");

        holder.designation.setText(arrayList.get(position).designation);
        Log.e( "onBindViewHolder:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",arrayList.get(position).designation+"");

        Log.e( "onBindViewHolder:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",arrayList.get(position).message+"");
        holder.message.setText(arrayList.get(position).message);
        Log.e( "onBindViewHolder:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!","--------------------------------------------------");

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView designation;
        TextView message;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
            designation=itemView.findViewById(R.id.designation);
            message=itemView.findViewById(R.id.message);
        }
    }
}
