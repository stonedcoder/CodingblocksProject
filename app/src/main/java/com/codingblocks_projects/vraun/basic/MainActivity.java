package com.codingblocks_projects.vraun.basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main_Activity";

    EditText et;
    EditText et2;
    Button btn ;
    TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         et = (EditText) findViewById(R.id.et1);
         et2 = (EditText) findViewById(R.id.et2);
         btn = (Button) findViewById(R.id.button);
        textview1 = (TextView) findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Submit();
            }
        });


    }
    public void Submit(){
        int a = Integer.valueOf(et.getText().toString());
        int b = Integer.valueOf(et2.getText().toString());

        textview1.setText(String.valueOf(a+b));
    }
}