package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		
		String b = "apple";
		String c = "apple"; //또 다시 똑같은 문자열로 안잡음, b의 "apple"로 가르킴
		String d = new String("apple"); //새로운 String이기 때문에 새로 만듬
		
		System.out.println("b == c : " + (b == c ? "같다" : "다르다"));
		//System.out.println("a == c : " + (a == c ? "같다" : "다르다")); //Boolean과 String을 비교할 수 없음
		System.out.println("d == c : " + (d == c ? "같다" : "다르다")); //내포되있는 주소를 비교하는거기 때문에 다름
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다")); //문자열 자체를 비교
		System.out.println("b.equals(d) : " + (b.equals(d) ? "같다" : "다르다")); //문자열은 똑같은 글씨여서 같다고 나옴
		
		

	}

}
