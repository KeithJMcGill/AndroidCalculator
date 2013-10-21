package com.keithjmcgill.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	String input = "";
	double answer = 0;
	Button add, subtract, divide, multiply;
	Button zero, one, two, three, four, five, six, seven, eight, nine;
	Button clear, leftpar, rightpar, decimal, equal;
	TextView display;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		answer = 0;
		
		add = (Button) findViewById(R.id.button17);
		add.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "+";
				display.setText(input);
			}
		});
		
		subtract = (Button) findViewById(R.id.button15);
		subtract.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "-";
				display.setText(input);
			}
		});
		
		divide = (Button) findViewById(R.id.button11);
		divide.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "/";
				display.setText(input);
			}
		});
		
		multiply = (Button) findViewById(R.id.button13);
		multiply.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "*";
				display.setText(input);
			}
		});
		
		zero = (Button) findViewById(R.id.button1);
		zero.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "0";
				display.setText(input);
			}
		});
		
		one = (Button) findViewById(R.id.button3);
		one.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "1";
				display.setText(input);
			}
		});
		
		two = (Button) findViewById(R.id.button4);
		two.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "2";
				display.setText(input);
			}
		});
		
		three = (Button) findViewById(R.id.button14);
		three.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "3";
				display.setText(input);
			}
		});
		
		four = (Button) findViewById(R.id.button5);
		four.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "4";
				display.setText(input);
			}
		});
		
		five = (Button) findViewById(R.id.button6);
		five.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "5";
				display.setText(input);
			}
		});
		
		six = (Button) findViewById(R.id.button16);
		six.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "6";
				display.setText(input);
			}
		});
		
		seven = (Button) findViewById(R.id.button7);
		seven.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "7";
				display.setText(input);
			}
		});
		
		eight = (Button) findViewById(R.id.button8);
		eight.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "8";
				display.setText(input);
			}
		});
		
		nine = (Button) findViewById(R.id.button18);
		nine.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "9";
				display.setText(input);
			}
		});
		
		clear = (Button) findViewById(R.id.button9);
		clear.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input = "";
				display.setText(input);
			}
		});
		
		leftpar = (Button) findViewById(R.id.button20);
		leftpar.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += "(";
				display.setText(input);
			}
		});
		
		rightpar = (Button) findViewById(R.id.button19);
		rightpar.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += ")";
				display.setText(input);
			}
		});
		
		decimal = (Button) findViewById(R.id.button2);
		decimal.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input += ".";
				display.setText(input);
			}
		});
		
		equal = (Button) findViewById(R.id.button12);
		equal.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int stackSize = 0;
				String postfix = "";
				
				stackSize = input.length();
				Stack infixStack = new Stack(stackSize);
				postfix = infixStack.getPostfix(input);
				Stack postfixStack = new Stack(stackSize);
				answer = postfixStack.getResult(postfix);
				String input = Double.toString(answer);
				display.setText(input);
			}
		});
		
		display = (TextView) findViewById(R.id.tvDisplay);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
