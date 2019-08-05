package com.example.assigndeliveryperson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClickbutton1(View view){
        Intent intent = new Intent(this, AssignOrder.class);
        startActivity(intent);

    }
    public void onClickbutton2(View view){
        Intent intent = new Intent(this,AssignOrder.class);
        startActivity(intent);
    }
    public void onClickbutton3(View view){
        Intent intent = new Intent(this,AssignOrder.class);
        startActivity(intent);
    }
}
