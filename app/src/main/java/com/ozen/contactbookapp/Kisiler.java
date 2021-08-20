package com.ozen.contactbookapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class Kisiler extends Activity {

    ListView kisilerListe;

    private String[] kisiIsimleri={"Ayse","Mehmet","Ali","Zeynep","Beyza","Zuleyha","Hamza"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kisiler);

       kisilerListe = findViewById(R.id.kisilerListe);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , android.R.id.text1, kisiIsimleri);
        Arrays.sort(kisiIsimleri);
        Arrays.toString(kisiIsimleri);
        kisilerListe.setAdapter(adapter);
    }
}
