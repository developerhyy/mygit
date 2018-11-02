package com.feicui.calculatedemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	// �����ؼ�
	EditText show;
	Button btn0;// ����0�ؼ�
	Button btn1;// ����1�ؼ�
	Button btn2;// ����2�ؼ�
	Button btn3;// ����3�ؼ�
	Button btn4;// ����4�ؼ�
	Button btn5;// ����5�ؼ�
	Button btn6;// ����6�ؼ�
	Button btn7;// ����7�ؼ�
	Button btn8;// ����8�ؼ�
	Button btn9;// ����9�ؼ�
	Button clear;// ����ؼ�
	Button point;// ���ŵ�ؼ�
	Button plus;// ��
	Button minus;// ��
	Button multi;// ��
	Button divide;// ��
	Button del;// ɾ��
	Button equal;// ����
	boolean clear_flag;// �����־

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ʵ�����ؼ�
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
		// ���ÿؼ������������
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
			
		// ����
		case R.id.clear:

		break;
		// ɾ��
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

		String str = show.getText().toString();// ��ȡ�ı�����������

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
		// �Ӽ��˳�
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
		// ����
		case R.id.clear:
			clear_flag = false;
			str = "0";
			show.setText("0");

			break;
		// ɾ��
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
		// ����
		case R.id.equal:
			str = getResult();
			show.setText(str+" ");;
			break;
		default:
			break;
		}

	}

	private String getResult() {
		String exp = show.getText().toString();// ��ȡ�ı��������
		String s ="";
		if (clear_flag) {
			clear_flag = false;
			exp = "";
			show.setText("");
		}

		clear_flag = true;

		if (exp != null && !exp.equals("")) {
			String str1 = exp.substring(0, exp.indexOf(" "));// ��ȡ��һ����
			String simple = exp.substring(exp.indexOf(" ") + 1,
					exp.indexOf(" ") + 2);
			String str2 = exp.substring(exp.indexOf(" ") + 3);// ��ȡ�ڶ�����
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
				show.setText( "����");
			}
			 s= String.valueOf(result);
			
		}
		return s;

	}*/
}
