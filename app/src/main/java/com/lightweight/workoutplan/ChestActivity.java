package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ChestActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        recyclerView=findViewById(R.id.chestrecyclerView);
        ArrayList<ChestModel> chestModelArrayList=new ArrayList<>();
        chestAdapter chestAdapter=new chestAdapter(chestModelArrayList,getApplicationContext());

        chestModelArrayList.add(new ChestModel(R.drawable.push_ups,"Push Ups"));
        chestModelArrayList.add(new ChestModel(R.drawable.bench_press,"Bench Press"));
        chestModelArrayList.add(new ChestModel(R.drawable.incline_bench_press,"Incline Press"));
        chestModelArrayList.add(new ChestModel(R.drawable.incline_dumbbell_fly,"Incline Dumbbell Fly"));
        chestModelArrayList.add(new ChestModel(R.drawable.machine_chest_fly,"Chest Flyes"));
        chestModelArrayList.add(new ChestModel(R.drawable.chest_press,"Chest Press"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(chestAdapter);
    }
}