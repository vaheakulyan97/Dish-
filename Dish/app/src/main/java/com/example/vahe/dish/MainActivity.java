package com.example.vahe.dish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int [] Images = {R.drawable.dish_1,R.drawable.dish_2,R.drawable.dish_3,R.drawable.dish_4,R.drawable.dish_5 };
    String [] Names ={"Bandeja Paisa" ,"Sahhawhana","Colombian Bandeja","Paisa Platter","Onion Curry "};
    String [] Descriptions= {"Salty Dish","Sweet Dish","High Pepper Dish","Low Salt Dish","With Chili Sause" };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView listView = findViewById(R.id.listView);

    CustomAdapter customAdapter= new CustomAdapter();


    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view= getParent().getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView imageView= findViewById(R.id.imageView);
            TextView textView_name= findViewById(R.id.textView_name);
            TextView textView_description= findViewById(R.id.textView_description);

            imageView.setImageResource(Images[i]);
            textView_name.setText(Names[i]);
            textView_description.setText(Descriptions[i]);

            return view;
        }
    }
}
