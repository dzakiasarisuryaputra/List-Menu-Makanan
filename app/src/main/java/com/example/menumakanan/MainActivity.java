package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList <Makanan> listMakanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Sushi","Rp. 25.000 ","Susyi atau sushi adalah makanan Jepang yang terdiri dari nasi yang dibentuk bersama lauk berupa makanan laut, daging, sayuran mentah atau sudah dimasak. Nasi susyi mempunyai rasa masam yang lembut karena dibumbui campuran cuka beras, garam, dan gula.",
                "Makanan ikonik jepang ",R.drawable.sushi));
        listMakanan.add(new Makanan("Bakso Bakar","Rp. 10.000 ","Bakso bakar adalah sebuah jenis hidangan bakso yang dibuat dengan cara dibakar dan kemudian ditusuk memakai tusuk sate sebelum akhirnya diberi bumbu. Hidangan tersebut berasal dari kota Malang",
                "Bakso Bakar pedas dan gurih ",R.drawable.bakso));
        listMakanan.add(new Makanan("Rendang","Rp. 20.000 ","Rendang atau randang dalam bahasa Minangkabau adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.",
                "Makanan Khas Minangkabau ",R.drawable.rendang));
        listMakanan.add(new Makanan("Soto Ayam","Rp. 15.000 ","Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan. Warna kuning ini dikarenakan oleh kunyit yang digunakan sebagai bumbu. Soto ayam banyak ditemukan di daerah-daerah di Indonesia dan Singapura.",
                "Soto Ayam dengan bumbu yang khas ",R.drawable.soto));
        listMakanan.add(new Makanan("Mie Kuah","Rp. 18.000 ","Mie rebus/Mi rebus atau mee rebus adalah sebuah hidangan mi kuah dari Asia Tenggara, yang dikenal di Indonesia, Malaysia, dan Singapura. Hidangan tersebut juga biasa disebut mie kuah.",
                "Bakmi Kuah Yang Gurih dan Lezat ",R.drawable.miekuah));
        listMakanan.add(new Makanan("Sate","Rp. 20.000 ","Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate.",
                "Sate Ayam Dengan Bumbu Kacang ",R.drawable.sate));
        listMakanan.add(new Makanan("Bubur Ayam","Rp. 15.000 ","Bubur ayam adalah salah satu jenis makanan dari Indonesia. Bubur nasi adalah beras yang dimasak dengan air yang banyak sehingga memiliki tekstur yang lembut dan berair. Bubur biasanya disajikan dalam suhu panas atau hangat",
                "Bubur dengan Suiran Ayam Untuk Sarapan ",R.drawable.bubur));
    }





}