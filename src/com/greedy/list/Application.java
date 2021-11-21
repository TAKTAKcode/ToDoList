package com.greedy.list;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/* 내가 할 일들을 쭉 적어서 랜덤(난수)를 이용해서 하나씩 뽑는것
		 *  */
		
		Scanner sc = new Scanner(System.in);
		myWork toDo = new myWork();
		
		int num;
		
		do {
			System.out.println("랜덤으로 내가 할 일을 뽑아보자. ");
			System.out.println("==================");
			System.out.println("내가 할 일 뽑기");
			System.out.println("내가 할 일 뽑기");
			System.out.println("내가 할 일 뽑기");
			System.out.println("내가 할 일 뽑기");
			System.out.println("==================");
			System.out.print("1번을 입력하세요 : ");
			num = sc.nextInt();
			
			
			switch(num) {
			case 1 : toDo.work();
						break;
			
			default :
				System.out.println();
				System.out.println("잘못된 값을 입력했습니다.");
				System.out.println();
						
			
			}
			
			
		} while(true);
		
		
		
		
		
	}

}
