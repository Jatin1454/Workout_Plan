package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class trapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traps);

        RecyclerView recyclerView=findViewById(R.id.trapsrecyclerView);
        ArrayList<trapsModel> trapsModelArrayList=new ArrayList<>();
        trapsAdapter trapsAdapter=new trapsAdapter(trapsModelArrayList,getApplicationContext());

        trapsModelArrayList.add(new trapsModel(R.drawable.dumbbell_shrug,"Shrugs"));
        trapsModelArrayList.add(new trapsModel(R.drawable.upright_row,"Upright Row"));
        trapsModelArrayList.add(new trapsModel(R.drawable.face_pulls,"Face Pulls"));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(trapsAdapter);
    }
}