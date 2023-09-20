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

public class legsAdapter extends RecyclerView.Adapter<legsAdapter.viewHolder> {

    ArrayList<legsModel> legsModelArrayList;
    Context context;

    public legsAdapter(ArrayList<legsModel> legsModelArrayList, Context context) {
        this.legsModelArrayList = legsModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new legsAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        legsModel legsModel=legsModelArrayList.get(position);
        holder.muscleImage.setImageResource(legsModel.getImage());
        holder.muscleName.setText(legsModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        legsModel.getImage()==R.drawable.squat||
                        legsModel.getImage()==R.drawable.bodyweight_squat||
                        legsModel.getImage()==R.drawable.lunges||
                        legsModel.getImage()==R.drawable.leg_press||
                        legsModel.getImage()==R.drawable.leg_extension||
                        legsModel.getImage()==R.drawable.leg_curls||
                        legsModel.getImage()==R.drawable.calf_raises)
                {
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",legsModel.getText());
                    intent.putExtra("exerciseImage",legsModel.getImage());
                    context.startActivity(intent);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return legsModelArrayList.size();
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
