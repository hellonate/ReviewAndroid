package com.example.nate.reviewandroid.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.nate.reviewandroid.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    private Button btn_exit;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        init();
    }
    private void init(){
        btn = (Button) findViewById(R.id.btn);
        btn_exit = (Button) findViewById(R.id.btn_exit);
        btn.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("name","张三");
            intent.putExtras(bundle);
            //   intent.putExtra("bundle",bundle);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn_exit){
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("提示");
            dialog.setIcon(R.mipmap.ic_launcher);
            dialog.setMessage("您确定要退出吗？");
            dialog.setPositiveButton("确定！", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "确定退出？", Toast.LENGTH_SHORT).show();
                }
            });
            dialog.setNegativeButton("取消?", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            dialog.create();
            dialog.show();



        }
    }

}
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG,"onStart");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(TAG,"onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG,"onDestroy");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//          Log.d(TAG,"onPause");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(TAG,"onResume");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d(TAG,"onRestart");
//    }
