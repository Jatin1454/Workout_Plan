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

public class tricepsAdapter extends RecyclerView.Adapter<tricepsAdapter.viewHolder> {

    ArrayList<tricepsModel> tricepsModelArrayList;
    Context context;

    public tricepsAdapter(ArrayList<tricepsModel> tricepsModelArrayList, Context context) {
        this.tricepsModelArrayList = tricepsModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new tricepsAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        tricepsModel tricepsModel=tricepsModelArrayList.get(position);
        holder.muscleImage.setImageResource(tricepsModel.getImage());
        holder.muscleName.setText(tricepsModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(
                        tricepsModel.getImage()==R.drawable.tricep_rope_pushdown||
                        tricepsModel.getImage()==R.drawable.cable_overhead_extensions||
                        tricepsModel.getImage()==R.drawable.tricep_kickback
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",tricepsModel.getText());
                    intent.putExtra("exerciseImage",tricepsModel.getImage());
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return tricepsModelArrayList.size();
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
