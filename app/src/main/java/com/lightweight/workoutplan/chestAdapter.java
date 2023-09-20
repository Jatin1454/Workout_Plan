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

public class chestAdapter extends RecyclerView.Adapter<chestAdapter.viewHolder> {

    ArrayList<ChestModel> chestModelArrayList;
    Context context;

    public chestAdapter(ArrayList<ChestModel> chestModelArrayList, Context context) {
        this.chestModelArrayList = chestModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new chestAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ChestModel chestModel=chestModelArrayList.get(position);
        holder.muscleImage.setImageResource(chestModel.getImage());
        holder.muscleName.setText(chestModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        chestModel.getImage()==R.drawable.push_ups||
                        chestModel.getImage()==R.drawable.bench_press||
                        chestModel.getImage()==R.drawable.incline_bench_press||
                        chestModel.getImage()==R.drawable.incline_dumbbell_fly||
                        chestModel.getImage()==R.drawable.machine_chest_fly||
                        chestModel.getImage()==R.drawable.chest_press
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",chestModel.getText());
                    intent.putExtra("exerciseImage",chestModel.getImage());
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return chestModelArrayList.size();
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
