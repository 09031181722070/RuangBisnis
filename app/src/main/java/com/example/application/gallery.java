package com.example.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

    public void submitMurobbi(View view) {

        EditText tanggalField = (EditText) findViewById(R.id.rencana);
        String rencana = tanggalField.getText().toString();

        EditText aField = (EditText) findViewById(R.id.nama);
        String nama = aField.getText().toString();

        EditText bField = (EditText) findViewById(R.id.jenis);
        String jenis = bField.getText().toString();

        EditText clField = (EditText) findViewById(R.id.nama_penyusun);
        String nama_penyusun = clField.getText().toString();

        EditText dField = (EditText) findViewById(R.id.alamat);
        String alamat = dField.getText().toString();

        EditText edField = (EditText) findViewById(R.id.kebutuhan);
        String kebutuhan = edField.getText().toString();


        String PriceMessage = createAmalYaumiSumary(rencana, nama, jenis, nama_penyusun, alamat, kebutuhan);
        //displayMessage(PriceMessage);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.Amal_yaumi_for) + "  " + rencana);
        intent.putExtra(Intent.EXTRA_TEXT, PriceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private String createAmalYaumiSumary(String rencana, String nama, String jenis, String nama_penyusun, String alamat, String kebutuhan){
        String AmalMessage= getString(R.string.tanggal)+":  " + rencana ;
        AmalMessage +="\n"+getString(R.string.mengerjakan_sholat_magrib)+ " : "+rencana;
        AmalMessage +="\n"+ getString(R.string.mengerjakan_sholat_isya) +": "+ nama;
        AmalMessage +="\n"+ getString(R.string.mengerjakan_sholat_subuh)+": "+ jenis;
        AmalMessage +="\n"+getString(R.string.mengerjakan_sholat_dzuhur)+": "+ nama_penyusun;
        AmalMessage +="\n"+ getString(R.string.mengerjakan_sholat_ashar)+": " + alamat;
        AmalMessage +="\n"+ getString(R.string.mengerjakan_sholat_ashar)+": " + kebutuhan;

        return AmalMessage;
    }


}
