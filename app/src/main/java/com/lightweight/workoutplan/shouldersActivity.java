package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class shouldersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);

        RecyclerView recyclerView=findViewById(R.id.shouldersrecyclerView);
        ArrayList<shouldersModel> shouldersModelArrayList=new ArrayList<>();

        shouldersAdapter shouldersAdapter=new shouldersAdapter(shouldersModelArrayList,getApplicationContext());
        shouldersModelArrayList.add(new shouldersModel(R.drawable.shoulder_press,"Shoulders Press"));
        shouldersModelArrayList.add(new shouldersModel(R.drawable.arnold_press,"Arnold Press"));
        shouldersModelArrayList.add(new shouldersModel(R.drawable.seated_bent_over_dumbbell_reverse_fly,"Bent Over Dumbbell Reverse Fly"));
        shouldersModelArrayList.add(new shouldersModel(R.drawable.dumbbell_front_raise,"Front Raise"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(shouldersAdapter);
    }
}