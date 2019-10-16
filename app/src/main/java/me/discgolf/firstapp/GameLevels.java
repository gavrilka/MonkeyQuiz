package me.discgolf.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);
        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, MainActivity.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });

        //Кнопка для перехода на 1 уровень - начало
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level1.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 1 уровень - конец

        //Кнопка для перехода на 2 уровень - начало
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level2.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 2 уровень - конец
        //Кнопка для перехода на 3 уровень - начало
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level3.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 3 уровень - конец
        //Кнопка для перехода на 4 уровень - начало
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level4.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 4 уровень - конец
        //Кнопка для перехода на 5 уровень - начало
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level5.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 5 уровень - конец
        //Кнопка для перехода на 6 уровень - начало
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level6.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 6 уровень - конец
        //Кнопка для перехода на 7 уровень - начало
        TextView textView7 = (TextView)findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level7.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 7 уровень - конец
        //Кнопка для перехода на 8 уровень - начало
        TextView textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level8.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 8 уровень - конец
        //Кнопка для перехода на 9 уровень - начало
        TextView textView9 = (TextView)findViewById(R.id.textView2);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level9.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 9 уровень - конец
        //Кнопка для перехода на 10 уровень - начало
        TextView textView10 = (TextView)findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level10.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 10 уровень - конец
        //Кнопка для перехода на 11 уровень - начало
        TextView textView11 = (TextView)findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this, Level11.class);
                    startActivity(intent);finish();

                }catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 1 уровень - конец

    }
    //системная кнопка "Назад" - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent (GameLevels.this, MainActivity.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //системная кнопка "Назад" - конец
}
