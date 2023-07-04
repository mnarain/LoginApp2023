package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        loadWelcomeMessage();
    }

    private void loadWelcomeMessage() {
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textView = (TextView) findViewById(R.id.welcomeMessage);
        textView.setText(message);
    }

    public void logoutUser(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}