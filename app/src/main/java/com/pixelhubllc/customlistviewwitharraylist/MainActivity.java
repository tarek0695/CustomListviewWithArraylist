package com.pixelhubllc.customlistviewwitharraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> words = new ArrayList<String>();
    ListView listView;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);

        for (int i = 0; i<30; i++){
            words.add("Tarek " + i);
        }

        Log.e("words", words + "");
   

        listView.setAdapter(new CustomAdapter(this, words));

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//
//        listView.setAdapter(adapter);
    }

}
