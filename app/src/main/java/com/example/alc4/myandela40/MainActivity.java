package com.example.alc4.myandela40;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToProfile = (Button) findViewById(R.id.btn_to_profile);
        Button btnToAlc = (Button) findViewById(R.id.btn_to_alc);

        // Link to profile Activity
        btnToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyProfile.class));
            }
        });


        // Link to WebView Activity
        btnToAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AboutALC.class));
            }
        });

    }

    private class MyProfile {
    }
}
