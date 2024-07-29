package basic;

import java.text.DecimalFormat;

public class Compute {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println();
		
		int sub = a - b;
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println();
		
		int mul = a * b;
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println();
		
		double div = (double)a / b; //casting
		
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div)); // (static)
		
		System.out.println();
		
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul)); // (not static)
	
	}

}

/*
[문제] 변수를 이용하여 320(a), 258(b)의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오

[실행결과]
320 + 258 = xxx
*/