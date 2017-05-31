package com.example.nate.reviewandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.nate.reviewandroid.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }
    private  void init(){
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn){
            Intent intent = getIntent();
         //   Bundle bundle =  intent.getBundleExtra("bundle");
            Bundle bundle = intent.getExtras();
            Log.d(TAG,bundle.getString("name"));

            Intent intent2 = new Intent(getBaseContext(),MainActivity.class);
            startActivity(intent2);



        }
    }
}
