package p2022_12_29;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	���� = (���ǽ�) ?  ��1 :  ��2;
//	���ǽ��� ���̸� ��1�� ������ �Ҵ��ϰ�, 
//	���ǽ��� �����̸� ��2�� ������ �Ҵ��Ѵ�.
		
//Ű����� �Է��� ���� 2���߿��� �ִ밪�� �ּҰ��� ����ϴ� ���α׷�
		int n1,n2,n3,max,max1,min,min1;
		System.out.println("���� 3���� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); //spacebar or enter �� ����
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = (n1 > n2) ?n1 : n2;
		max1 = (max > n3) ? max: n3;
		min = (n1 < n2) ?n1 : n2;
		min1 = (min < n3)? min: n3;
		System.out.println("max:"+max1);
		System.out.println("min:"+min1);
		
	}

}
