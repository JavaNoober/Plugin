package com.xiaoqi.plugin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.xiaoqi.replugindemo.MyApplication;

public class MainActivity extends AppCompatActivity {

	/**
	 * Hello World!
	 */
	private TextView mTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		mTv = (TextView) findViewById(R.id.tv);
		mTv.setText(MyApplication.a + "");
	}
}
