package com.example.controlcenter;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Information extends AppCompatActivity {
    Toolbar tb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valuelayout);

        tb = findViewById(R.id.tb_main);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle("                AUTOFARM");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);


    }
}
