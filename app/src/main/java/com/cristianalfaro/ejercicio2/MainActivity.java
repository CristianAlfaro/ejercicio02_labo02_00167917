package com.cristianalfaro.ejercicio2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Button red, blue, green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = (Button) findViewById(R.id.red);
        red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                List<Integer> reds = new ArrayList<Integer>();
                reds.add(Color.rgb(100, 0, 0));
                reds.add(Color.rgb(200, 0, 0));
                reds.add(Color.rgb(255, 0, 0));
                reds.add(Color.rgb(50, 0, 0));
                reds.add(Color.rgb(150, 0, 0));
                reds.add(Color.rgb(10, 0, 0));
                int selectedColor = reds.get(5);
                red.setBackgroundColor(selectedColor);
            }
        });


    }
}
