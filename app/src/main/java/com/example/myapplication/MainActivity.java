package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =(EditText)findViewById(R.id.name);
        pass =(EditText)findViewById(R.id.pass);
    }

    public void Check(View view) {
        String mname ="Hello";
        String mpass ="15pb";
        String user = name.getText().toString().trim();
        String pwd = name.getText().toString().trim();
        if(user.equals(mname) && pwd.equals(mpass)){
            Toast.makeText(this,
                    "恭喜，通过", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,
                    "很遗憾，继续努力", Toast.LENGTH_SHORT).show();
        }
    }
}
