package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		
		int[] intArray = new int[4];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 13;
		intArray[3] = 55;
		
		
		/*
		int[] intArray = new int[] {3,7,13};
		*/
		
		/*
		int[] intArray = {3,7,13};
		*/
		// System.out.println(intArray[1]);
		
		//intArray.length : 방 개수
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("===================");
		
		char[] charArray = new char[3];
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
		
		for(int i=0; i<3; i++) {
			System.out.println(charArray[i]);
		}
				

	}

}
