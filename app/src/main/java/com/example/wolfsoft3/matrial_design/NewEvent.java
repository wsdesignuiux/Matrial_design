package com.example.wolfsoft3.matrial_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class NewEvent extends AppCompatActivity {


    Spinner sp_car_name2,sp_car_name11,sp_car_name12,sp_car_name13,sp_car_name14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        sp_car_name2 = findViewById(R.id.sp_car_name2);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list = new ArrayList<String>();
        list.add("WSDesign@gmail.com");
        list.add("WSDesign@gmail.com");
        list.add("WSDesign@gmail.com");
        list.add("WSDesign@gmail.com");
        list.add("WSDesign@gmail.com");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(NewEvent.this, R.layout.spinner_item1, R.id.spinner_text, list);
        sp_car_name2.setAdapter(dataAdapter);

        sp_car_name11 = findViewById(R.id.sp_car_name11);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list1 = new ArrayList<String>();
        list1.add("Fri, May 12 2017");
        list1.add("Fri, May 12 2017");
        list1.add("Fri, May 12 2017");
        list1.add("Fri, May 12 2017");
        list1.add("Fri, May 12 2017");

        ArrayAdapter<String> dataAdapter11 = new ArrayAdapter<String>(NewEvent.this, R.layout.spinner_item1, R.id.spinner_text, list1);
        sp_car_name11.setAdapter(dataAdapter11);


        sp_car_name12 = findViewById(R.id.sp_car_name12);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list2 = new ArrayList<String>();
        list2.add("Thu, Jan 26");
        list2.add("Thu, Jan 26");
        list2.add("Thu, Jan 26");
        list2.add("Thu, Jan 26");
        list2.add("Thu, Jan 26");

        ArrayAdapter<String> dataAdapter112 = new ArrayAdapter<String>(NewEvent.this, R.layout.spinner_item1, R.id.spinner_text, list2);
        sp_car_name12.setAdapter(dataAdapter112);

        sp_car_name13 = findViewById(R.id.sp_car_name13);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list3 = new ArrayList<String>();
        list3.add("Fri, May 12 2017");
        list3.add("Fri, May 12 2017");
        list3.add("Fri, May 12 2017");
        list3.add("Fri, May 12 2017");
        list3.add("Fri, May 12 2017");

        ArrayAdapter<String> dataAdapter13 = new ArrayAdapter<String>(NewEvent.this, R.layout.spinner_item1, R.id.spinner_text, list3);
        sp_car_name13.setAdapter(dataAdapter13);

        sp_car_name14 = findViewById(R.id.sp_car_name14);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list4 = new ArrayList<String>();
        list4.add("Thu, Jan 26");
        list4.add("Thu, Jan 26");
        list4.add("Thu, Jan 26");
        list4.add("Thu, Jan 26");
        list4.add("Thu, Jan 26");

        ArrayAdapter<String> dataAdapter14 = new ArrayAdapter<String>(NewEvent.this, R.layout.spinner_item1, R.id.spinner_text, list4);
        sp_car_name14.setAdapter(dataAdapter14);





    }
}
