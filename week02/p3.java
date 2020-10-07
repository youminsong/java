package week02;

import java.util.Scanner;

//3) 실수를 입력받아 정수부분과 소수부분을 따로 출력하시오 ex) input: 4.52 / output : 4   0.52
/*#include<stdio.h>

int main(void)
{
	float input;

	printf("실수를 입력해주세요.: ");
	scanf_s("%f", &input);

	printf("정수부분: %d\n",(int)input);
	printf("소수부분: %f\n", (float)input - (int)input);

	return 0;

}*/
public class p3 {

	public static void main(String[] args) {
		
		float input;
		
		System.out.print("실수를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
	    input = sc.nextFloat();
	    
	    
	   System.out.printf("정수부분: %d\n",(int)input);
	   System.out.printf("소수부분: %.2f\n", (float)input - (int)input);

	}

}
