package com.example.watersupply_kathmandu;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.watersupply_kathmandu.API.UserApi;
import com.example.watersupply_kathmandu.Models.OrderModel;
import com.example.watersupply_kathmandu.URL.servercon;

import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewOrder extends AppCompatActivity {


    EditText name,contactno;
    EditText deliverydate;
    EditText  quantity;
    EditText deliverylocation,otherdetails,user_email;
    Button creatorder;
    DatePickerDialog picker;
    UserApi userApi;
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

        deliverydate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    final Calendar cldr = Calendar.getInstance();
                    int day = cldr.get(Calendar.DAY_OF_MONTH);
                    int month = cldr.get(Calendar.MONTH);
                    int year = cldr.get(Calendar.YEAR);
                    // date picker dialog
                    picker = new DatePickerDialog(NewOrder.this,
                            new DatePickerDialog.OnDateSetListener() {
                                @Override
                                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                    deliverydate.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                                }
                            }, year, month, day);
                    picker.show();
                }
            }
        });
        creatorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyInstanceCreater();
                OrderModel orderModel=new OrderModel(
                        name.getText().toString(),contactno.getText().toString(),deliverydate.getText().toString(),
                        Integer.parseInt(quantity.getText().toString()),deliverylocation.getText().toString(),otherdetails.getText().toString(),user_email.getText().toString());
                

            }
        });




    }



    private void MyInstanceCreater(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(servercon.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        userApi = retrofit.create(UserApi.class);
    }
}
