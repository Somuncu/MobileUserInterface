package com.example.somun.cango;

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

        Button butt2 = (Button)findViewById(R.id.button2);
        Button butt3 = (Button)findViewById(R.id.button3);
        Button butt4 = (Button)findViewById(R.id.button4);
        Button butt5 = (Button)findViewById(R.id.button5);
        Button butt6 = (Button)findViewById(R.id.button6);

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1= new Intent(MainActivity.this,comments.class);
                startActivity(int1);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1= new Intent(MainActivity.this,complaint.class);
                startActivity(int1);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1= new Intent(MainActivity.this,rate.class);
                startActivity(int1);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1= new Intent(MainActivity.this,alert.class);
                startActivity(int1);
            }
        });
    }
}
