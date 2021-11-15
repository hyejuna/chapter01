package com.javaex.ex01;

public class Ex06 {
	//원칙적으로 사칙연산은 같은 자료형끼리만 됨 (결과도 같은 자료형) 자유형변환으로 계산 되는 것
	public static void main(String[] args) {
		
		double v01 = 5/4;  // 정수 나누기 정수 는 정수
		System.out.println(v01);
		
		double v02 = (double)5/4; // 실수 나누기 정수 는 실수 (정수를 실수로 자동형변환)
		System.out.println(v02);
		
		double v03 = 5/(double)4; // 정수 나누기 실수 는 실수
		System.out.println(v03);
		
		double v04=(double)5/(double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3+(int)1.8;
		System.out.println(v05);
		
		int v06=(int)(1.3+1.8);
		System.out.println(v06);
		
		
	}

}
