package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
/**
 * 요구사항 (기능 정의 )
 * <사용자 기능>
 * 1. 회원가입
 * 2. 마이페이지에서 회원가입정보를 보여달라고한다.
 * 3. 비번을 수정하는 기능
 * 4. 회원을 탈퇴 할수 있는 기능
 * *******************
 * 
 * <관리자기능>
 * 5. 회원 목록을 보여주는 기능
 * 6. 아이디 검색
 */
public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members = new MemberBean[3];
		count =0;
//		멤버회원수 체크하기 위해서 카운트 변수 사용
	}
	
	/**
	 * 1.회원가입 기능 
	 * 
	 */
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	/**
	 * 2.마이페이지
	 */
	public String getMyPage(MemberBean param) {
		String msg ="마이페이지";
		return param.toString();
	} 
	/**
	 * 3.비번수정
	 */
	public String changePassword(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		return msg;
	}
	/**
	 * 4.회원탈퇴
	 */
	public String withDraw(MemberBean param) {
		String msg = "회원탈퇴 되셨습니다";
		return msg;
	}
	/**
	 * 5.회원목록보기
	 */
	public String list() {
		String msg = "";
		for(int i=0;i<count;i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	}
	/**
	 * 6.아이디 검색(a를입력했으면 a의 정보를 보여줌)
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i =0;i<count;i++) {
			if(member.getId().equals(i)) {
				
			}
				
			}
		}
		return member;
	}
	
	
	
	
	
	
	
	
	
	
	
}
