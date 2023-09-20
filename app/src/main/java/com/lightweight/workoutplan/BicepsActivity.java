package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BicepsActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);

        recyclerView=findViewById(R.id.bicepsrecyclerView);

        ArrayList<bicepsModel> bicepsModelArrayList=new ArrayList<>();
        bicepsAdapter bicepsAdapter=new bicepsAdapter(bicepsModelArrayList,getApplicationContext());
        bicepsModelArrayList.add(new bicepsModel(R.drawable.incline_dumbbell_curl,"Inclined Curls"));
        bicepsModelArrayList.add(new bicepsModel(R.drawable.preacher_curl,"Preacher Curls"));
        bicepsModelArrayList.add(new bicepsModel(R.drawable.barbell_curl,"Barbell Curls"));
        bicepsModelArrayList.add(new bicepsModel(R.drawable.cable_bicep_curl,"Cable Curls"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bicepsAdapter);



    }
}