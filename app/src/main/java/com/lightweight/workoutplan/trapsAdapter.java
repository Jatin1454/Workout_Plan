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

public class trapsAdapter extends RecyclerView.Adapter<trapsAdapter.viewHolder> {

    ArrayList<trapsModel> trapsModelArrayList;
    Context context;

    public trapsAdapter(ArrayList<trapsModel> trapsModelArrayList, Context context) {
        this.trapsModelArrayList = trapsModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new trapsAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        trapsModel trapsModel=trapsModelArrayList.get(position);
        holder.muscleImage.setImageResource(trapsModel.getImage());
        holder.muscleName.setText(trapsModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        trapsModel.getImage()==R.drawable.dumbbell_shrug||
                        trapsModel.getImage()==R.drawable.upright_row||
                        trapsModel.getImage()==R.drawable.face_pulls
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",trapsModel.getText());
                    intent.putExtra("exerciseImage",trapsModel.getImage());
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return trapsModelArrayList.size();
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
