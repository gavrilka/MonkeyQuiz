package me.discgolf.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Level12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        final ImageView img_left = (ImageView)findViewById(R.id.img_left);
        //код который скругляет углы
        img_left.setClipToOutline(true);
        final ImageView img_right = (ImageView)findViewById(R.id.img_right);
        //код который скругляет углы
        img_right.setClipToOutline(true);

        //Развернуть игру на весь экран - начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //Развернуть игру на весь экран - конец
        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (Level12.this, GameLevels.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });
    }
    //системная кнопка "Назад" - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent (Level12.this, GameLevels.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //системная кнопка "Назад" - конец
}
