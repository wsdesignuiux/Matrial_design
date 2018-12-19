package com.example.wolfsoft3.matrial_design;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Collapsing_Contacts extends AppCompatActivity {

    TextView pricetexttoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing__contacts);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Oscar Armer");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
//

    }
}
