package com.fauzi.tugasakb10116021;
//Tanggal Pengerjaan : 12 - Agustus - 2019
//NIM : 10116021
//Nama : Fauzi Anugrah Putra Perkasa
//Kelas : IF-1 / AKB-1

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    Thread thread = new Thread() {
        public void run() {
            try {
                sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }
    };
    thread.start();
    }
}
