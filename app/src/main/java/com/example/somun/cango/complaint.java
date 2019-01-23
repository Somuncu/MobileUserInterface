package com.example.somun.cango;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class complaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        final EditText mail_adres = (EditText)findViewById(R.id.editText2);
        final EditText mail_konu = (EditText)findViewById(R.id.editText3);
        final EditText mail_icerik = (EditText)findViewById(R.id.editText);

        final Button mail_gonder = (Button)findViewById(R.id.button);

        mail_gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
