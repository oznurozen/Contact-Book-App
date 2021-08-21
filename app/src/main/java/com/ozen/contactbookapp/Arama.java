package com.ozen.contactbookapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Arama extends Activity {
    Button bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,kare,sifir,yildiz,ara;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arama);

        bir = findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        yildiz = findViewById(R.id.yildiz);
        sifir = findViewById(R.id.sifir);
        kare = findViewById(R.id.kare);
        ara = findViewById(R.id.ara);

        textView = findViewById(R.id.textView);

        bir.setOnClickListener(view -> textView.setText(textView.getText()+"1"));
        iki.setOnClickListener(view -> textView.setText(textView.getText()+"2"));
        uc.setOnClickListener(view -> textView.setText(textView.getText()+"3"));
        dort.setOnClickListener(view -> textView.setText(textView.getText()+"4"));
        bes.setOnClickListener(view -> textView.setText(textView.getText()+"5"));
        alti.setOnClickListener(view -> textView.setText(textView.getText()+"6"));
        yedi.setOnClickListener(view -> textView.setText(textView.getText()+"7"));
        sekiz.setOnClickListener(view -> textView.setText(textView.getText()+"8"));
        dokuz.setOnClickListener(view -> textView.setText(textView.getText()+"9"));
        yildiz.setOnClickListener(view -> textView.setText(textView.getText()+"*"));
        sifir.setOnClickListener(view -> textView.setText(textView.getText()+"0"));
        kare.setOnClickListener(view -> textView.setText(textView.getText()+"#"));

        ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(textView.getText().toString()));
                startActivity(intent);
            }
        });


    }
}
