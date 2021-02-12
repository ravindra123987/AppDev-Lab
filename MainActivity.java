package com.practise.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,be,br,bc,bp;
    EditText txt;
    String s="",str="",p="";
    float v1,v2,res;
    float f;
    char op='$';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.v1);
        b2=findViewById(R.id.v2);
        b3=findViewById(R.id.v3);
        b4=findViewById(R.id.v4);
        b5=findViewById(R.id.v5);
        b6=findViewById(R.id.v6);
        b7=findViewById(R.id.v7);
        b8=findViewById(R.id.v8);
        b9=findViewById(R.id.v9);
        b0=findViewById(R.id.v0);
        ba=findViewById(R.id.vadd);
        bs=findViewById(R.id.vsub);
        bm=findViewById(R.id.vmult);
        bd=findViewById(R.id.vdiv);
        br=findViewById(R.id.reset);
        be=findViewById(R.id.vresult);
        txt=findViewById(R.id.result);
        bc=findViewById(R.id.vclear);
        bp=findViewById(R.id.vpoint);


        b1.setOnClickListener((View.OnClickListener) MainActivity.this);
        b2.setOnClickListener((View.OnClickListener) MainActivity.this);
        b3.setOnClickListener((View.OnClickListener) MainActivity.this);
        b4.setOnClickListener((View.OnClickListener) MainActivity.this);
        b5.setOnClickListener((View.OnClickListener) MainActivity.this);
        b6.setOnClickListener((View.OnClickListener) MainActivity.this);
        b7.setOnClickListener((View.OnClickListener) MainActivity.this);
        b8.setOnClickListener((View.OnClickListener) MainActivity.this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        ba.setOnClickListener(this);
        bs.setOnClickListener((View.OnClickListener) MainActivity.this);
        bm.setOnClickListener((View.OnClickListener) MainActivity.this);
        bd.setOnClickListener((View.OnClickListener) MainActivity.this);
        br.setOnClickListener((View.OnClickListener) MainActivity.this);
        be.setOnClickListener((View.OnClickListener) MainActivity.this);
        bc.setOnClickListener(this);
        bp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.v1:
                s=txt.getText().toString();
                s=s+"1";
                txt.setText(s);
                break;
            case R.id.v2:
                s=txt.getText().toString();
                s=s+"2";
                txt.setText(s);
                break;
            case R.id.v3:
                s=txt.getText().toString();
                s=s+"3";
                txt.setText(s);
                break;
            case R.id.v4:
                s=txt.getText().toString();
                s=s+"4";
                txt.setText(s);
                break;
            case R.id.v5:
                s=txt.getText().toString();
                s=s+"5";
                txt.setText(s);
                break;
            case R.id.v6:
                s=txt.getText().toString();
                s=s+"6";
                txt.setText(s);
                break;
            case R.id.v7:
                s=txt.getText().toString();
                s=s+"7";
                txt.setText(s);
                break;
            case R.id.v8:
                s=txt.getText().toString();
                s=s+"8";
                txt.setText(s);
                break;
            case R.id.v9:
                s=txt.getText().toString();
                s=s+"9";
                txt.setText(s);
                break;
            case R.id.v0:
                s=txt.getText().toString();
                s=s+"0";
                txt.setText(s);
                break;
            case R.id.vpoint:
                s=txt.getText().toString();
                s=s+".";
                txt.setText(s);
                break;
            case R.id.vadd:
                if(op!='$'){
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(txt.getText().toString().matches("")) {
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    txt.setText("");
                    return;
                }
                s=txt.getText().toString();
                v1=Float.parseFloat(s);
                s=s+"+";
                op='+';
                txt.setText(s);
                break;
            case R.id.vsub:
                if(op!='$'){
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(txt.getText().toString().matches("")) {
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    txt.setText("");
                    return;
                }
                s=txt.getText().toString();
                v1=Float.parseFloat(s);
                s=s+"-";
                op='-';
                txt.setText(s);
                break;
            case R.id.vmult:
                if(op!='$'){
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(txt.getText().toString().matches("")) {
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    txt.setText("");
                    return;
                }
                s=txt.getText().toString();
                v1=Float.parseFloat(s);
                s=s+"*";
                op='*';
                txt.setText(s);
                break;
            case R.id.vdiv:
                if(op!='$'){
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(txt.getText().toString().matches("")) {
                    Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show();
                    txt.setText("");
                    return;
                }
                s=txt.getText().toString();
                v1=Float.parseFloat(s);
                s=s+"/";
                op='/';
                txt.setText(s);
                break;
            case R.id.reset:
                txt.setText("");
                op='$';
                v1=-1;
                break;
            case R.id.vclear:
                s=txt.getText().toString();
                int m=s.length();
                if(m==0)
                    return;
                if(s.charAt(m-1)=='+' ||s.charAt(m-1)=='-' ||s.charAt(m-1)=='*' ||s.charAt(m-1)=='/'){
                    txt.setText(s.substring(0,m-1));
                    reset();
                }
                else{
                    if(m==1)
                        txt.setText("");
                    else
                    txt.setText(s.substring(0,m-1));
                }
                break;
            case R.id.vresult:
                if(v1!=-10000 && op!='$'){
                    s=txt.getText().toString();
                    int index=s.indexOf(op);
                    if(index==s.length()-1){
                        Toast.makeText(this,"Enter valid credentials",Toast.LENGTH_SHORT).show();
                        txt.setText("");
                        reset();
                    }
                    else {
                        str = s.substring(index + 1);
                        v2=Float.parseFloat(str);
                        if(op=='+'){
                            res=v1+v2;
                            txt.setText(String.valueOf(res));
                            reset();;
                        }
                        else if(op=='-'){
                            res=v1-v2;
                            txt.setText(String.valueOf(res));
                            reset();
                        }
                        else if(op=='*'){
                            res=v1*v2;
                            txt.setText(String.valueOf(res));
                            reset();
                        }
                        else if(op=='/'){
                            if(v2==0){
                                Toast.makeText(this,"Division with zero is not defined",Toast.LENGTH_SHORT).show();
                                reset();
                                txt.setText("");
                                return;
                            }
                            f=(float)v1/v2;
                            txt.setText(String.valueOf(f));
                            reset();
                        }
                    }
                }
                else{
                    Toast.makeText(this,"Enter valid credentials",Toast.LENGTH_SHORT).show();
                    txt.setText("");
                    reset();
                }
                break;
        }
    }

    public void reset(){
        op='$';
        v1=-10000;
        s="";
        str="";
    }

}