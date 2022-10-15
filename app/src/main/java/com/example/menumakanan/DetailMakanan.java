package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    ImageView img_foto;
    TextView txt_nama, txt_deskripsi, txt_harga, txt_sebutan;

    String namaMakanan, deskripsi, harga,sebutan;
    int foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        txt_nama = findViewById(R.id.txt_nama);
        txt_deskripsi = findViewById(R.id.txt_deskripsi);
        txt_harga = findViewById(R.id.txt_harga);
        txt_sebutan = findViewById(R.id.txt_sebutan);
        img_foto = findViewById(R.id.img_foto);

        Bundle bundle =  getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        img_foto.setImageResource(foto);

        getInputExtra();
    }

    private void getInputExtra() {
        namaMakanan = getIntent().getStringExtra("nama");
        deskripsi = getIntent().getStringExtra("deskripsi");
        harga = getIntent().getStringExtra("harga");
        sebutan = getIntent().getStringExtra("sebutan");

        setDataActivity(namaMakanan,deskripsi,harga,sebutan);
    }

    private void setDataActivity(String namaMakanan, String deskripsi, String harga,String sebutan) {
        txt_nama.setText(namaMakanan);
        txt_deskripsi.setText(deskripsi);
        txt_harga.setText(harga);
        txt_sebutan.setText(sebutan);
    }


}