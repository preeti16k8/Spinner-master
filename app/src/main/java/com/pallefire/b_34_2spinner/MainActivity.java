package com.pallefire.b_34_2spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button bt1,bt2;
    Spinner sp1,sp2;
    ArrayList<String> al = new ArrayList<String>();
    ArrayList<String> al1 = new ArrayList<String>();
    ArrayAdapter<String>aa;
    ArrayAdapter<String>aa1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        sp1 = (Spinner) findViewById(R.id.sp1);
        sp2 = (Spinner) findViewById(R.id.sp2);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        aa1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al1);
        sp1.setAdapter(aa);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Try Agai", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        sp2.setAdapter(aa1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et1.getText().toString();
                al.add(str);
            }
        });
    }

}
