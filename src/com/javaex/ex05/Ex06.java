package com.javaex.ex05;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] leftArr = new int[] {10,15,20};
		int[] rightArr = new int[] {10,20,30};
		
		if(leftArr.length == rightArr.length) {
			
			for(int i=0; i<leftArr.length; i++) {
				
				if(leftArr[i]!=rightArr[i]) {
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		}else {
			System.out.println("배열의 크기가 다릅니다.");
		}
	}

}
