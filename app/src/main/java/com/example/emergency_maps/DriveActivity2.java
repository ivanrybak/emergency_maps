package com.example.emergency_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DriveActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive2);

        PDFView pdfView=findViewById(R.id.driveView);
        pdfView.fromAsset("drive.pdf").load();
    }
}