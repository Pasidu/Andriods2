package com.example.pasidu.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.example.pasidu.helloworld.VolleyBall.SilkRequestQueue;
import com.example.pasidu.helloworld.repository.UserRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RequestQueue queue = SilkRequestQueue.getInstance(this.getApplicationContext()).
                getRequestQueue();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void HandleLogin(View view) {
        Button btn = (Button) view;
        TextView tv = (TextView) findViewById(R.id.txvUserName);
        tv.setText("You pressed " + btn.getText());
//
//        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//        MainActivity.this.startActivity(intent);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        MainActivity.this.startActivity(intent);

        UserRepository userRepository = new UserRepository(this);

    }

    public void HandleCancel(View view) {
        Button btn = (Button) view;
        TextView tv = (TextView) findViewById(R.id.txvUserName);
        tv.setText("You pressed cancel " + btn.getText());
    }
}
