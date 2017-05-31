package com.example.nate.reviewandroid.activity;

import android.content.Intent;
import android.content.SharedPreferences;
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
    private String TAG = "WelcomeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        SharedPreferences sp = getSharedPreferences("Text",MODE_PRIVATE);
        boolean isCome = sp.getBoolean("isCome",false);

        if (isCome){
            ////如果用户不是第一次进来

                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                    finish();



        }
        //如果没有来过
        imageView = (ImageView) findViewById(R.id.imageview);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                save();
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }


    public void save(){
        SharedPreferences sp = getSharedPreferences("Text",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("isCome",true);
        editor.commit();
    }
}
