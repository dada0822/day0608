package day0608;

public class IndexOf2 {
	public static void emailTest(String str) {
		
//		if(str.indexOf("@") != -1 && str.indexOf(".") != -1) {
//			System.out.println("올바른 이메일 형식");
//		} else {
//			System.out.println("이메일 형식이 잘못되었습니다.");
//		}
		
		int at = str.indexOf("@");
		int dot = str.indexOf(".");
		
		if(at != -1 && dot != -1 && at<dot) {
			System.out.println("ok!");
		} else {
			System.out.println("다시!");
		}
	}
	
	public static void main(String[] args) {
		// 입력받은 값이 메일 주소가 맞는지 확인하는 메서드
		// 1. 반드시 '@'가 있어야 함
		// 2. 반드시 '.'이 있어야 함
		// 3. '@'는 '.'보다 먼저 나와야 함
		
		String email1 = "test@naver.com";
		String email2 = "testnaver.com";
		String email3 = "test@navercom";
		String email4 = "test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);
	}
}
