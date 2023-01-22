package com.example.emergency_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AkbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akb);



      PDFView pdfView=findViewById(R.id.akbView);
      pdfView.fromAsset("akb1.pdf").load();
    }
}