package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecylerViewAdapter recylerViewAdapter;
    List<String> list = Arrays.asList("Woodpecker","Stork","Owl","Robin","Piegon","Penguine","blackbird","Swallow","Turkey","Piegon","Ostrich","Flaming","Peacock","Shivam","Deepak","Robin","Khan");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recylerViewAdapter = new RecylerViewAdapter(list);
        recyclerView.setAdapter(recylerViewAdapter);

    }

}

