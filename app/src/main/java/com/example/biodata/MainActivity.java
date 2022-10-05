package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTlpn, btnEmail, btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTlpn = findViewById(R.id.btnTlpn);
        btnTlpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "082242742537";
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.fromParts("tel", nomor, null));
                startActivity(call);
            }
        });

        btnEmail = findViewById(R.id.btnEmail);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+"ekyramadhan054@gmail.com"));
                startActivity(intent);
            }
        });

        btnMaps = findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:?q=-7.481511, 110.568498,");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}