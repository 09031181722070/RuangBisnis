package com.example.application;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("olshop", "weṭeṭṭi", R.drawable.olshop));
        words.add(new Word("bimbel", "chiwiiṭә", R.drawable.bimbel));
        words.add(new Word("catering", "ṭopiisә", R.drawable.catering));
        words.add(new Word("cupcake", "chokokki", R.drawable.cupcake));
        words.add(new Word("thaithea", "ṭakaakki", R.drawable.thaitea));
        words.add(new Word("loundry", "ṭopoppi", R.drawable.loundry));
        words.add(new Word("counter", "kululli", R.drawable.counter));
        words.add(new Word("pembayaran", "kelelli", R.drawable.pembayaran));

        //create an {@Link ArrayAdapter}, whose data source is a list of strings,
        //The adapter knows how to create layouts for each item in the list,
        //using the simple_list_item_1.xml layout resource defined in the Android framework.
        //This list item layout contains a single {@link TextView}, which the adapter will set display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        //find the {@link ListView} object in the view hierarchy of the {@link Activity},
        //there should be a {!link ListView} with the view ID called list, which is declared in
        //word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // make the {@link_ListView} object in the view herarchy of the
        // There should be a {@link ListView} with the view ID called
        // word_list.xml
        listView.setAdapter(adapter);

    }
}

