package com.aylak.biri;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Operatorler extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("test");

        //Aritmetiksel Operatörler
        /*
            = -> atama operatörü
            + -> toplama
            - -> çıkarma
            * -> çarpma
            / -> bölme
            ++ -> bir artıma
            -- -> bir eksiltme
         */
        int sayi1 = 5, sayi2 = 19, toplam;
        toplam = sayi1 + sayi2;
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(toplam);

        int yas = 33;
        System.out.println(yas - 11);
        yas = yas + 20;
        System.out.println(yas);
        yas = yas - 8;
        System.out.println(yas);

        float vize = 36.4f, ffinal = 52.7f, sonuc;
        sonuc = vize + ffinal;
        System.out.println(sonuc);
        vize += 10;
        ffinal -= 5;
        sonuc = vize + ffinal;
        System.out.println(sonuc);

        int s1 =150, s2 =5, sonuc3;
        sonuc3 = s1 * s2;
        System.out.println(sonuc3);

        sonuc3 = s1 / s2;
        System.out.println(sonuc3);

        sonuc3 *= 2;
        System.out.println(sonuc3);

        sonuc3 /= 4;
        System.out.println(sonuc3);

        String ad = "Ali", soyad = "Kutlu";
        System.out.println("Adınız= " + (ad + " " + soyad));
        System.out.println("Yaşınız= " + yas);
    }
}
