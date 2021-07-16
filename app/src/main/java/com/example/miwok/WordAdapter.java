package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private final int containerColorResourceID;
    public WordAdapter(@NonNull Context context, ArrayList<Word> resource , int cResourceID ){
        super(context,0, resource);
        this.containerColorResourceID = cResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWordPosition = getItem(position);
        TextView textView1 = listItemView.findViewById(R.id.textView1);
        textView1.setText(currentWordPosition.getmDefaultTranslation());


        TextView textView2 = listItemView.findViewById(R.id.textView2);
        textView2.setText(currentWordPosition.getmMiwokTranslation());

        ImageView imageResource = listItemView.findViewById(R.id.imageView);

        if(currentWordPosition.hasimage()) {
            imageResource.setImageResource(currentWordPosition.getImageResourceID());
            imageResource.setVisibility(View.VISIBLE);
        }
        else{
            imageResource.setVisibility(View.GONE);
        }

        View container = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),containerColorResourceID);
        container.setBackgroundColor(color);


        return listItemView;
//        return super.getView(position, convertView, parent);
    }
}

