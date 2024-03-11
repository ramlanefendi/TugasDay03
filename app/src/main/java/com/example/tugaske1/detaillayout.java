package com.example.tugaske1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detaillayout extends AppCompatActivity {
    TextView tvtitle,tvnama,tvumur,tvalamat;


    public static String EXTRA_TITLE="extra_title";
    public static String EXTRA_nama="extra_nama";
    public static String EXTRA_umur="extra_umur";
    public static String EXTRA_alamat="extra_alamat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaillayout);
        tvtitle=findViewById(R.id.tvtitle);
        tvnama=findViewById(R.id.tvnama);
        tvumur=findViewById(R.id.tvumur);
        tvalamat=findViewById(R.id.tvAlamat);
        tvtitle.setText(getIntent().getStringExtra(EXTRA_TITLE));
        tvnama.setText(getIntent().getStringExtra(EXTRA_nama));
        tvumur.setText(getIntent().getStringExtra(EXTRA_umur));
        tvalamat.setText(getIntent().getStringExtra(EXTRA_alamat));
    }
}