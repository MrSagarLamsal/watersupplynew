package com.example.watersupply_kathmandu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class NewOrder extends AppCompatActivity {


    EditText name,contactno;
    DatePicker deliverydate;
    EditText  quantity;
    EditText deliverylocation,otherdetails,user_email;
    Button creatorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
        name=findViewById(R.id.txt_OrderName);
        contactno=findViewById(R.id.txt_OrderContactNo);
        deliverydate=findViewById(R.id.txt_OrderDate);
        deliverylocation=findViewById(R.id.txt_OrderLocation);
        otherdetails=findViewById(R.id.txt_OrderDetails);
        user_email=findViewById(R.id.txt_OrderEmail);
        creatorder=findViewById(R.id.button_Orderit);
        creatorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}
