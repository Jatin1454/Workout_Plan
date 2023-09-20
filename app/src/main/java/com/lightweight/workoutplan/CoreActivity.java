package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        RecyclerView recyclerView=findViewById(R.id.corerecyclerView);
        ArrayList<coreModel> coreModelArrayList=new ArrayList<>();

        coreAdapter coreAdapter=new coreAdapter(coreModelArrayList,getApplicationContext());
        coreModelArrayList.add(new coreModel(R.drawable.hanging_knee_raise,"Hanging Knee Raise"));
        coreModelArrayList.add(new coreModel(R.drawable.crunches,"Crunches"));
        coreModelArrayList.add(new coreModel(R.drawable.plank,"Plank"));
        coreModelArrayList.add(new coreModel(R.drawable.russian_twist,"Russian Twist"));
        coreModelArrayList.add(new coreModel(R.drawable.core5,"Weighted Situps"));
        coreModelArrayList.add(new coreModel(R.drawable.superman_hold,"Superman Hold"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(coreAdapter);

    }
}