package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etname;
    EditText etemail;
    EditText etpass;
    RadioButton r1;
    RadioButton r2;
    RadioGroup r;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.login);
        etemail=findViewById(R.id.email);
        etpass=findViewById(R.id.password);
        etname=findViewById(R.id.input_name);
        r1=(RadioButton) findViewById(R.id.F);
        r2=(RadioButton) findViewById(R.id.M);
        r=(RadioGroup) findViewById(R.id.radioGroup);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sex = "";
                if(r1.isChecked())
                {
                    sex="Female";
                }
                else
                {
                    sex="Male";
                }
                int i = r.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) r.findViewById(i);
                final String name = etname.getText().toString();
                final String email = etemail.getText().toString();
                /* String password=etpass.getText().toString(); */
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
                System.out.println("Welcome\n" + "Name: " + name + "\nGender: " + rb.getText().toString() + "\nEmail ID: " + email + "\nCategory: Double O" + "\nTotal Missions : 23");

                Intent intent = new Intent(MainActivity.this, show_data.class);
                intent.putExtra("name", name);
                intent.putExtra("Sex",sex);
                intent.putExtra("Email",email);
                startActivity(intent);


            }


        });

    }
}
