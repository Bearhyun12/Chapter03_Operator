package ch03_1_operator_expression;

public class ConditionlOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.printf("%d ����  %c ����Դϴ�.\n", score, grade);
		
		
	}

}
