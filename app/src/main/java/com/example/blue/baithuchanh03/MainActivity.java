package com.example.blue.baithuchanh03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tt = (Button) findViewById(R.id.button2);


        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nam = (EditText) findViewById(R.id.editText);
                EditText nu = (EditText) findViewById(R.id.editText2);
                final String snam = nam.getText().toString();
                final String snu = nu.getText().toString();
                if (snam.equals("") || snu.equals("")) {
                    Toast.makeText(MainActivity.this, "Thiếu tên Nam hoặc Nữ", Toast.LENGTH_LONG).show();
                } else {
                    BoiToan boi = new BoiToan(snam, snu);
                    TextView so = (TextView) findViewById(R.id.textSo);
                    boi.ketQua();
                    int a = boi.tinhPhanTram();
                    so.setText(Integer.toString(a) + "%");
                }

            }
        });
        Button kq = (Button) findViewById(R.id.button);

        kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nam = (EditText) findViewById(R.id.editText);
                EditText nu = (EditText) findViewById(R.id.editText2);
                final String snam = nam.getText().toString();
                final String snu = nu.getText().toString();
                BoiToan boi = new BoiToan(snam, snu);
                String ketqua = boi.ketQua();
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ketqua", ketqua);
                intent.putExtra("bundle", bundle);
                nam.setText("");
                nu.setText("");
                nam.setHint(snam);
                nu.setHint(snu);
                startActivity(intent);

            }
        });
    }
}
