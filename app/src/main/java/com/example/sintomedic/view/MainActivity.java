package com.example.sintomedic.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Redirección al Login
        if (true) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }
        //setContentView(R.layout.activity_main);

        /*startActivity(new Intent(this, MainDoctorActivity.class));
        finish();
*/

    }
}
