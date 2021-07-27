package ch03_1_operator_expression;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		result += 10; // result + 10 이랑 똑같은말임
		System.out.println("result=" + result);
		
		result += 10;
		System.out.println("result=" + result);
		
		result -= -5;
		System.out.println("result=" + result);
		
		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5;
		System.out.println("result=" + result);
		
		result %= 3;
		System.out.println("result=" + result);
		
	}

}
