package com.xiaoqi.plugin;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.qihoo360.replugin.RePlugin;

import java.lang.reflect.Field;

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
		Class<Context> contextClass = (Class<Context>) RePlugin.getHostContext().getApplicationContext().getClass();
		try {
			Field field = contextClass.getField("a");
			int a = field.getInt(RePlugin.getHostContext().getApplicationContext());
			mTv.setText("" + a);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
