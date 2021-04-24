package com.yvs.listviewvectorpmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list_data extends AppCompatActivity {

    //deklarasi variable
    //penamaan listview dibawah hanya untuk membedakan id di listview di xml saja, boleh menggunakan nama variable lain atau sama dengan id listview di xml
    ListView lv_hari;

    //ArrayList digunakan untuk menampun data hari
    ArrayList hari = new ArrayList(); //atau bisa juga ArrayList tersebut diganti jadi menggunakan Vector

    //ArrayAdapter digunakan untuk mengampun data dalam array
    ArrayAdapter adapter_hari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        //konfigurrasi dari FrontEnd (xml) ke BackEnd (java)
        lv_hari = (ListView)findViewById(R.id.lv_item);

        //membuat constructor ArrayAdapter (dengan 2 parameter)
        //android.R.layout.simple_list_item_1 adalah layout bawaan dari Androi sendiri
        adapter_hari = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, hari);

        //menambahkan data ArrayList menggunakan method Add()
        hari.add("Senin");
        hari.add("Selasa");
        hari.add("Rabu");
        hari.add("Kamis");
        hari.add("Jumat");
        hari.add("Sabtu");
        hari.add("Minggu");

        //mengirim data adapter untuk di tempatkan ke daam list view menggunakan method setAdapter()
        lv_hari.setAdapter(adapter_hari);
    }
}