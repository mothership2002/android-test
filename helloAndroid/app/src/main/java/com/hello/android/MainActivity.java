package com.hello.android;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void onButton1Click( View v ) {
        Toast.makeText( MainActivity.this, "Hello world", Toast.LENGTH_SHORT ).show();
    }

    public void onButton1Clicked( View v ) {
        Intent myIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://m.naver.com" ) );
        startActivity( myIntent );
    }

    public void onButton2Clicked( View v ) {
        Intent myIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "010-1999-1000" ) );
        startActivity( myIntent );
    }

}