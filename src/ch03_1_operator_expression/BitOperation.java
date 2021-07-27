package ch03_1_operator_expression;

public class BitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int a = 9;
		int b = 11;
		
//		String str = "71";
//		int num = Integer.parseInt(str);
		
//		1001 -> 9
//		1011 -> 11
//	&   1001 -> 9    &(and)연산은 둘다 참 11 일때만 참이다 즉 1001 / a & b = 9
//	||	1011 -> 11
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("10진수: " + (a & b)); //and연산
		System.out.println("10진수 : " + (a | b)); //or연산
		
		System.out.println("3<<2: " + (3<<2)); //쉬프트연산
		                                       //왼쪽으로  2비트 옮겨라.
		System.out.println(1<<7);  // 1을 왼쪽으로 7비트만큼 옮겨라
		System.out.println(128>>5); // 128을 오른쪽으로 5칸 옮겨라
		
		
	}

}
