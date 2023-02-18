package com.example.emergency_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BvActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bv2);


        PDFView pdfView=findViewById(R.id.bvView);
        pdfView.fromAsset("bv5.pdf").load();
    }
}