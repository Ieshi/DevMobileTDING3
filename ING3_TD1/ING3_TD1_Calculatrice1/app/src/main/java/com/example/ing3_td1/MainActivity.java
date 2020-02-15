package com.example.ing3_td1;

import android.os.Bundle;

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
    private EditText num2;
    private TextView tvResAdd;
    private TextView tvResMin;
    private TextView tvResMult;
    private TextView tvResDiv;
    private Button equalsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.inNumb1);
        num2 = (EditText) findViewById(R.id.inNumb2);
        tvResAdd = (TextView) findViewById(R.id.tvResAdd);
        tvResMin = (TextView) findViewById(R.id.tvResMin);
        tvResMult = (TextView) findViewById(R.id.tvResMult);
        tvResDiv = (TextView) findViewById(R.id.tvResDiv);

        equalsButton = (Button) findViewById(R.id.equalsButton);

    }

    public void equals(View v){

        int num1Int = 0;
        int num2Int = 0;

        if(num1.getText().length() != 0){
            num1Int = Integer.parseInt(num1.getText().toString());
        }
        if(num2.getText().length() != 0){
            num2Int = Integer.parseInt(num2.getText().toString());
        }

        Toast.makeText(MainActivity.this,"num1 " + num1Int + " num2 " + num2Int, Toast.LENGTH_LONG).show();


        int resAdd = num1Int + num2Int;
        tvResAdd.setText(Integer.toString(resAdd));

        int resMin = num1Int - num2Int;
        tvResMin.setText(Integer.toString(resMin));

        int resMult = num1Int * num2Int;
        tvResMult.setText(Integer.toString(resMult));

        int resDiv = num1Int / num2Int;
        tvResDiv.setText(Integer.toString(resDiv));

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
