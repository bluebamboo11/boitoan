package com.example.blue.baithuchanh03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        Bundle bundle=intent.getBundleExtra("bundle");
        String ketqua=bundle.getString("ketqua");
        TextView text= (TextView) findViewById(R.id.textQ);
               text.setText(ketqua);
        System.out.println("ket qua"+ketqua);
    }
}
