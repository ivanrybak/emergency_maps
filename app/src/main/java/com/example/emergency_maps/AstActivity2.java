package com.example.emergency_maps;

import static com.example.emergency_maps.R.id.astView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AstActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ast2);


        PDFView pdfView=findViewById(astView);
        pdfView.fromAsset("ast.pdf").load();
    }
}