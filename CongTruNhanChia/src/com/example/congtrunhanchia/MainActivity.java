package com.example.congtrunhanchia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_Tong2so(View v){
    	EditText edita=(EditText) findViewById(R.id.edittexta);
    	int a=Integer.parseInt(edita.getText()+"");
    	EditText editb=(EditText) findViewById(R.id.edittextb);
    	int b=Integer.parseInt(editb.getText()+"");
    	TextView txtkq=(TextView) findViewById(R.id.txtkq);
    	txtkq.setText((a+b)+"");
    }
    public void btn_Hieu2so(View v){
    	EditText edita=(EditText) findViewById(R.id.edittexta);
    	int a=Integer.parseInt(edita.getText()+"");
    	EditText editb=(EditText) findViewById(R.id.edittextb);
    	int b=Integer.parseInt(editb.getText()+"");
    	TextView txtkq=(TextView) findViewById(R.id.txtkq);
    	txtkq.setText((a-b)+"");
    }
    public void btn_Tich2so(View v){
    	EditText edita=(EditText) findViewById(R.id.edittexta);
    	float a=Float.parseFloat(edita.getText()+"");
    	EditText editb=(EditText) findViewById(R.id.edittextb);
    	float b=Float.parseFloat(editb.getText()+"");
    	TextView txtkq=(TextView) findViewById(R.id.txtkq);
    	txtkq.setText((a*b)+"");
    }
    public void btn_Thuong2so(View v){
    	EditText edita=(EditText) findViewById(R.id.edittexta);
    	float a=Float.parseFloat(edita.getText()+"");
    	EditText editb=(EditText) findViewById(R.id.edittextb);
    	float b=Float.parseFloat(editb.getText()+"");
    	TextView txtkq=(TextView) findViewById(R.id.txtkq);
    	txtkq.setText((a/b)+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
