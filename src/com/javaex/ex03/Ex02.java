package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int num = sc.nextInt();
		
		if(num>=60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("프로그램종료");
		sc.close();

	}

}
