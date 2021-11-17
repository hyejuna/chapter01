package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i=1;
		int n=0;
		while(true) {
			n=6*i;
			if((n%14)==0) {
				break;
			}
			i++;
		}
		System.out.println(n);

	}

}
