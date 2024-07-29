package basic;

public class Variable {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println(a);
		
		char b = 'A';
		System.out.println(b); //A
		
		char c = 65;
		System.out.println(c); //A (ASCii 'A' = 65)
		
		//byte d = 300; - error (byte = -128 ~ 127)
		
		int e = 65;
		System.out.println(e);
		
		int f = 'A';
		System.out.println(f);
		
		long g = 25l; //long
		
		//float h = 43.8; -error (cannot convert double to float)
		
		// Method 1
		float h = 43.8f; // double to float
		// Method 2
		//float h = (float)43.8; // Casting**
		System.out.println(h);
	}

}
