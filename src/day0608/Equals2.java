package day0608;

class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) { // 오버라이딩
//		return this == obj; 기본값
		if( !(obj instanceof Member)) return false;
		
		Member m = (Member)obj; // 강제 형변환
		return this.id == m.id;
		
//		if(id.equals(m.id)) {
//			return true;
//		} 
//		return false;
	}
}

public class Equals2 {
	public static void main(String[] args) {
		Member mem1 = new Member("blue");
		Member mem2 = new Member("blue");
		Member mem3 = new Member("red");
		
		if(mem1.equals(mem2)) {
			System.out.println("mem1과 mem2는 동일합니다.");
		} else {
			System.out.println("mem1과 mem2는 동일하지 않습니다.");
		}
		
		if(mem1.equals(mem3)) {
			System.out.println("mem1과 mem3은 동일합니다.");
		} else {
			System.out.println("mem1과 mem3은 동일하지 않습니다.");
		}
	}

}
