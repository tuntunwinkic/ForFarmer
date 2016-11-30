package com.example.ttwin.forfarmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText phoneNumber, Password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber=(EditText)findViewById(R.id.edtPhoneNumber);
        Password=(EditText)findViewById(R.id.edtPassword);
        btn_login=(Button)findViewById(R.id.btnEnter);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // write to server
                Intent update_intent=new Intent(MainActivity.this,InsertUpdateActivity.class);
                startActivity(update_intent);
            }
        });
    }
}
