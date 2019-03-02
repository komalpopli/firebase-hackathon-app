package com.example.android.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;



public class SecondActivity extends AppCompatActivity {


    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    private Button logout;
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        gridLayout = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(gridLayout);
        firebaseAuth = FirebaseAuth.getInstance();
    }

   private void setSingleEvent(GridLayout gridLayout) {

        CardView c1=(CardView)gridLayout.getChildAt(0);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this , imageUpload.class ));
            }
        });
       CardView c2=(CardView)gridLayout.getChildAt(1);
       c2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(SecondActivity.this , informg.class ));
           }
       });
       CardView c3=(CardView)gridLayout.getChildAt(2);
       c3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(SecondActivity.this , areaList.class));
           }
       });
       CardView c4=(CardView)gridLayout.getChildAt(3);
       c4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(SecondActivity.this , Heatmap.class));
           }
       });
       CardView c5=(CardView)gridLayout.getChildAt(4);
       c5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Logout();
           }
       });
       CardView c6=(CardView)gridLayout.getChildAt(5);
       c6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(SecondActivity.this , Hospitals.class ));
           }
       });




    }


    private void Logout()
    {

        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this , login.class));

    }


}
