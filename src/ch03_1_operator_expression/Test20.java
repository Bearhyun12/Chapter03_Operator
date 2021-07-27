package ch03_1_operator_expression;

public class Test20 {

	public static void main(String[] args) {
	
      int num1 = 0, num2 = 0;
      boolean result;
//       num1 += 10
//       num1 = num1 + 10 라는뜻
        result = ((num1 += 10) < 0 && (num2 += 10) > 0); // and연산에서 앞부분이 false 니까 뒤에 계산자체를 안함 그래서 0
		System.out.printf("num1=%d, num2=%d\n", num1, num2);

		//		현재 num1 = 10, num2 = 0 인 상태 
		result = ((num1 += 10) > 0 ||(num2 += 10) > 0); // or연산은 하나가 true이면 어차피 참이라 뒤에를 계산안함 그러므로 0
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
		
	}

}
