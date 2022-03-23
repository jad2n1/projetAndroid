package com.example.projetandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn_Alpes;
    private Button btn_atlantique;
    private Button btn_cotedazur;
    private Button btn_Paris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Alpes = (Button) findViewById(R.id.btn_Alpes);
       btn_Alpes.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openecran2();
           }
       });
    }// regarde à chaque fois qu'on clique sur le bouton
public void openecran2(){
        Intent intent=new Intent(this, ecran2.class);
        startActivity(intent);

    }
}