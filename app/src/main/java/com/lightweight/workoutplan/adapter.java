package com.lightweight.workoutplan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class adapter extends ArrayAdapter<modal> {
    private ArrayList<modal> modalArrayList;
    Context context;

    public adapter(@NonNull Context context, ArrayList<modal> modalArrayList) {
        super(context, R.layout.my_layout,modalArrayList);
        this.modalArrayList = modalArrayList;
        this.context = context;
    }
    private static class viewHolder{
        TextView textView;
        ImageView imageView;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        modal modal=getItem(position);
        viewHolder viewHolder;

        if(convertView==null){
            viewHolder=new viewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());

            convertView=inflater.inflate(R.layout.my_layout,parent,false);

            viewHolder.imageView=convertView.findViewById(R.id.imageView);
            viewHolder.textView=convertView.findViewById(R.id.textView);
            convertView.setTag(viewHolder);
        }
        
        else {
            viewHolder=(viewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(modal.getImage());
        viewHolder.textView.setText(modal.getText());
        return convertView;
    }
}
