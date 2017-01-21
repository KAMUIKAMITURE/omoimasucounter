package com.kamiture.kamui.omoimasucounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int omoimasu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        omoimasu = 0;
    }


    public void addomoimasu (View v){
        omoimasu = omoimasu+1;
        textView.setText(omoimasu + "思います！！");
        if (omoimasu == 10){
            Toast toast = Toast.makeText(MainActivity.this, "10思います！！を突破したよ。今日はなかなかキレがいいね", Toast.LENGTH_SHORT);
            toast.show();
        }else if (omoimasu == 20){
            Toast toast = Toast.makeText(MainActivity.this, "20思います！！を突破したよ。今日は珍しく饒舌だね", Toast.LENGTH_SHORT);
            toast.show();
        }else if (omoimasu == 30){
            Toast toast = Toast.makeText(MainActivity.this, "すごい！30思います！！を突破したよ。絶好調だね、結婚相手でも見つかったのかな？", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
