package com.aylak.biri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Veri tipi ve değişkenler
        int sayi1;
        sayi1 = 27;
        int sayi2= -15;
        int not1 = 77, not2 = 56;
        int ortalama1 = 45, ortalama2;
        ortalama2 = 89;
        int yas;
        yas = 25;
        yas =15;
        double kenar1 = 2.3;

        //Sayı değişkenleri
        System.out.println("sayı1 değişkeninin değeri");
        System.out.println(sayi1);

        System.out.println(sayi2);
        System.out.println("sayı 2 değişkeninin değeri");

        System.out.println("not 1 ve not 2 değeri");
        System.out.println(not1);
        System.out.println(not2);

        System.out.println("ortalama değerleri");
        System.out.println(ortalama1);
        System.out.println(ortalama2);

        System.out.println(yas);
        System.out.println(kenar1);

        char cins1 = 'e', cins2 = 'k';
        String isim = "osman";

        boolean st = false;
        boolean dogrumu = 5 < 11;

        System.out.println(cins1);
        System.out.println(cins2);
        System.out.println(isim);
        System.out.println(st);
        System.out.println(dogrumu);

    }
}