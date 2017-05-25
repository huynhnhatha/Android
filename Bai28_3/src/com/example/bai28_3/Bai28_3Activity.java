package com.example.bai28_3;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Bai28_3Activity extends Activity {
	Button btnread,btnwrite;
	 EditText editdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai28_3);
        btnread=(Button)findViewById(R.id.btnR);
        btnwrite=(Button)findViewById(R.id.btnW);
        editdata=(EditText)findViewById(R.id.editDT);
        btnread.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				readData();
			}
        	
        });
        btnwrite.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				writeData();
			}
        	
        });
    }
    public void readData()
    {
    String sdcard=Environment.getExternalStorageDirectory().getAbsolutePath()+"/myfile.txt";
    try {
    Scanner scan=new Scanner(new File(sdcard));
    String data="";
    while(scan.hasNext())
    {
    data+=scan.nextLine()+"\n";
    }
    scan.close();
    editdata.setText(data+"");
    } catch (FileNotFoundException e) {
    e.printStackTrace();
    }
    }
    public void writeData()
    {
    String sdcard=Environment
    .getExternalStorageDirectory()
    .getAbsolutePath()+"/myfile.txt";
    try {
    OutputStreamWriter writer=
    new OutputStreamWriter(
    new FileOutputStream(sdcard));
    writer.write(editdata.getText()+"");
    writer.close();
    } catch (FileNotFoundException e) {
    e.printStackTrace();
    } catch (IOException e) {
    e.printStackTrace();
    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bai28_3, menu);
        return true;
    }
    
}
