package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String command;
		Scanner scanner = new Scanner(System.in);
		
		String article1_title;
		String article1_body;
		int article1_id;
		String article2_title;
		String article2_body;
		int article2_id;
		int lastArticleId = 0;

		while (true) {
			System.out.printf("명령어 : ");
			command = scanner.nextLine();

			if (command.equals("article add")) {
				System.out.println("==게시물 등록==");
				int id = lastArticleId + 1;
				System.out.printf("제목 : ");
				String title = scanner.nextLine();
				System.out.printf("내용 : ");
				String body = scanner.nextLine();

				System.out.println("==생성된 게시물 정보==");
				System.out.printf("번호 : %d\n", id);
				System.out.printf("제목 : %s\n", title);
				System.out.printf("내용 : %s\n", body);
				System.out.println("---------------------");
				lastArticleId = id;
			} else if (command.equals("article list")) {
				System.out.println("==게시물 리스트==");
				if ( lastArticleId == 0 ) {
					System.out.println("등록된 게시물이 없습니다.");
					continue;
				}
				System.out.printf("%d개의 게시물이 있습니다.\n", lastArticleId);
			} else if (command.equals("exit")) {
				break;
			} else {
				System.out.println("==존재하지 않는 명령어");
			}
		}

		scanner.close();
	}
}