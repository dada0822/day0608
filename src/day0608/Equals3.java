package day0608;

import java.util.Scanner;

public class Equals3 {
	public static void main(String[] args) {
		String id = "green"; //  String > 참조형 변수 > 주소 저장
		String pw = "1234";
		
//		System.out.println(id == "green");
//		System.out.println(id.equals("green")); // 주소 비교
		
		/* 사용자에게 id와 pw를 입력받아
		 * 모두 동일하게 입력하면 '로그인 성공'
		 * 아니면 '로그인 실패'로 표시하기 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("id > ");
		String user_id = s.next();
		System.out.print("pw > ");
		String user_pw = s.next();
		
		if(id.equals(user_id) && pw.equals(user_pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		s.close();
	}

}
