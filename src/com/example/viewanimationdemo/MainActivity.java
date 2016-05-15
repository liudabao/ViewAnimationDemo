package com.example.viewanimationdemo;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}
	
	private void initView(){

		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn4=(Button)findViewById(R.id.button4);
		btn5=(Button)findViewById(R.id.button5);
		
		iv=(ImageView)findViewById(R.id.imageView1);

		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlphaAnimation alphaAnimation=(AlphaAnimation) AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
				iv.startAnimation(alphaAnimation);
			}
		});
		

		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ScaleAnimation scaleAnimation=(ScaleAnimation)AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
				iv.startAnimation(scaleAnimation);
			}
		});
		
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TranslateAnimation translateAnimation=(TranslateAnimation)AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
				iv.startAnimation(translateAnimation);
			}
		});
 
        btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RotateAnimation rotateAnimation=(RotateAnimation)AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
				iv.startAnimation(rotateAnimation);
			}
		});
        

        btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RotateAnimation rotateAnimation=(RotateAnimation)AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
				iv.startAnimation(rotateAnimation);
			}
		});

        btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation=(Animation)AnimationUtils.loadAnimation(MainActivity.this, R.anim.set);
				iv.startAnimation(animation);
			}
		});
		
	}
}
