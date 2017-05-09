package com.example.bai4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	private Button btnFar,btnCel,btnClear;
	private EditText txtFar,txtCel;
	private OnClickListener myVarListener=new OnClickListener() {
		@Override
		public void onClick(View arg0) {
		//Lấy F và C từ control ở đây
		if(arg0==btnFar)
		{
		//Bạn xử lý chuyển đổi F–>C theo công thức
		}
		else if(arg0==btnCel)
		{
		//Bạn xử lý chuyển đổi C–>F theo công thức
		}
		else if(arg0==btnClear)
		{
		txtFar.setText("");
		txtCel.setText("");
		txtFar.requestFocus();
		}
		}
		};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFar = (Button)findViewById(R.id.btnFar);
        btnCel = (Button)findViewById(R.id.btnCel);
        btnClear = (Button)findViewById(R.id.btnClear);
        txtFar = (EditText)findViewById(R.id.txtFar);
        txtCel = (EditText)findViewById(R.id.txtCel);
        btnFar.setOnClickListener(myVarListener);
        btnCel.setOnClickListener(myVarListener);
        btnClear.setOnClickListener(myVarListener);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
