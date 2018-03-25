package com.example.android.restukuatno_1202150015_studycase5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddTodo extends AppCompatActivity {
    //deklarasi variable yang akan digunakan
    EditText ToDo, Description, Priority;
    Database dtbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);
        //set title menjadi add to do
        setTitle("Add To Do");

        //mengakses id edit text pada layout
        ToDo = (EditText) findViewById(R.id.nameTodo);
        Description = (EditText) findViewById(R.id.Descrip);
        Priority = (EditText) findViewById(R.id.rPrior);
        dtbase = new Database(this);
    }

    @Override
    public void onBackPressed() {
        //intent dari add to do menuju list to do
        Intent intent = new Intent(AddTodo.this, TodoList.class);
        //memulai intent
        startActivity(intent);
        //menutup aktivitas setelah intent dijalankan
        this.finish();
    }

    //method yang dijalanan ketika tombol tambah to do di klik
    public void tambah(View view) {
        //apabila data todoname, deskripsi dan prioritas di isi,
        if (dtbase.inputdata(new AddData(ToDo.getText().toString(), Description.getText().toString(), Priority.getText().toString()))){
            //maka akan menampilkan toast bawha data berhasil di tambahkan ke dalam list
            Toast.makeText(this, "Data Telah Ditambahkan ke List!", Toast.LENGTH_SHORT).show();
            //berpindah dari add to do ke list to do
            startActivity(new Intent(AddTodo.this, TodoList.class));
            //menutup aktivitas agar tidak kembali ke activity yang dijalankan setelah intent
            this.finish();
        }else {
            //apabila edit text kosong maka akan muncul toast bahwa tidak bisa menambah ke dalam list
            Toast.makeText(this, "Data Tidak Bisa Ditambahkan ke List", Toast.LENGTH_SHORT).show();
            //set semua edit text menjadi kosong
            ToDo.setText(null);
            Description.setText(null);
            Priority.setText(null);
        }
    }

}

