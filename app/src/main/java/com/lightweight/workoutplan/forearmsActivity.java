package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class forearmsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    foreAdapter foreAdapter;
    ArrayList<foreModel> foreModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearms);

        recyclerView=findViewById(R.id.foreRecyclerView);
        foreModelArrayList=new ArrayList<>();

        foreModelArrayList.add(new foreModel(R.drawable.wrist_gif_1,"Wrist Curls"));
        foreModelArrayList.add(new foreModel(R.drawable.reverse_wrist_curl,"Wrist Extensions"));
        foreModelArrayList.add(new foreModel(R.drawable.wrist_curl,"Behind-The-Back Wrist Curls"));

        foreAdapter=new foreAdapter(foreModelArrayList,getApplicationContext());
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(foreAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}