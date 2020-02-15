package com.example.ing3_td1_calculatricechaine;

import android.os.Bundle;

import com.example.ing3_td1_calculatricechaine.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private TextView tvRes;

    private int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.inNumb1);
        tvRes = (TextView) findViewById(R.id.tvRes);

    }

    public void equals(View v){
        tvRes.setText(Integer.toString(result));
    }

    public void raz(View v){
        tvRes.setText("");
        num1.setText("");
        result = 0;
        Toast.makeText(MainActivity.this, "Remise à zéro !", Toast.LENGTH_LONG).show();
    }

    public void add(View v){
        int num1Int = 0;
        int num2Int = 0;

        if(num1.getText().length() != 0){
            num1Int = Integer.parseInt(num1.getText().toString());
        }

        result += num1Int;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
