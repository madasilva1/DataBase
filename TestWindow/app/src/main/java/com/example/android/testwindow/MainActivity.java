package com.example.android.testwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the MyActivity category
        TextView floor = (TextView) findViewById(R.id.floor);
        // Set a click listener on that View
        floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creat a new Intent to open the {@link FloorActivity}

                Intent FloorActivity = new Intent(MainActivity.this, FloorActivity.class);
                startActivity(FloorActivity);
                // Toast.makeText(getApplicationContext(),"MainActivity java",Toast.LENGTH_SHORT).show();
            }

        });
        // Find the View that shows the DataActivity category
        TextView data = (TextView) findViewById(R.id.data);
        // Set a click listener on that View
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creat a new Intent to open the {@link DataActivity}

                Intent DataActivity = new Intent(MainActivity.this,DataActivity.class);
                startActivity(DataActivity);
                // Toast.makeText(getApplicationContext(),"MainActivity java",Toast.LENGTH_SHORT).show();
            }

        });
    }

}

