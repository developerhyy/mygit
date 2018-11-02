package com.feicui.calculatedemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	// 声明控件
	EditText show;
	Button btn0;// 数字0控件
	Button btn1;// 数字1控件
	Button btn2;// 数字2控件
	Button btn3;// 数字3控件
	Button btn4;// 数字4控件
	Button btn5;// 数字5控件
	Button btn6;// 数字6控件
	Button btn7;// 数字7控件
	Button btn8;// 数字8控件
	Button btn9;// 数字9控件
	Button clear;// 清零控件
	Button point;// 符号点控件
	Button plus;// 加
	Button minus;// 减
	Button multi;// 乘
	Button divide;// 除
	Button del;// 删除
	Button equal;// 等于
	boolean clear_flag;// 清除标志

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件
		show = (EditText) findViewById(R.id.btn_et);
		btn0 = (Button) findViewById(R.id.btn_0);
		btn1 = (Button) findViewById(R.id.btn_1);
		btn2 = (Button) findViewById(R.id.btn_2);
		btn3 = (Button) findViewById(R.id.btn_3);
		btn4 = (Button) findViewById(R.id.btn_4);
		btn5 = (Button) findViewById(R.id.btn_5);
		btn6 = (Button) findViewById(R.id.btn_6);
		btn7 = (Button) findViewById(R.id.btn_7);
		btn8 = (Button) findViewById(R.id.btn_8);
		btn9 = (Button) findViewById(R.id.btn_9);
		clear = (Button) findViewById(R.id.clear);
		del = (Button) findViewById(R.id.del);
		point = (Button) findViewById(R.id.point);
		plus = (Button) findViewById(R.id.plus);
		minus = (Button) findViewById(R.id.minus);
		multi = (Button) findViewById(R.id.multi);
		divide = (Button) findViewById(R.id.divide);
		equal = (Button) findViewById(R.id.equal);
		// 设置控件点击监听功能
	}
	
	
	public void click(View v){
		switch (v.getId()) {
		 case R.id.btn_0:

		case R.id.btn_1:

		case R.id.btn_2:

		case R.id.btn_3:

		case R.id.btn_4:

		case R.id.btn_5:

		case R.id.btn_6:

		case R.id.btn_7:

		case R.id.btn_8:

		case R.id.btn_9:

		case R.id.point:
			
			break;
			
		case R.id.minus:
		case R.id.multi:
		case R.id.plus:
		case R.id.divide:	
			
			break;
			
		// 清零
		case R.id.clear:

		break;
		// 删除
		case R.id.del:
		break;
		default:
			break;
		}
		
		
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
		

		/*
		btn0.setOnClickListener(MainActivity.this);
		btn1.setOnClickListener(MainActivity.this);
		btn2.setOnClickListener(MainActivity.this);
		btn3.setOnClickListener(MainActivity.this);
		btn4.setOnClickListener(MainActivity.this);
		btn5.setOnClickListener(MainActivity.this);
		btn6.setOnClickListener(MainActivity.this);
		btn7.setOnClickListener(MainActivity.this);
		btn8.setOnClickListener(MainActivity.this);
		btn9.setOnClickListener(MainActivity.this);
		clear.setOnClickListener(MainActivity.this);
		del.setOnClickListener(MainActivity.this);
		point.setOnClickListener(MainActivity.this);
		equal.setOnClickListener(MainActivity.this);
		plus.setOnClickListener(MainActivity.this);
		minus.setOnClickListener(MainActivity.this);
		multi.setOnClickListener(MainActivity.this);
		divide.setOnClickListener(MainActivity.this);

	}
	public void onClick(View v) {

		String str = show.getText().toString();// 获取文本输入框的内容

		switch (v.getId()) {
		case R.id.btn_0:

		case R.id.btn_1:

		case R.id.btn_2:

		case R.id.btn_3:

		case R.id.btn_4:

		case R.id.btn_5:

		case R.id.btn_6:

		case R.id.btn_7:

		case R.id.btn_8:

		case R.id.btn_9:

		case R.id.point:
			if (clear_flag) {
				clear_flag = false;
				str = "";
				show.setText("");
			}
			if (show.getText() == null) {
				
			}
			show.setText(str + (((Button) v).getText()));
			break;
		// 加减乘除
		case R.id.minus:
		case R.id.multi:
		case R.id.plus:
		case R.id.divide:
			if (clear_flag) {
				clear_flag = false;
				str = "";
				show.setText("");
			}
			show.setText(str + " " + (((Button) v).getText()) + " ");

			break;
		// 清零
		case R.id.clear:
			clear_flag = false;
			str = "0";
			show.setText("0");

			break;
		// 删除
		case R.id.del:
			if (clear_flag) {
				clear_flag = false;
				str = "";
				show.setText("");
			} else if (str != null && !str.equals("")) {
				if(str.length() > 1){show.setText(str.substring(0, str.length() - 1));
				} else   {
						str = "0";
						show.setText("0");
					}
			}
			break;
		// 等于
		case R.id.equal:
			str = getResult();
			show.setText(str+" ");;
			break;
		default:
			break;
		}

	}

	private String getResult() {
		String exp = show.getText().toString();// 获取文本框的内容
		String s ="";
		if (clear_flag) {
			clear_flag = false;
			exp = "";
			show.setText("");
		}

		clear_flag = true;

		if (exp != null && !exp.equals("")) {
			String str1 = exp.substring(0, exp.indexOf(" "));// 获取第一个数
			String simple = exp.substring(exp.indexOf(" ") + 1,
					exp.indexOf(" ") + 2);
			String str2 = exp.substring(exp.indexOf(" ") + 3);// 获取第二个数
			double d1 ;
			if(str1==null || str1==""){
				 d1 = 0;
			} else{
				 d1 = Double.parseDouble(str1);
			}
			double d2 = Double.parseDouble(str2);

			double result = 0;

			if (simple.equals("+")) {
				result = d1 + d2;
			} else if (simple.equals("-")) {
				result = d1 - d2;
			} else if (simple.equals("*")) {
				result = d1 * d2;
			} else if (d2 != 0 && simple.equals("/")) {
				result = d1 / d2;
			} else {
				show.setText( "错误！");
			}
			 s= String.valueOf(result);
			
		}
		return s;

	}*/
}
