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

public class backAdapter extends RecyclerView.Adapter<backAdapter.viewHolder> {
    
    ArrayList<backModel> backModelArrayList;
    Context context;

    public backAdapter(ArrayList<backModel> backModelArrayList, Context context) {
        this.backModelArrayList = backModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new backAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        backModel backModel=backModelArrayList.get(position);
        holder.muscleImage.setImageResource(backModel.getImage());
        holder.muscleName.setText(backModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        backModel.getImage()==R.drawable.pull_ups||
                        backModel.getImage()==R.drawable.lat_pulldown||
                        backModel.getImage()==R.drawable.seated_cable_row||
                        backModel.getImage()==R.drawable.chest_supported_row||
                        backModel.getImage()==R.drawable.dumbbell_pullover||
                        backModel.getImage()==R.drawable.bent_over_db_row
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",backModel.getText());
                    intent.putExtra("exerciseImage",backModel.getImage());
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return backModelArrayList.size();
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
