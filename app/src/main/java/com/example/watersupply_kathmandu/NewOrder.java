package com.example.watersupply_kathmandu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

public class NewOrder extends AppCompatActivity {


    EditText name,contactno;
    DatePicker deliverydate;
    EditText  quantity;
    EditText deliverylocation,otherdetails,user_email;
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





    }
}
