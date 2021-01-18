package com.example.android.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView itemOne = findViewById(R.id.menu_item_1);
        Log.v("MainActivity.java", itemOne.getText().toString());

        // Find second menu item TextView and print the text to the logs
        TextView itemTwo = findViewById(R.id.menu_item_2);
        Log.v("MainActivity.java", itemTwo.getText().toString());

        // Find third menu item TextView and print the text to the logs
        TextView itemThree = findViewById(R.id.menu_item_3);
        Log.v("MainActivity.java", String.valueOf(itemThree.getText()));

    }
}