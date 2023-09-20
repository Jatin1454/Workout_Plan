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

public class coreAdapter extends RecyclerView.Adapter<coreAdapter.viewHolder> {

    ArrayList<coreModel> coreModelArrayList;
    Context context;

    public coreAdapter(ArrayList<coreModel> coreModelArrayList, Context context) {
        this.coreModelArrayList = coreModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new coreAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        coreModel coreModel=coreModelArrayList.get(position);
        holder.muscleImage.setImageResource(coreModel.getImage());
        holder.muscleName.setText(coreModel.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        coreModel.getImage()==R.drawable.hanging_knee_raise||
                        coreModel.getImage()==R.drawable.crunches||
                        coreModel.getImage()==R.drawable.plank||
                        coreModel.getImage()==R.drawable.russian_twist||
                        coreModel.getImage()==R.drawable.core5||
                        coreModel.getImage()==R.drawable.superman_hold
                ){
                    Intent intent=new Intent(context, VideoViewActivity.class);
                    intent.putExtra("exerciseName",coreModel.getText());
                    intent.putExtra("exerciseImage",coreModel.getImage());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return coreModelArrayList.size();
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
