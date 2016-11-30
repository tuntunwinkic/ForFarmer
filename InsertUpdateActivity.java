package com.example.ttwin.forfarmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsertUpdateActivity extends AppCompatActivity {

    Button btninsert,btndelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_update);


        btninsert=(Button)findViewById(R.id.btnInsertUpdate);
        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent inserting_intent=new Intent(InsertUpdateActivity.this,InformationActivity.class);
              startActivity(inserting_intent);
            }
        });



        btndelete=(Button)findViewById(R.id.btnDelete);
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    Intent delet_intent=new Intent(InsertUpdateActivity.this,deleteActivity.class);
              //  startActivity(delet_intent);
            }
        });
    }
}
