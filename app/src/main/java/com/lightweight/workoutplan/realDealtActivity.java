package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class realDealtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_dealt);

        RecyclerView recyclerView=findViewById(R.id.realrecyclerView);
        ArrayList<realDealtModel> realDealtModelArrayList=new ArrayList<>();
        realAdapter realAdapter=new realAdapter(realDealtModelArrayList,getApplicationContext());
        realDealtModelArrayList.add(new realDealtModel(R.drawable.dealt_fly,"Rear Dealt Flyes"));

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(realAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}