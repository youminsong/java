package week02;

import java.util.Scanner;

public class p4 {
	
	public static void main(String[] args) {
		
		int x;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			 System.out.printf("실수를 입력해주세요: ");
		x = sc.nextInt();
		
		if (x == -1)
		{
			System.out.printf("%d\n",x+y);
			
		}
		else
		{
			x = x + y;
			y = x;
			continue;
		}
		
	}
}
}