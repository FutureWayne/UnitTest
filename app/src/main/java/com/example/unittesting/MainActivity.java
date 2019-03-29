package com.example.unittesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click(View view){
        View editText = (EditText)this.findViewById(R.id.editText);
        String text = ((EditText) editText).getText().toString();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }




}
