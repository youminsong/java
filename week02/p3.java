package week02;

import java.util.Scanner;

//3) �Ǽ��� �Է¹޾� �����κа� �Ҽ��κ��� ���� ����Ͻÿ� ex) input: 4.52 / output : 4   0.52
/*#include<stdio.h>

int main(void)
{
	float input;

	printf("�Ǽ��� �Է����ּ���.: ");
	scanf_s("%f", &input);

	printf("�����κ�: %d\n",(int)input);
	printf("�Ҽ��κ�: %f\n", (float)input - (int)input);

	return 0;

}*/
public class p3 {

	public static void main(String[] args) {
		
		float input;
		
		System.out.print("�Ǽ��� �Է����ּ���: ");
		Scanner sc = new Scanner(System.in);
	    input = sc.nextFloat();
	    
	    
	   System.out.printf("�����κ�: %d\n",(int)input);
	   System.out.printf("�Ҽ��κ�: %.2f\n", (float)input - (int)input);

	}

}
