package com.example.week4lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_relativeLayout);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);


    }

    public void navigateToRelative(View view) {
        log("Not Implemented");
    }
    public void navigateToConstraint(View view) {
        log("Not Implemented");
    }
    public void navigateToGrid(View view) {
        log("Not Implemented");
    }

    private void log(String str){
        Context context = getApplicationContext();
        CharSequence text = str;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}