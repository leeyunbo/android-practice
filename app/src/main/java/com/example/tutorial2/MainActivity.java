package com.example.tutorial2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button c = (Button) findViewById(R.id.calButton);
        Button l = (Button) findViewById(R.id.listViewButton);
        Button n = (Button) findViewById(R.id.navButton);

        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CalActivity.class);
                startActivity(intent);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListAlarmActivity.class);
                startActivity(intent);
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NavActivity.class);
                startActivity(intent);
            }
        });

    }


}
