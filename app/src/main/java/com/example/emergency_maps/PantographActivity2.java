package com.example.emergency_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PantographActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantograph2);


        PDFView pdfView=findViewById(R.id.pantView);
        pdfView.fromAsset("pantog.pdf").load();



    }
}