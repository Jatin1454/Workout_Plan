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

public class bicepsAdapter extends RecyclerView.Adapter<bicepsAdapter.viewHolder> {

    ArrayList<bicepsModel> bicepsModelArrayList;
    Context context;

    public bicepsAdapter(ArrayList<bicepsModel> bicepsModelArrayList, Context context) {
        this.bicepsModelArrayList = bicepsModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_muscle_layout,parent,false);
        return new bicepsAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        bicepsModel bicepsModel=bicepsModelArrayList.get(position);
        holder.muscleImage.setImageResource(bicepsModel.getImage());
        holder.muscleName.setText(bicepsModel.getText());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(
                        bicepsModel.getImage()==R.drawable.incline_dumbbell_curl||
                        bicepsModel.getImage()==R.drawable.preacher_curl||
                        bicepsModel.getImage()==R.drawable.barbell_curl||
                        bicepsModel.getImage()==R.drawable.cable_bicep_curl
                ){
                    Intent intent=new Intent(context,VideoViewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("exerciseName",bicepsModel.getText());
                    intent.putExtra("exerciseImage",bicepsModel.getImage());
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return bicepsModelArrayList.size();
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
