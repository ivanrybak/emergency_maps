package com.example.emergency_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goAkbActivity(View v){
        Intent intent=new Intent(this,AkbActivity.class);
        startActivity(intent);
    }
    public void goAstActivity(View v) {
        Intent intent = new Intent(this, AstActivity2.class);
        startActivity(intent);
    }
    public void goBvActivity(View v){
        Intent intent=new Intent(this,BvActivity2.class);
            startActivity(intent);
    }

    public void goDeviceActivity(View v){
        Intent intent=new Intent(this,DeviceActivity2.class);
            startActivity(intent);
    }

        public void goDriveActivity(View v) {
            Intent intent = new Intent(this, DriveActivity2.class);
            startActivity(intent);
        }

    public void goGlComprActivity(View v){
        Intent intent=new Intent(this,GlComprActivity2.class);
            startActivity(intent);
    }

    public void goLoopActivity(View v){
        Intent intent=new Intent(this,LoopActivity2.class);
            startActivity(intent);
    }

    public void goPantographActivity(View v){
        Intent intent=new Intent(this,PantographActivity2.class);
            startActivity(intent);
    }

    public void goProtectActivity(View v){
        Intent intent=new Intent(this,ProtectActivity2.class);
            startActivity(intent);
    }

    public void goSotActivity(View v){
        Intent intent=new Intent(this,SotActivity2.class);
            startActivity(intent);
    }

    public void VoltageAkbActivity(View v){
        Intent intent=new Intent(this,VoltageActivity2.class);
            startActivity(intent);
    }

    public void goVspomComprActivity(View v){
        Intent intent=new Intent(this,VspomComprActivity2.class);
            startActivity(intent);
    }
























}