package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//논리 연산자
		int a=5;
		int b=7;
		
		//논리연산자 &&
		System.out.println("&&연산자");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("&&연산자 응용");
		System.out.println(a>b &&  a<b);
		System.out.println(a>b &&  a>b);
		
		//논리연산자 ||
		System.out.println("||연산자");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("||연산자 응용");
		System.out.println(a>b ||  a<b);
		System.out.println(a>b ||  a>b);
		
		//논리연산자!
		System.out.println("!연산자");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a>b);
		System.out.println(!(a>b));
		
	
	}

}
