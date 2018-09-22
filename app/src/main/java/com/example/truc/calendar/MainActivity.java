package com.example.truc.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText input;
    TextView ketqua;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    //
    Button add;
    Button sub;
    Button multi;
    Button div;
    //
    Button comma;
    Button clear;
    Button clearAll;
    Button equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        SetOnClick();

    }

    private void SetOnClick() {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button9.setOnClickListener(this);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);

        comma.setOnClickListener(this);
        clear.setOnClickListener(this);
        clearAll.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    private void Anhxa() {
        input = (EditText)findViewById(R.id.input);
        ketqua= (TextView)findViewById(R.id.result);
        button0 =(Button)findViewById(R.id.button0);
        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.button5);
        button6 =(Button)findViewById(R.id.button6);
        button7 =(Button)findViewById(R.id.button7);
        button8 =(Button)findViewById(R.id.button8);
        button9 =(Button)findViewById(R.id.button9);

        add     =(Button)findViewById(R.id.add);
        sub     =(Button)findViewById(R.id.sub);
        sub     =(Button)findViewById(R.id.sub);
        multi    =(Button)findViewById(R.id.multi);
        div     =(Button)findViewById(R.id.div);

        comma   = (Button)findViewById(R.id.comma);
        clear   = (Button)findViewById(R.id.clear);
        clearAll  = (Button)findViewById(R.id.clearAll);
        equal   = (Button)findViewById(R.id.equal);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:
                //code here
                input.append("0");
                break;
            case R.id.button1:
                //code here
                input.append("1");
                break;
            case R.id.button2:
                //code here
                input.append("2");
                break;
            case R.id.button3:
                //code here
                input.append("3");
                break;
            case R.id.button4:
                //code here
                input.append("4");
                break;
            case R.id.button5:
                //code here
                input.append("5");
                break;
            case R.id.button6:
                //code here
                input.append("6");
                break;
            case R.id.button7:
                //code here
                input.append("7");
                break;
            case R.id.button8:
                //code here
                input.append("8");
                break;
            case R.id.button9:
                //code here
                input.append("9");
                break;
            case R.id.add:
                //code here
                input.append("+");
                break;
            case R.id.sub:
                //code here
                input.append("-");
                break;
            case R.id.multi:
                //code here
                input.append("*");
                break;
            case R.id.div:
                //code here
                input.append("/");
                break;
            case R.id.comma:
                //code here
                input.append(".");
                break;
            case R.id.clear:
                //code here
                BaseInputConnection text = new BaseInputConnection(input,true);
                text.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
                break;
            case R.id.clearAll:
                //code here
                input.setText("");
                break;
            case R.id.equal:
                //code here
                ketqua.setText("notfinish");
//                addOperation(input.getText().toString());
//                addNumber(input.getText().toString());
//                Toast.makeText(this, ""+arrNumber.get(0), Toast.LENGTH_SHORT).show();
//                double result=0;
//                for(int i=0;i<arrOperation.size();i++){
//                    switch (arrOperation.get(i)){
//                        case "+":
//                            if(i==0){
//                                result=arrNumber.get(i)+arrNumber.get(i+1);
//                            }else {
//                                result += arrNumber.get(i+1);
//                            }
//                            break;
//                        case "-":
//                            if(i==0){
//                                result=arrNumber.get(i)-arrNumber.get(i+1);
//                            }else {
//                                result -= arrNumber.get(i+1);
//                            }
//                            break;
//                        case "*":
//                            if(i==0){
//                                result=arrNumber.get(i)*arrNumber.get(i+1);
//                            }else {
//                                result *= arrNumber.get(i+1);
//                            }
//                            break;
//                        case "/":
//                            if(i==0){
//                                result=arrNumber.get(i)/arrNumber.get(i+1);
//                            }else {
//                                result /= arrNumber.get(i+1);
//                            }
//                            break;
//
//                    }
//                }
//                for(int i=0;i<arrOperation.size();i++){
//                    Toast.makeText(this, arrOperation.get(i)+"", Toast.LENGTH_SHORT).show();
//                }
//                Toast.makeText(this, arrOperation.get(0)+"", Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, arrNumber.get(0)+arrNumber.get(1)+"", Toast.LENGTH_SHORT).show();
//                ketqua.setText(result+"");






        }


    }
    //Mang chua cac phep tinh +,-,*,/
    public ArrayList<String> arrOperation;
    //Mang chua cac so
    public ArrayList<Double> arrNumber;
    //Lay tat ca cac phep tinh dua vao operation
    public void addOperation(String input){
        arrOperation = new ArrayList<>();
        char[]cArr=input.toCharArray();
        int len=cArr.length;
        for(int i=0;i<len;i++){
            switch (cArr[i]){
                case '+':
                    arrOperation.add(cArr[i]+"");
                    break;
                case '-':
                    arrOperation.add(cArr[i]+"");
                    break;
                case '*':
                    arrOperation.add(cArr[i]+"");
                    break;
                case '/':
                    arrOperation.add(cArr[i]+"");
                    break;

                default:
                    break;

            }
        }
    }
    //Lay tat ca cac so luu vao mang arrNumber
    public void addNumber(String stringInput){
        arrNumber = new ArrayList<>();
        Pattern regex = Pattern.compile("(d+(?:\\.\\d+)?)");
        Matcher matcher=regex.matcher(stringInput);
        while (matcher.find()){
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }
    }

}