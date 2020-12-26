package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addClick(View v) // 버튼이 발생한 뷰 참조
    {
        EditText number1 = (EditText) findViewById(R.id.number1); //앱 실행중 editText의 텍스트 변경
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString()); //정수형 받기,정수로 저장(pareseint)
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1+n2));

    }
    public void subClick(View v) // 버튼이 발생한 뷰 참조
    {
        EditText number1 = (EditText) findViewById(R.id.number1); //앱 실행중 editText의 텍스트 변경
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString()); //정수형 받기,정수로 저장(pareseint)
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1-n2));

    }
    public void divClick(View v) // 버튼이 발생한 뷰 참조
    {
        EditText number1 = (EditText) findViewById(R.id.number1); //앱 실행중 editText의 텍스트 변경
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString()); //정수형 받기,정수로 저장(pareseint)
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1/n2));

    }
    public void mulClick(View v) // 버튼이 발생한 뷰 참조
    {
        EditText number1 = (EditText) findViewById(R.id.number1); //앱 실행중 editText의 텍스트 변경
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString()); //정수형 받기,정수로 저장(pareseint)
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1*n2));

    }
}
