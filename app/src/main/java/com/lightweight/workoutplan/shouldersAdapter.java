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

public class shouldersAdapter extends RecyclerView.Adapter<shouldersAdapter.viewHolder> {

    ArrayList<shouldersModel> shouldersModelArrayList;
    Context context;

    public shouldersAdapter(ArrayList<shouldersModel> shouldersModelArrayList, Context context) {
        this.shouldersModelArrayList = shouldersModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new shouldersAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        shouldersModel shouldersModel=shouldersModelArrayList.get(position);
        holder.muscleImage.setImageResource(shouldersModel.getImage());
        holder.muscleName.setText(shouldersModel.getText());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        shouldersModel.getImage()==R.drawable.shoulder_press||
                        shouldersModel.getImage()==R.drawable.arnold_press||
                        shouldersModel.getImage()==R.drawable.seated_bent_over_dumbbell_reverse_fly||
                        shouldersModel.getImage()==R.drawable.dumbbell_front_raise
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",shouldersModel.getText());
                    intent.putExtra("exerciseImage",shouldersModel.getImage());
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return shouldersModelArrayList.size();
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
