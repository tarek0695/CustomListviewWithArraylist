package com.pixelhubllc.customlistviewwitharraylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<String> words;


    Context mContext;
    //constructor
    public CustomAdapter(Context mContext, ArrayList<String> words) {
        this.mContext = mContext;
        this.words = words;
    }

    public int getCount() {
        return words.size();
    }

    public Object getItem(int arg0) {
        return null;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View arg1, ViewGroup viewGroup)
    {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_textview, viewGroup, false);

        TextView addresstext = (TextView) row.findViewById(R.id.text_view);

        addresstext.setText(words.get(position));


        return row;
    }
}
