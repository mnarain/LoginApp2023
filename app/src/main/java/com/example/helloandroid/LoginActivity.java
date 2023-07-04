package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginUser(View view) {
        EditText username = (EditText) findViewById(R.id.username);
        String usernameValue = String.valueOf(username.getText());

        EditText password = (EditText) findViewById(R.id.password);
        String passwordValue = String.valueOf(password.getText());

        String notification = "";

        if (usernameValue.isEmpty() || passwordValue.isEmpty()) {
            notification = "Het inloggen is mislukt. Vul a.u.b. eerst een gebruikersnaam en wachtwoord in.";
        } else if (usernameValue.equals("admin") && passwordValue.equals("admin")) {
            loadDashboardActivity(usernameValue);
        } else {
            notification = "Het inloggen is mislukt. Vul a.u.b. de correcte gebruikersnaam en wachtwoord in.";
        }
        Toast.makeText(this, notification, Toast.LENGTH_LONG).show();
    }

    public void loadDashboardActivity(String username) {
        Intent intent = new Intent(this, DashboardActivity.class);
        String welcomeMessage = "Welcome " + username;
        intent.putExtra("message", welcomeMessage);
        intent.putExtra("message2", 404);
        startActivity(intent);
    }
}