package com.example.rom.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CAculator extends AppCompatActivity {
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt00, btequal, btplus, btsub, btmul, btdiv, btdot, btcl, btdel, btsq;
    String s = "",s2="",s3;
    TextView t,t1;
    Double a,b,c;
    Integer cout;
    public void update(String s){
        t.setText(s);
    }
    public void update1(String r){
       // if(r.length()>0) {
            t1.setText(r);
        //}
    }
    public Double number(String str){
        Double f=Double.valueOf(str);
        return f;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculator);
        bt0=(Button)findViewById(R.id.button0);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        bt6=(Button)findViewById(R.id.button6);
        bt7=(Button)findViewById(R.id.button7);
        bt8=(Button)findViewById(R.id.button8);
        bt9=(Button)findViewById(R.id.button9);
        bt00=(Button)findViewById(R.id.button00);
        btequal=(Button)findViewById(R.id.buttonequal);
        btplus=(Button)findViewById(R.id.buttonplus);
        btsub=(Button)findViewById(R.id.buttonsub);
        btmul=(Button)findViewById(R.id.buttonmul);
        btdiv=(Button)findViewById(R.id.buttondiv);
        btdot=(Button)findViewById(R.id.buttondot);
        btcl=(Button)findViewById(R.id.buttonclear);
        btdel=(Button)findViewById(R.id.buttondel);
        btsq=(Button)findViewById(R.id.buttonsq);
        t =(TextView)findViewById(R.id.textview1);
        t1 =(TextView)findViewById(R.id.textview2);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt0.getText();
                s2+=bt0.getText();
                update(s);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt1.getText();
                s2+=bt1.getText();
                update(s);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt2.getText();
                s2+=bt2.getText();
                update(s);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt3.getText();
                s2+=bt3.getText();
                update(s);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt4.getText();
                s2+=bt4.getText();
                update(s);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt5.getText();
                s2+=bt5.getText();
                update(s);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt6.getText();
                s2+=bt6.getText();
                update(s);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt7.getText();
                s2+=bt7.getText();
                update(s);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt8.getText();
                s2+=bt8.getText();
                update(s);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt9.getText();
                s2+=bt9.getText();
                update(s);
            }
        });
        bt00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=bt00.getText();
                s2+=bt00.getText();
                update(s);
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=btdot.getText();
                s2+=btdot.getText();
                update(s);
            }
        });
        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=number(s2);
                cout=1;
                s2="";
                s+=btplus.getText();
                update(s);
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=number(s2);
                cout=2;
                s2="";
                s+=btsub.getText();
                update(s);
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=number(s2);
                cout=3;
                s2="";
                s+=btmul.getText();
                update(s);
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=number(s2);
                cout=4;
                s2="";
                s+=btdiv.getText();
                update(s);
            }
        });
        btdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()>0)
                {
                    s=s.substring(0,s.length()-1);
                }
                update(s);
            }
        });
        btcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="";
                s2="";
                s3="";
                update(s);
                update1(s3);
                a=0.0;
                b=0.0;
                c=0.0;
            }
        });
        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=number(s2);
                if(cout==1){
                c=a+b;}
                else if(cout==2){
                    c=a-b;}
                else if(cout==3){
                    c=a*b;}
                else if(cout==4){
                    c=a/b;}
                else if(cout==0){
                    c=b;}
                s3=String.valueOf(c);
                //s3+=rom;
                update1(s3);
            }
        });

    }
}
