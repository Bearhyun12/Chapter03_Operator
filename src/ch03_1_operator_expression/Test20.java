package ch03_1_operator_expression;

public class Test20 {

	public static void main(String[] args) {
	
      int num1 = 0, num2 = 0;
      boolean result;
//       num1 += 10
//       num1 = num1 + 10 ��¶�
        result = ((num1 += 10) < 0 && (num2 += 10) > 0); // and���꿡�� �պκ��� false �ϱ� �ڿ� �����ü�� ���� �׷��� 0
		System.out.printf("num1=%d, num2=%d\n", num1, num2);

		//		���� num1 = 10, num2 = 0 �� ���� 
		result = ((num1 += 10) > 0 ||(num2 += 10) > 0); // or������ �ϳ��� true�̸� ������ ���̶� �ڿ��� ������ �׷��Ƿ� 0
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
		
	}

}
