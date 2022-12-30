package p2022_12_29;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	변수 = (조건식) ?  값1 :  값2;
//	조건식이 참이면 값1을 변수에 할당하고, 
//	조건식이 거짓이면 값2를 변수에 할당한다.
		
//키보드로 입력한 정수 2개중에서 최대값과 최소값을 출력하는 프로그램
		int n1,n2,n3,max,max1,min,min1;
		System.out.println("정수 3개를 입력하시오");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); //spacebar or enter 로 구분
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
