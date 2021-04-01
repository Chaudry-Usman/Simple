package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Fourth extends AppCompatActivity {
EditText t1,t2,t3,t4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

    }

    public void sign(View view) {


        t1=findViewById(R.id.q3);
        t2=findViewById(R.id.q4);
        t3=findViewById(R.id.q5);
        t4=findViewById(R.id.q6);

        String name=t1.getText().toString();
        String user=t2.getText().toString();

        String email=t3.getText().toString();
        String pass=t4.getText().toString();


        data obj=new data(user,email,pass);

        FirebaseDatabase yes= FirebaseDatabase.getInstance();
        DatabaseReference root= yes.getReference("Customers");
        root.child(name).setValue(obj);





        Toast.makeText(this, "Account has been Created", Toast.LENGTH_SHORT).show();

    }



}