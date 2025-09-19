package ex03_14;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int divident;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오:");
		divident = scanner.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = scanner.nextInt();
		System.out.println(divident+"를 "+divisor+"로 나누면 몫은 "+divident/divisor + "입니다.");
		scanner.close();
	}

}
