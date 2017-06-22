package com.example.mauricio.proyectorecolector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn_nuevo, btn_sincronizar, btn_listar, btn_camara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_nuevo=(Button) findViewById(R.id.bt1);
        btn_nuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this,Nuevo.class);
                startActivity(intent);
            }
        });

        btn_sincronizar=(Button) findViewById(R.id.bt2);
        btn_sincronizar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this,Sincronizar.class);
                startActivity(intent);
            }
        });

        btn_listar=(Button) findViewById(R.id.bt3);
        btn_listar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this,Listar.class);
                startActivity(intent);
            }
        });

        btn_camara=(Button) findViewById(R.id.bt4);
        btn_camara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this,camara.class);
                startActivity(intent);
            }
        });

    }
}
