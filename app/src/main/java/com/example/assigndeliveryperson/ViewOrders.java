 package com.example.assigndeliveryperson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

 public class ViewOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);

        getIntent();

    }
     public void onClickbutton5(View view){
         Intent intent = new Intent(this, DeliveryConfomation.class);
         startActivity(intent);

     }
}
