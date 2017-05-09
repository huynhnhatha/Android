package com.example.bai3;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
		Button btntinhBMI;
		EditText editTen,editchieucao,editcannang,editBMI,editChandoan;

		protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntinhBMI=(Button) findViewById(R.id.btntinhBMI);
        btntinhBMI.setOnClickListener((OnClickListener) this);
        editTen=(EditText) findViewById(R.id.editTen);
        editchieucao=(EditText) findViewById(R.id.editchieucao);
        editcannang=(EditText) findViewById(R.id.editcannang);
        editBMI=(EditText) findViewById(R.id.editBMI);
        editChandoan=(EditText) findViewById(R.id.editChandoan);

    }
    public void onClick(View arg0) {
    	double H=Double.parseDouble(editchieucao.getText()+ "");
    	double W=Double.parseDouble(editcannang.getText()+ "");
    	double BMI=W/Math.pow(H, 2);
    	String chandoan = "";
    	if(BMI<18)
    	{
    	chandoan="Bạn gầy";
    	}
    	else if(BMI<=24.9)
    	{
    	chandoan="Bạn bình thường";
    	}
    	else if(BMI<=29.9)
    	{
    	chandoan="Bạn béo phì độ 1";
    	}
    	else if(BMI<=34.9)
    	{
    	chandoan="Bạn béo phì độ 2";
    	}
    	else
    	{
    	chandoan="Bạn béo phì độ 3";
    	}
    	DecimalFormat dcf=new DecimalFormat("#.0");
    	editBMI.setText(dcf.format(BMI));
    	editChandoan.setText(chandoan);
    	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
