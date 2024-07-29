package basic;

public class Variable2 {
	int a; // Instance variable (필드)
	static int b; // Class Variable (클래스 변수)
	static String c;
	
	public static void main(String[] args) {
		int a = 100; // Local variable (지역변수)
		System.out.println(a); // Prints the value of local variable 'a'
		
		//int a; - error (cannot use same variable because already declared)
		
		System.out.println("필드 b = " + b); // Accessing class variable 'b'
		System.out.println("필드 a = " + a); // Accessing local variable 'a'
		System.out.println("필드 a = " + new Variable2().a); // Accessing instance variable 'a' using object
		System.err.println("필드 b = " + Variable2.b); // Accessing class variable 'b' using class name
		c = "apple"; // 리터럴 생성 (스트링 클래스만 가능)
		System.err.println("필드 c = " + c);
	}

}
