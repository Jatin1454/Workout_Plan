package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class legsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        RecyclerView recyclerView=findViewById(R.id.legsrecyclerView);
        ArrayList<legsModel> legsModelArraList=new ArrayList<>();
        legsAdapter legsAdapter=new legsAdapter(legsModelArraList,getApplicationContext());
        legsModelArraList.add(new legsModel(R.drawable.bodyweight_squat,"Squats"));
        legsModelArraList.add(new legsModel(R.drawable.squat,"Weighted Squats"));
        legsModelArraList.add(new legsModel(R.drawable.lunges,"Lunges"));
        legsModelArraList.add(new legsModel(R.drawable.leg_press,"Leg Press"));
        legsModelArraList.add(new legsModel(R.drawable.leg_extension,"Leg Extension"));
        legsModelArraList.add(new legsModel(R.drawable.leg_curls,"Leg Curls"));
        legsModelArraList.add(new legsModel(R.drawable.calf_raises,"Calf Raises"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(legsAdapter);





    }
}