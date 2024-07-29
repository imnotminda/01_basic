package basic;

import java.util.Random;

public class Variable3 {
	double b;

	public static void main(String[] args) {
		int big = Math.max(25, 36);
		System.out.println("큰 값 = " + big);
		
		//12.7, 78.5중에서 작은 값을 구하시오
		double small = Math.min(12.7, 78.5);
		System.out.println("작은값 = " + small);
		
		//2의 5승
		double power = Math.pow(2,5);
		System.out.println("2의 5승 = " + power);
		
		double b = new Random().nextDouble();
		System.out.println(b);
		
		double a = Math.random();
		int c = (int)(a * 100);
		System.out.println(c); // 0 ~ 99
		System.out.println(a);	
		
		// x ~ y 사이의 난수 발생 (int)(Math.random() * (y-x+1)) + x)
		int d = (int)(Math.random() * 26 + 65);
		System.out.println(d);
		
		char e = (char)(Math.random() * 26 + 65);
		System.out.println(e);
	
	}

}
