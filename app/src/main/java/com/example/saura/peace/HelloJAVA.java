package com.example.saura.peace;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloJAVA extends AppCompatActivity {

Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        btn = (Button) findViewById(R.id.button);
    }


    public void openNew(View view) {
        Intent intent = new Intent(this, PlayAudio.class);
        startActivity(intent);
    }
}
