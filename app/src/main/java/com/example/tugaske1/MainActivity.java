package com.example.tugaske1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btndetail1,btndetail2,btndetail3,btndetail4,btndetail5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndetail1 = findViewById(R.id.btndetail1);
        btndetail2 = findViewById(R.id.btndetail2);
        btndetail3 = findViewById(R.id.btndetail3);
        btndetail4 = findViewById(R.id.btndetail4);
        btndetail5 = findViewById(R.id.btndetail5);

        btndetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout = new Intent(MainActivity.this, detaillayout.class);
                intentlayout.putExtra(detaillayout.EXTRA_TITLE,"Profile Detail Nama Orang");
                intentlayout.putExtra(detaillayout.EXTRA_nama,"Lionel Messi");
                intentlayout.putExtra(detaillayout.EXTRA_umur,"36 Tahun");
                intentlayout.putExtra(detaillayout.EXTRA_alamat,"Argentina");
                startActivity(intentlayout);
            }
        });
        btndetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout2 = new Intent(MainActivity.this, detaillayout.class);


                intentlayout2.putExtra(detaillayout.EXTRA_TITLE,"Profile Detail Nama Orang");
                intentlayout2.putExtra(detaillayout.EXTRA_nama,"Lionel Messi");
                intentlayout2.putExtra(detaillayout.EXTRA_umur,"36 Tahun");
                intentlayout2.putExtra(detaillayout.EXTRA_alamat,"Argentina");


                startActivity(intentlayout2);
            }
        });

        btndetail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout3 = new Intent(MainActivity.this, detaillayout.class);


                intentlayout3.putExtra(detaillayout.EXTRA_TITLE,"Profile Detail Nama Orang");
                intentlayout3.putExtra(detaillayout.EXTRA_nama,"Cristiano Ronaldo");
                intentlayout3.putExtra(detaillayout.EXTRA_umur,"39 tahun");
                intentlayout3.putExtra(detaillayout.EXTRA_alamat,"Portugal");


                startActivity(intentlayout3);
            }
        });
        btndetail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout4 = new Intent(MainActivity.this, detaillayout.class);


                intentlayout4.putExtra(detaillayout.EXTRA_TITLE,"Profile Detail Nama Orang");
                intentlayout4.putExtra(detaillayout.EXTRA_nama,"Neymar");
                intentlayout4.putExtra(detaillayout.EXTRA_umur,"32 Tahun");
                intentlayout4.putExtra(detaillayout.EXTRA_alamat,"Brazil");


                startActivity(intentlayout4);
            }
        });

        btndetail5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout5 = new Intent(MainActivity.this, detaillayout.class);


                intentlayout5.putExtra(detaillayout.EXTRA_TITLE,"Profile Detail Nama Orang");
                intentlayout5.putExtra(detaillayout.EXTRA_nama,"Mbappe");
                intentlayout5.putExtra(detaillayout.EXTRA_umur,"25 Tahun");
                intentlayout5.putExtra(detaillayout.EXTRA_alamat,"Prancis");


                startActivity(intentlayout5);
            }
        });
    }
}