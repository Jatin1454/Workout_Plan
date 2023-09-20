package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    adapter adapter;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);
        button=findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://fitnessprogramer.com/"));
                startActivity(intent);
            }
        });

        ArrayList<modal> modalArrayList =new ArrayList<>();
        modalArrayList.add(new modal(R.drawable.back,"Back"));
        modalArrayList.add(new modal(R.drawable.biceps,"Biceps"));
        modalArrayList.add(new modal(R.drawable.chest,"Chest"));
        modalArrayList.add(new modal(R.drawable.triceps,"Triceps"));
        modalArrayList.add(new modal(R.drawable.core,"Core"));
        modalArrayList.add(new modal(R.drawable.shoulders,"Shoulder"));
        modalArrayList.add(new modal(R.drawable.traps,"Traps"));
        modalArrayList.add(new modal(R.drawable.real,"Rear Dealt"));
        modalArrayList.add(new modal(R.drawable.legs,"Legs"));
        modalArrayList.add(new modal(R.drawable.forearms,"Forearms"));

        adapter=new adapter(getApplicationContext(),modalArrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent=new Intent(getApplicationContext(),BackActivity.class);
                    intent.putExtra("muscleName","Back");
                    intent.putExtra("muscleImage",R.drawable.back);
                    startActivity(intent);
                }
                else if (position==1) {
                    Intent intent=new Intent(getApplicationContext(),BicepsActivity.class);
                    intent.putExtra("muscleName","Biceps");
                    intent.putExtra("muscleImage",R.drawable.biceps);
                    startActivity(intent);
                }
                else if (position==2) {
                    Intent intent=new Intent(getApplicationContext(),ChestActivity.class);
                    intent.putExtra("muscleName","Chest");
                    intent.putExtra("muscleImage",R.drawable.chest);
                    startActivity(intent);
                }
                else if (position==3) {
                    Intent intent=new Intent(getApplicationContext(),TricepsActivity.class);
                    intent.putExtra("muscleName","Triceps");
                    intent.putExtra("muscleImage",R.drawable.triceps);
                    startActivity(intent);
                }
                else if (position==4) {
                    Intent intent=new Intent(getApplicationContext(),CoreActivity.class);
                    intent.putExtra("muscleName","Core");
                    intent.putExtra("muscleImage",R.drawable.core);
                    startActivity(intent);
                }
                else if (position==5) {
                    Intent intent=new Intent(getApplicationContext(),shouldersActivity.class);
                    intent.putExtra("muscleName","Shoulder");
                    intent.putExtra("muscleImage",R.drawable.shoulders);
                    startActivity(intent);
                }
                else if (position==6) {
                    Intent intent=new Intent(getApplicationContext(),trapsActivity.class);
                    intent.putExtra("muscleName","Traps");
                    intent.putExtra("muscleImage",R.drawable.traps);
                    startActivity(intent);
                }
                else if (position==7) {
                    Intent intent=new Intent(getApplicationContext(),realDealtActivity.class);
                    intent.putExtra("muscleName","Rear Dealt");
                    intent.putExtra("muscleImage",R.drawable.real);
                    startActivity(intent);
                }
                else if (position==8) {
                    Intent intent=new Intent(getApplicationContext(),legsActivity.class);
                    intent.putExtra("muscleName","Legs");
                    intent.putExtra("muscleImage",R.drawable.legs);
                    startActivity(intent);
                }
                else if (position==9) {
                    Intent intent=new Intent(getApplicationContext(),forearmsActivity.class);
                    intent.putExtra("muscleName","Forearms");
                    intent.putExtra("muscleImage",R.drawable.forearms);
                    startActivity(intent);
                }
            }
        });
    }
}