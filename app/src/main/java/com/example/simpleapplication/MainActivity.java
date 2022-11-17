package com.example.simpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText title , content ;
    private Spinner option ;
    private Switch swAdd ;
    private TextView textScroll ;
    private Button clear ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get_reference() ;
        show();
        swAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = " " , c = " " , sp = " ";
                t = title.getText().toString();
                c = content.getText().toString();
                sp = option.getSelectedItem().toString() ;
                if (swAdd.isChecked()) {
                    String msg = "The title of todo is :\n" + t + "\nTodo Contents :\n" + c + "The application must remaind you :\n" + sp;
                    textScroll.setText(msg);
                }
                else
                {
                    textScroll.setText("Disapear Info Done ...");
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textScroll.setText("");
            }
        });

    }

    private void show() {


    }
    private  void get_reference ()
    {
        clear = findViewById(R.id.clear);
        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        option = findViewById(R.id.option);
        textScroll = findViewById(R.id.textScroll);
        swAdd = findViewById(R.id.swAdd);

    }
}