
package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class BackActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    backAdapter backAdapter;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        recyclerView=findViewById(R.id.backrecyclerView);
        textView=findViewById(R.id.backText);

        ArrayList<backModel> backModelArrayList=new ArrayList<>();

        backAdapter=new backAdapter(backModelArrayList,getApplicationContext());
        backModelArrayList.add(new backModel(R.drawable.pull_ups,"Pull Ups"));
        backModelArrayList.add(new backModel(R.drawable.lat_pulldown,"Lat Pull Down"));
        backModelArrayList.add(new backModel(R.drawable.seated_cable_row,"Seated Row"));
        backModelArrayList.add(new backModel(R.drawable.chest_supported_row,"Chest Supported Row"));
        backModelArrayList.add(new backModel(R.drawable.dumbbell_pullover,"Dumbell Pull Over"));
        backModelArrayList.add(new backModel(R.drawable.bent_over_db_row,"Bent Over Row"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(backAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}