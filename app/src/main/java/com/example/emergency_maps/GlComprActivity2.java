package com.example.emergency_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GlComprActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_compr2);


        PDFView pdfView=findViewById(R.id.glcomprView);
        pdfView.fromAsset("gl.kompr.pdf").load();
    }
}