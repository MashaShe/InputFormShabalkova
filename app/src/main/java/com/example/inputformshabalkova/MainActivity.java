package com.example.inputformshabalkova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText entName = findViewById(R.id.editTextTextPersonName);
        final EditText entEmail = findViewById(R.id.editTextTextEmailAddress);

        Button okbutton = findViewById(R.id.ok_button);
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = entName.getText().toString();
                final String email = entEmail.getText().toString();
                Toast toast = Toast.makeText(MainActivity.this,
                        "Подписка на рассылку успешно оформлена для пользователя " + name + " на электронный адрес " + email, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button clearbutton = findViewById(R.id.clear_button);
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entName.getText().clear();
                entEmail.getText().clear();
            }
        });
    }

    //Создать кнопку "ОК", при нажатии на которую в текстовое поле будет попадать текст: "Подписка на рассылку успешно оформлена для пользователя <Имя пользователя из поля> на электронный адрес <Email из формы>"
    //Создать кнопку "Очистить", которая будет очищать форму (оба поля ввода) и удалять текст из текстового поля с результатом
}