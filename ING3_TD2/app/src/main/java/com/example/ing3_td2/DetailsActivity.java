package com.example.ing3_td2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ING3_TD2";

    Button btOk;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        btOk = findViewById(R.id.btOk);
        btOk.setOnClickListener(this);


        ContextApp app = (ContextApp) getApplicationContext();
        String login = app.getLogin();
        tvLogin = findViewById(R.id.tvLogin);
        tvLogin.setText("Bienvenue " + login);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btOk:
                intent = new Intent(this, NewsActivity.class);
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
