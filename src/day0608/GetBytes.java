package day0608;

import java.io.UnsupportedEncodingException;

public class GetBytes {
	public static void main(String[] args) {

		// getBytes()메서드 : 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴함
		
		// 사용방법
		// byte[] bytes1 = "문자열".getBytes(); 
		// byte[] bytes2 = "문자열".getBytes(Charset charset);
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("byte1.length : " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		
		try {
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("byte2.length : " + bytes2.length);
			
			String str2 = new String(bytes2);
			System.out.println("bytes2 -> String : " + str2);
			
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("byte3.length : " + bytes3.length);
			
			String str3 = new String(bytes3);
			System.out.println("bytes2 -> String : " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
