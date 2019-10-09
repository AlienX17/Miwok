package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);

        // todo: For consistency, you should set the OnClickListener in the same way as you did for
        //  family, color and phrases.
        //Set a clicklistener to that view
        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //Create a new intent to open the NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);

                //Start the new activity
                startActivity(numbersIntent);

            }
        });
    }

    public void openFamilyList(View view){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }
    public void openColorsList(View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
    public void openPhrasesList(View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

}
