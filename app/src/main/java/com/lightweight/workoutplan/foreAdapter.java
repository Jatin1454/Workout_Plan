package com.lightweight.workoutplan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foreAdapter extends RecyclerView.Adapter<foreAdapter.viewHolder> {

    ArrayList<foreModel> foreModelArrayList;
    Context context;

    public foreAdapter(ArrayList<foreModel> foreModelArrayList, Context context) {
        this.foreModelArrayList = foreModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new foreAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        foreModel foreModel=foreModelArrayList.get(position);
        holder.muscleImage.setImageResource(foreModel.getImage());
        holder.muscleName.setText(foreModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                                foreModel.getImage()==R.drawable.wrist_gif_1||
                                foreModel.getImage()==R.drawable.wrist_curl||
                                foreModel.getImage()==R.drawable.reverse_wrist_curl
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",foreModel.getText());
                    intent.putExtra("exerciseImage",foreModel.getImage());
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return foreModelArrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        private ImageView muscleImage;
        private TextView muscleName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            muscleName=itemView.findViewById(R.id.muscletextView);
            muscleImage=itemView.findViewById(R.id.muscleimageView);
        }
    }
}
