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
//	&   1001 -> 9    &(and)������ �Ѵ� �� 11 �϶��� ���̴� �� 1001 / a & b = 9
//	||	1011 -> 11
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("10����: " + (a & b)); //and����
		System.out.println("10���� : " + (a | b)); //or����
		
		System.out.println("3<<2: " + (3<<2)); //����Ʈ����
		                                       //��������  2��Ʈ �Űܶ�.
		System.out.println(1<<7);  // 1�� �������� 7��Ʈ��ŭ �Űܶ�
		System.out.println(128>>5); // 128�� ���������� 5ĭ �Űܶ�
		
		
	}

}
