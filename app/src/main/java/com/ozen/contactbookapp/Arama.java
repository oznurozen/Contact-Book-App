package com.ozen.contactbookapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


    public class Arama extends Fragment {
        View view;
        Button bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,kare,sifir,yildiz;
        TextView textView;
        ImageButton ara;

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.arama, container, false);
            tanimlama();
            return view;


        }
    void tanimlama(){
        bir = view.findViewById(R.id.bir);
        iki = view.findViewById(R.id.iki);
        uc = view.findViewById(R.id.uc);
        dort = view.findViewById(R.id.dort);
        bes = view.findViewById(R.id.bes);
        alti = view.findViewById(R.id.alti);
        yedi = view.findViewById(R.id.yedi);
        sekiz = view.findViewById(R.id.sekiz);
        dokuz = view.findViewById(R.id.dokuz);
        yildiz = view.findViewById(R.id.yildiz);
        sifir = view.findViewById(R.id.sifir);
        kare = view.findViewById(R.id.kare);
        ara = view.findViewById(R.id.ara);

        textView = view.findViewById(R.id.textView);

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
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(textView.getText().toString()));
                startActivity(intent);
            }
        });


    }
}
