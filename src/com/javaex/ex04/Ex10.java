package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("break;");
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("continue");
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
