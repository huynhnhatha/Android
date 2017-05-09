package com.example.bai1;

import android.app.Activity;
import android.os.Bundle;
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

    public void btn_tong2so(View v)
    {
    	EditText edita=(EditText)
    			findViewById(R.id.editsoa);
    	int a=Integer.parseInt(edita.getText()+"");
    	EditText editb=(EditText) findViewById(R.id.editsob);
    	int b=Integer.parseInt(edita.getText()+"");
    	TextView txtkq =(TextView) findViewById(R.id.txtkq);
    	txtkq.setText((a+b)+"");
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
