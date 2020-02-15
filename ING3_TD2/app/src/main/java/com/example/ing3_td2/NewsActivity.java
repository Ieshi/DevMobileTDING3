package com.example.ing3_td2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity implements View.OnClickListener  {

    private static final String TAG = "ING3_TD2";
    Button btDetails;
    Button btLogOut;
    Button btAbout;
    TextView tvLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Intent intent = getIntent();
        String login = intent.getStringExtra("login");

        tvLogin = findViewById(R.id.tvLogin);
        tvLogin.setText("Bienvenue " + login);

        btDetails = findViewById(R.id.btDetails);
        btDetails.setOnClickListener(this);

        btLogOut = findViewById(R.id.btLogOut);
        btLogOut.setOnClickListener(this);

        btAbout = findViewById(R.id.btAbout);
        btAbout.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btLogOut:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btDetails:
                intent = new Intent(this, DetailsActivity.class);
                startActivity(intent);
                break;
            case R.id.btAbout:
                String url = "http://android.busin.fr/";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "Terminaison de l'activité "+getLocalClassName());
    }
}
