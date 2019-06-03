package com.example.tutorial2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NavActivity extends AppCompatActivity {

    ListView listview = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        final String[] items = {"WHITE", "RED", "GREEN","BLUE","BLACK"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,items);
        // ArrayAdapter(Activity, 데이터를 보여줄 뷰 모양, adapter가 뷰로 만들어줄 데이터)

        listview = (ListView) findViewById(R.id.drawer_menulist);
        listview.setAdapter(adapter); // 리스트 뷰 초기화

        listview.setOnItemClickListener(new ListView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                TextView contentTextview = (TextView) findViewById(R.id.drawer_content);
                switch (position) {
                    case 0 : // WHITE
                        contentTextview.setBackgroundColor(Color.rgb(0xFF, 0xFF, 0xFF)) ;
                        contentTextview.setTextColor(Color.rgb(0x00, 0x00, 0x00)) ;
                        contentTextview.setText("WHITE") ;
                        break ;
                    case 1 : // RED
                        contentTextview.setBackgroundColor(Color.rgb(0xFF, 0x00, 0x00)) ;
                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF)) ;
                        contentTextview.setText("RED") ;
                        break ;
                    case 2 : // GREEN
                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0xFF, 0x00)) ;
                        contentTextview.setTextColor(Color.rgb(0x00, 0x00, 0x00)) ;
                        contentTextview.setText("GREEN") ;
                        break ;
                    case 3 : // BLUE
                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0x00, 0xFF)) ;
                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF)) ;
                        contentTextview.setText("BLUE") ;
                        break ;
                    case 4 : // BLACK
                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0x00, 0x00)) ;
                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF)) ;
                        contentTextview.setText("BLACK") ;
                        break ;
                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
                drawer.closeDrawer(Gravity.LEFT);
            }
        });



    }

}
