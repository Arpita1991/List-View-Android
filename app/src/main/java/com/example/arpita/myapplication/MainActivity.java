package com.example.arpita.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //http://www.androidinterview.com/android-custom-listview-with-image-and-text-using-arrayadapter/

    ListView list;
    Integer[] imgid={R.mipmap.apple,R.mipmap.grapes,R.mipmap.mango,R.mipmap.orange,R.mipmap.strawberry};
    String[] name ={ "Apple","Grapes","Mango","Orange","Strawberry"};
    String[] price ={ "1.70/lb","1.50/lb","0.56/lb","1.30/lb","3.25/lb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(MainActivity.this,name,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

           @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = name[+position] +" Price : "+price[+position];
                 Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
