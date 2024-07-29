package homework;

public class SungJuk {

	public static void main(String[] args) {

/* 
[문제] 
성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
평균의 소수이하 3째자리까지 출력

[실행결과]
 *** L 성적표 ***
국어 영어 수학 총점 평균
85 90 100 xxx xx.xxx
*/
		char name = 'L'; // ' ' is used for single characters, " " is used for a String
		int kor = 85;
		int eng = 90;
		int math = 100;
		int tot = kor + eng + math;
		double avg = tot / 3.0; /// Need one operand (값) as a "double" (EX: 3.0) to get a floating-point result
		//String avg = String.format("%.3f", (double)tot / 3);
		
		System.out.println("\t *** " + name + " 성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("85\t90\t100 " + "\t" + tot + "\t" + String.format("%.3f", avg));
	
	}

}
