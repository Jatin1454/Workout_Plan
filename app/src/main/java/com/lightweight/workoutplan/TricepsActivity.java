package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TricepsActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);

        recyclerView=findViewById(R.id.tricepsrecyclerView);
        ArrayList<tricepsModel> tricepsModelArrayList=new ArrayList<>();

        tricepsAdapter tricepsAdapter=new tricepsAdapter(tricepsModelArrayList,getApplicationContext());
        tricepsModelArrayList.add(new tricepsModel(R.drawable.tricep_rope_pushdown,"Cable Pushdown"));
        tricepsModelArrayList.add(new tricepsModel(R.drawable.cable_overhead_extensions,"Cable Overhead Extension"));
        tricepsModelArrayList.add(new tricepsModel(R.drawable.tricep_kickback,"Dumbbell Kickback"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(tricepsAdapter);

    }
}