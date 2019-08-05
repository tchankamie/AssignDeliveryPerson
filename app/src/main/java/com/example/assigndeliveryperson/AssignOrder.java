package com.example.assigndeliveryperson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AssignOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_order);

        getIntent();


    }
    public void onClickproceed(View view){
        Intent intent = new Intent(this, ViewOrders.class);
        startActivity(intent);

    }
}
