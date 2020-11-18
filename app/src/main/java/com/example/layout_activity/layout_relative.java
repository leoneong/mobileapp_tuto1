package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;


public class layout_relative extends AppCompatActivity {
    private Button button;
    EditText name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_relative);

        button = (Button) findViewById(R.id.btn_backtohome);
        name1=(EditText) findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示方式声明Intent，直接启动SecondActivity
                Intent intent = new Intent();
                intent.putExtra("name",name1.getText().toString());
                setResult(RESULT_OK, intent);
                finish();


            }
        });
    }
}