package operator;

public class Operator03 {

	public static void main(String[] args) {
		int a=5;
		a += 2;// a=a+2
		a *= 3;// a=a*3
		
		System.out.println("a=" + a);// a=21
		
		a++;
		System.out.println("a=" + a);// a=22
		
		int b = a++;
		System.out.println("b=" + b);// b=22
		System.out.println("a=" + a);// a=23
		
		int c = ++a - b--; 
		System.out.println("c=" + c);// c=2
		System.out.println("b=" + b);// b=21
		System.out.println("a=" + a);// a=24
		
		System.out.println("a++ = " + a++);//a=24
        System.out.println("a = " + a); //a=25
	}

}
