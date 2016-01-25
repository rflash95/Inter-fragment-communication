package com.teknorial.inter_fragment_communication;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public void respond (String data){
        FragmentManager manager = getFragmentManager();
        FragmentB f2= (FragmentB) manager.findFragmentById(R.id.fragment2);//untuk mendapatkan referensi FragmentB
        f2.changeText(data);//dikirim ke method changeText(data) pada FragmentB
    }
}
