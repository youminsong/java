package week02;

import java.util.Scanner;

public class p5 {
	
	public static void main(String[] args) {
		
		int a, s =2;
		int e;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("������ �Է����ּ���: ");
		a = sc.nextInt();
		e = a-1;
		while (true)
	    {
	        if (s <= e) 
	        {
	            if (a % s == 0) 
	            {
	            	System.out.printf("�Ҽ��ƴ�");
	                break;
	            }
	            else {
	                s++;
	            }
	        }
	        else {
	        	System.out.printf("�Ҽ�");
	            break;
	        }
	    }
	}
}