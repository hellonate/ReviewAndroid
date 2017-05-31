package com.example.nate.reviewandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.nate.reviewandroid.R;

public class WelcomeActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button btn_skip;
    private boolean isFirstIn = true;
    private String TAG = "WelcomeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        if (isFirstIn){
            imageView = (ImageView) findViewById(R.id.imageview);
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
            imageView.startAnimation(animation);
            btn_skip = (Button) findViewById(R.id.btn_skip);
            btn_skip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
            isFirstIn = false;
            Log.e(TAG,isFirstIn + "");

        }else{
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }


    }
}
