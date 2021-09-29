package ch09;

import java.util.ArrayList;

public class _04_MemberArrayList {

	private ArrayList<_04_Member> arrayList;  // ArrayList 선언  // 객체형의 자료형이 들어가기때문에 <>에 들어갈 자료형을 넣는다
	//Member(자료형)이라는 회원정보를 넣는다.
	public _04_MemberArrayList() {  //생성할때 만들거다.
		arrayList = new ArrayList<_04_Member>();  // Member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(_04_Member member) {   //주소값 전달 call by reference
		arrayList.add(member);        //회원정보를 담는
	}
	
	//회원삭제 메서드
	public boolean removeMember(int memberID) {
		for(int i = 0; i<arrayList.size(); i++) {
			_04_Member member = arrayList.get(i);
			int tempId = member.getMemberID();
			if(tempId == memberID) { // 1004삭제
				arrayList.remove(i);  //삭제
				return true;   // 삭제 성공 후 함수 종료 = 삭제를 했으니 사라져라.
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false; // 함수 종료 
		
	}
	
	
	// 전체 회원출력 메서드
	public void showAllMember() {
		for( _04_Member member : arrayList) {
			System.out.println(member);  // member.toString(); 동일하다.
		}
	}
	
}
