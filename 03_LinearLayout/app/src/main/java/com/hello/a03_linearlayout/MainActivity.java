package com.hello.a03_linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button btn1 = findViewById( R.id.button1 );
        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Toast.makeText( getApplicationContext(), "hello world", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity( intent );
            }
        } );

        Button btn2 = findViewById( R.id.button2 );
        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Toast.makeText( getApplicationContext(), "이동", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity( intent );
            }
        } );

    }

}