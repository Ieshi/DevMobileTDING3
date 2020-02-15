package com.example.ing3_td2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ING3_TD2";

    Button btLogin;
    EditText etLogin;
    EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = findViewById(R.id.etLogin);
        etPass = findViewById(R.id.etPass);

        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        ContextApp app = (ContextApp) getApplicationContext();
        app.setLogin(etLogin.getText().toString());

        switch (v.getId()) {
            case R.id.btLogin:
                intent = new Intent(this, NewsActivity.class);
                intent.putExtra("login", etLogin.getText().toString());
                startActivity(intent);
                break;
        }
    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "Terminaison de l'activité "+getLocalClassName());
    }
}
