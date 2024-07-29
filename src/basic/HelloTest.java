package basic;

public class HelloTest {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println();
		
		System.out.println('A' + 32);
		System.out.println((char)('A' + 32));
		System.out.println(2 + 3);
		System.out.println('2' + '3'); //101
		System.out.println();
		
		System.out.println(('2' + '3' - 1) / 20); //5
		System.out.println('2' - 48 + '3' - 48); //5
		System.out.println();
		
		System.out.println("2" + "3"); //23
		
		System.out.println();
		System.out.println(	Integer.parseInt("2") + Integer.parseInt("3")); //5
		
		System.out.println();
		System.out.println("12.5" + "36.8"); //12.536.8
		
		System.out.println();
		System.out.println(Double.parseDouble("12.5") + Double.parseDouble("36.8")); //49.3
	

	}

}
