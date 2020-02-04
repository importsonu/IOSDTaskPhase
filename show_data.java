package com.example.loginpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class show_data extends AppCompatActivity {

    TextView name,sex,email;
    Button b1,b2,b3;
    TextView tadd,tid,tmis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent=getIntent();

         String sname=intent.getStringExtra("name");
         String ssex=intent.getStringExtra("Sex");
         String semail=intent.getStringExtra("Email");
         //String add="London";

        name=(TextView)findViewById(R.id.tn);
        sex=(TextView)findViewById(R.id.ts);
        email=(TextView)findViewById(R.id.te);
        System.out.println("Welcome\n" + "Name: " + sname + "\nGender: " + ssex + "\nEmail ID: " + semail + "\nCategory: Double O" + "\nTotal Missions : 23");

        name.setText(sname);
        sex.setText(ssex);
        email.setText(semail);
        tadd = findViewById(R.id.badd);
        tid = findViewById(R.id.bid);
        tmis = findViewById(R.id.bmis);
        b1=(Button)findViewById(R.id.badd);
        b2=(Button)findViewById(R.id.bid);
        b3=(Button)findViewById(R.id.bmis);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tadd.setText("London");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tid.setText("007");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(show_data.this);
                builder.setMessage("Are you sure?")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).setNegativeButton("Cancel",null);
                AlertDialog alert=builder.create();
                alert.show();
                tmis.setText("Current mission: Goldfinger");

            }
        });



    }

    public void onBackPressed(){


        AlertDialog.Builder builder=new AlertDialog.Builder(show_data.this);
        builder.setTitle("Exit?")
               .setMessage("Are you sure?")
               .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        show_data.super.onBackPressed();
                    }
                }).setNegativeButton("Cancel",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();

    }


}
