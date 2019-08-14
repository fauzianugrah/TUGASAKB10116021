package com.fauzi.tugasakb10116021;
//Tanggal Pengerjaan : 12 - Agustus - 2019
//NIM : 10116021
//Nama : Fauzi Anugrah Putra Perkasa
//Kelas : IF-1 / AKB-1

import android.content.Context;
import android.content.SharedPreferences;



    public class Session {
        SharedPreferences prefs;
        SharedPreferences.Editor editor;
        Context ctx;

        public Session(Context ctx){
            this.ctx = ctx;
            prefs = ctx.getSharedPreferences("myapp", Context.MODE_PRIVATE);
            editor = prefs.edit();
        }

        public void setLoggedin(boolean logggedin){
            editor.putBoolean("loggedInmode",logggedin);
            editor.commit();
        }

        public boolean loggedin(){
            return prefs.getBoolean("loggedInmode", false);
        }
    }

