package com.KoreaIT.java.BasicAM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (true) {
			System.out.printf("명령어를 입력하세요 : ");
			String command = sc.nextLine();

			if (command.equals("article write")) {
				count++;
				System.out.printf("제목 :");
				String command1 = sc.nextLine();
				System.out.printf("내용 :");
				String command2 = sc.nextLine();
				System.out.printf("%d번글이 생성되었습니다.\n", count);
				
			} 
			else if (command.equals("article list")) 
			{
				if(count!=0)
				{
					System.out.printf("%d개의 게시글이 존재합니다.\n", count);
				}
				else {
					System.out.println("게시글이 없습니다.");	
				}
			} 
			else if (command.equals("system exit")) 
			{
				break;
			} 
			else {
				System.out.println("존재하지 않는 명령어입니다.");
			}

		}

		System.out.println("==프로그램 끝==");

		sc.close();
	}

}
