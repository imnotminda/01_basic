package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		
/* [문제] 
동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
- Scanner를 이용하시오
- 연산자 / % 이용하시오
*/
		Scanner scan = new Scanner(System.in);
		System.out.print("현금 입력 : ");
		int cash = scan.nextInt();
		
		int cheon = cash / 1000;
		int rem1 = cash % 1000;
		int baek = rem1 / 100;
		int rem2 = rem1 % 100;
		int ship = rem2 / 10;
		int il = rem2 % 10;

		System.out.println("천원 : " + cheon + "장");
		System.out.println("백원 : " + baek + "개");
		System.out.println("십원 : " + ship + "개");
		System.out.println("일원 : " + il + "개");
	}

}
